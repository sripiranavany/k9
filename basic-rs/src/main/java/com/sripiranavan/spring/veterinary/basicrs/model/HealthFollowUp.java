package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;

@Entity
public class HealthFollowUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String description;

    @Column(nullable = true)
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "dog_id")
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

    @Override
    public String toString() {
        return "HealthFollowUp{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", remarks='" + remarks + '\'' +
                ", healthFollowUpDog=" + healthFollowUpDog +
                '}';
    }
}
