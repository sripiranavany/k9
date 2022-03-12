package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String breed;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private Date birthDate;
    @Column(nullable = false)
    private String cost;
    @Column(nullable = false)
    private String typeOfPurchase;
    @Column(nullable = false)
    private String purchaseFrom;
    @Column(nullable = false)
    private Date purchaseDate;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = true)
    private Date normalTrainingFrom;
    @Column(nullable = true)
    private Date normalTrainingTo;
    @Column(nullable = true)
    private String normalTrainingPlace;
    @Column(nullable = true)
    private String specialTrainingCategory;
    @Column(nullable = true)
    private Date specialTrainingFrom;
    @Column(nullable = true)
    private Date specialTrainingTo;
    @Column(nullable = true)
    private String specialTrainingPlace;
    @Column(nullable = true)
    private String dogGrade;
    @Column(nullable = true)
    private String locatedAfterTraining;
    @Column(nullable = true)
    private String performanceAtWork;
    @Column(nullable = false)
    private boolean isRetired = false;
    @Column(nullable = true)
    private Date retiredDate;
    @Column(nullable = true)
    private String retiredReason;
    @Column(nullable = false)
    private boolean isDeath = false;
    @Column(nullable = true)
    private Date deathDate;
    @Column(nullable = true)
    private String deathReason;

    @OneToMany(mappedBy = "dog", cascade = CascadeType.ALL)
    private List<WoundTreatment> woundTreatments;

    @OneToMany(mappedBy = "vaccineDog", cascade = CascadeType.ALL)
    private List<Vaccine> vaccines;

    @OneToMany(mappedBy = "healthFollowUpDog", cascade = CascadeType.ALL)
    private List<HealthFollowUp> healthFollowUps;

    @OneToMany(mappedBy = "dogHistory",cascade = CascadeType.ALL)
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthDate=" + birthDate +
                ", cost='" + cost + '\'' +
                ", typeOfPurchase='" + typeOfPurchase + '\'' +
                ", purchaseFrom='" + purchaseFrom + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", gender='" + gender + '\'' +
                ", normalTrainingFrom=" + normalTrainingFrom +
                ", normalTrainingTo=" + normalTrainingTo +
                ", normalTrainingPlace='" + normalTrainingPlace + '\'' +
                ", specialTrainingCategory='" + specialTrainingCategory + '\'' +
                ", specialTrainingFrom=" + specialTrainingFrom +
                ", specialTrainingTo=" + specialTrainingTo +
                ", specialTrainingPlace='" + specialTrainingPlace + '\'' +
                ", dogGrade='" + dogGrade + '\'' +
                ", locatedAfterTraining='" + locatedAfterTraining + '\'' +
                ", performanceAtWork='" + performanceAtWork + '\'' +
                ", isRetired=" + isRetired +
                ", retiredDate=" + retiredDate +
                ", retiredReason='" + retiredReason + '\'' +
                ", isDeath=" + isDeath +
                ", deathDate=" + deathDate +
                ", deathReason='" + deathReason + '\'' +
                '}';
    }
}
