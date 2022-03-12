package com.sripiranavan.spring.veterinary.basiccs.dto;

public class WoundTreatment {
    private Long id;
    private String woundType;
    private String treatment;
    private String recoveredPeriod;
    private Dog dog;

    public WoundTreatment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWoundType() {
        return woundType;
    }

    public void setWoundType(String woundType) {
        this.woundType = woundType;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getRecoveredPeriod() {
        return recoveredPeriod;
    }

    public void setRecoveredPeriod(String recoveredPeriod) {
        this.recoveredPeriod = recoveredPeriod;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
