package com.sripiranavan.spring.veterinary.basiccs.dto;

public class DogsHandlersHistory {

    private Long id;
    private String startDate;
    private String endDate;
    private boolean isActive = false;
    private Dog dogHistory;
    private DogHandler handlerHistory;

    public DogsHandlersHistory() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Dog getDogHistory() {
        return dogHistory;
    }

    public void setDogHistory(Dog dogHistory) {
        this.dogHistory = dogHistory;
    }

    public DogHandler getHandlerHistory() {
        return handlerHistory;
    }

    public void setHandlerHistory(DogHandler handlerHistory) {
        this.handlerHistory = handlerHistory;
    }

}
