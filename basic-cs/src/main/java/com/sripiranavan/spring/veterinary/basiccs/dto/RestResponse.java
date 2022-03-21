package com.sripiranavan.spring.veterinary.basiccs.dto;

import java.util.List;

public class RestResponse<T> {
    private Page page;
    private List<T> content;

    public RestResponse(){}

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
