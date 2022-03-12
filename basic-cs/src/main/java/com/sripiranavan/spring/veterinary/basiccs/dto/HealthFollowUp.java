package com.sripiranavan.spring.veterinary.basiccs.dto;

public class HealthFollowUp {

    private Long id;
    private String type;
    private String description;
    private String remarks;
    private Dog healthFollowUpDog;

    public HealthFollowUp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Dog getHealthFollowUpDog() {
        return healthFollowUpDog;
    }

    public void setHealthFollowUpDog(Dog healthFollowUpDog) {
        this.healthFollowUpDog = healthFollowUpDog;
    }

}
