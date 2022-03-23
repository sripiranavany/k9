package com.sripiranavan.spring.veterinary.basiccs.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sripiranavan.spring.veterinary.basiccs.dto.Dog;
import com.sripiranavan.spring.veterinary.basiccs.dto.Page;
import com.sripiranavan.spring.veterinary.basiccs.dto.RestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
@RequestMapping("/dogs")
public class DogController {
    private final WebClient webClient;
    private final String k9BaseUrl;
    private final RestTemplate restTemplate;

    private static Logger logger = Logger.getLogger(DogController.class.getName());

    private final ObjectMapper mapper = new ObjectMapper();

    public DogController(WebClient webClient, @Value("${k9.base-url}") String k9BaseUrl, RestTemplate restTemplate) {
        this.webClient = webClient;
        this.k9BaseUrl = k9BaseUrl;
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/k9")
    public List<String> showNames(@RegisteredOAuth2AuthorizedClient("k9-client-authorization-code")OAuth2AuthorizedClient authorizedClient){
        return this.webClient.get()
                .uri(this.k9BaseUrl+"/dogs/k9")
                .attributes(oauth2AuthorizedClient(authorizedClient))
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }

//    @GetMapping(value = "/all")
//    public RestResponse<Dog> showAllDogs() throws JsonProcessingException {
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//        String rawJsonResponse = this.restTemplate.getForObject(this.k9BaseUrl+"/dogs",String.class);
//        RestResponse<Dog> response = mapper.readValue(
//                rawJsonResponse,
//                mapper.getTypeFactory().constructParametricType(
//                        RestResponse.class,
//                        Dog.class
//                )
//        );
//        return response;
//    }
    @GetMapping(value = "/all")
    public ModelAndView showAllDogs(@RegisteredOAuth2AuthorizedClient("k9-client-authorization-code")OAuth2AuthorizedClient authorizedClient) throws JsonProcessingException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        String rawJsonResponse = this.restTemplate.getForObject(this.k9BaseUrl+"/dogs",String.class);
        RestResponse<Dog> response = mapper.readValue(
                rawJsonResponse,
                mapper.getTypeFactory().constructParametricType(
                        RestResponse.class,
                        Dog.class
                )
        );
        List<Dog> dogs = response.getContent();
        Page page = response.getPage();
        ModelAndView mav = new ModelAndView("dog/view");
        mav.addObject("dogs",dogs);
        mav.addObject("page",page);
        return mav;
    }

    @GetMapping(value = "/{dogId}")
    public ModelAndView showDogById(@RegisteredOAuth2AuthorizedClient("k9-client-authorization-code")OAuth2AuthorizedClient authorizedClient, @PathVariable Long dogId) throws JsonProcessingException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        String rawJsonResponse = this.restTemplate.getForObject(this.k9BaseUrl+"/dogs/"+dogId,String.class);
        Dog dog = mapper.readValue(rawJsonResponse,Dog.class);
        ModelAndView mav = new ModelAndView("dog/index");
        mav.addObject("dog",dog);
        return mav;
    }
}
