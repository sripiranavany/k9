package com.sripiranavan.spring.veterinary.basiccs.dto;

import java.util.Date;
import java.util.List;

public class Dog {

    private Long id;
    private String name;
    private String breed;
    private String color;
    private Date birthDate;
    private String cost;
    private String gender;
    private String typeOfPurchase;
    private String purchaseFrom;
    private Date purchaseDate;
    private Date normalTrainingFrom;
    private Date normalTrainingTo;
    private String normalTrainingPlace;
    private String specialTrainingCategory;
    private Date specialTrainingFrom;
    private Date specialTrainingTo;
    private String specialTrainingPlace;
    private String dogGrade;
    private String locatedAfterTraining;
    private String performanceAtWork;
    private boolean isRetired = false;
    private Date retiredDate;
    private String retiredReason;
    private boolean isDeath = false;
    private Date deathDate;
    private String deathReason;

    private List<WoundTreatment> woundTreatments;
    private List<Vaccine> vaccines;
    private List<HealthFollowUp> healthFollowUps;
    private List<DogsHandlersHistory> dogsHandlersHistories;

    public Dog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTypeOfPurchase() {
        return typeOfPurchase;
    }

    public void setTypeOfPurchase(String typeOfPurchase) {
        this.typeOfPurchase = typeOfPurchase;
    }

    public String getPurchaseFrom() {
        return purchaseFrom;
    }

    public void setPurchaseFrom(String purchaseFrom) {
        this.purchaseFrom = purchaseFrom;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getNormalTrainingFrom() {
        return normalTrainingFrom;
    }

    public void setNormalTrainingFrom(Date normalTrainingFrom) {
        this.normalTrainingFrom = normalTrainingFrom;
    }

    public Date getNormalTrainingTo() {
        return normalTrainingTo;
    }

    public void setNormalTrainingTo(Date normalTrainingTo) {
        this.normalTrainingTo = normalTrainingTo;
    }

    public String getNormalTrainingPlace() {
        return normalTrainingPlace;
    }

    public void setNormalTrainingPlace(String normalTrainingPlace) {
        this.normalTrainingPlace = normalTrainingPlace;
    }

    public String getSpecialTrainingCategory() {
        return specialTrainingCategory;
    }

    public void setSpecialTrainingCategory(String specialTrainingCategory) {
        this.specialTrainingCategory = specialTrainingCategory;
    }

    public Date getSpecialTrainingFrom() {
        return specialTrainingFrom;
    }

    public void setSpecialTrainingFrom(Date specialTrainingFrom) {
        this.specialTrainingFrom = specialTrainingFrom;
    }

    public Date getSpecialTrainingTo() {
        return specialTrainingTo;
    }

    public void setSpecialTrainingTo(Date specialTrainingTo) {
        this.specialTrainingTo = specialTrainingTo;
    }

    public String getSpecialTrainingPlace() {
        return specialTrainingPlace;
    }

    public void setSpecialTrainingPlace(String specialTrainingPlace) {
        this.specialTrainingPlace = specialTrainingPlace;
    }

    public String getDogGrade() {
        return dogGrade;
    }

    public void setDogGrade(String dogGrade) {
        this.dogGrade = dogGrade;
    }

    public String getLocatedAfterTraining() {
        return locatedAfterTraining;
    }

    public void setLocatedAfterTraining(String locatedAfterTraining) {
        this.locatedAfterTraining = locatedAfterTraining;
    }

    public String getPerformanceAtWork() {
        return performanceAtWork;
    }

    public void setPerformanceAtWork(String performanceAtWork) {
        this.performanceAtWork = performanceAtWork;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public Date getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(Date retiredDate) {
        this.retiredDate = retiredDate;
    }

    public String getRetiredReason() {
        return retiredReason;
    }

    public void setRetiredReason(String retiredReason) {
        this.retiredReason = retiredReason;
    }

    public boolean isDeath() {
        return isDeath;
    }

    public void setDeath(boolean death) {
        isDeath = death;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public List<WoundTreatment> getWoundTreatments() {
        return woundTreatments;
    }

    public void setWoundTreatments(List<WoundTreatment> woundTreatments) {
        this.woundTreatments = woundTreatments;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public List<HealthFollowUp> getHealthFollowUps() {
        return healthFollowUps;
    }

    public void setHealthFollowUps(List<HealthFollowUp> healthFollowUps) {
        this.healthFollowUps = healthFollowUps;
    }

    public List<DogsHandlersHistory> getDogsHandlersHistories() {
        return dogsHandlersHistories;
    }

    public void setDogsHandlersHistories(List<DogsHandlersHistory> dogsHandlersHistories) {
        this.dogsHandlersHistories = dogsHandlersHistories;
    }
}
