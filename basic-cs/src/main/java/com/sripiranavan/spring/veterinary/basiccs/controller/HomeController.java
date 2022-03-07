package com.sripiranavan.spring.veterinary.basiccs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class HomeController {
    private final WebClient webClient;
    private final String k9BaseUrl;

    public HomeController(WebClient webClient,@Value("${k9.base-url}") String k9BaseUrl) {
        this.webClient = webClient;
        this.k9BaseUrl = k9BaseUrl;
    }

    @GetMapping(value = "/k9")
    public List<String> showNames(@RegisteredOAuth2AuthorizedClient("k9-client-authorization-code")OAuth2AuthorizedClient authorizedClient){
        return this.webClient.get()
                .uri(this.k9BaseUrl)
                .attributes(oauth2AuthorizedClient(authorizedClient))
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }
}
