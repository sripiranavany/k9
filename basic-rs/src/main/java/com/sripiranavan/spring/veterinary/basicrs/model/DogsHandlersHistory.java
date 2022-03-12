package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;

@Entity
public class DogsHandlersHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String endDate;

    @Column(nullable = false)
    private boolean isActive = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dog_id")
    private Dog dogHistory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "handler_id")
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

    @Override
    public String toString() {
        return "DogsHandlersHistory{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", isActive=" + isActive +
                ", dogHistory=" + dogHistory +
                ", handlerHistory=" + handlerHistory +
                '}';
    }
}
