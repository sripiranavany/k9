package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;

@Entity
public class WoundTreatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String woundType;

    @Column(nullable = false)
    private String treatment;

    @Column(nullable = false)
    private String recoveredPeriod;

    @ManyToOne
    @JoinColumn(name ="dog_id")
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

    @Override
    public String toString() {
        return "WoundTreatment{" +
                "id=" + id +
                ", woundType='" + woundType + '\'' +
                ", treatment='" + treatment + '\'' +
                ", recoveredPeriod='" + recoveredPeriod + '\'' +
                ", dog=" + dog +
                '}';
    }
}
