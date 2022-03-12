package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;

@Entity
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String vaccineName;

    @Column(nullable = false)
    private String dateOfVaccination;

    @Column(nullable = true)
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "dog_id")
    private Dog vaccineDog;

    public Vaccine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getDateOfVaccination() {
        return dateOfVaccination;
    }

    public void setDateOfVaccination(String dateOfVaccination) {
        this.dateOfVaccination = dateOfVaccination;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Dog getVaccineDog() {
        return vaccineDog;
    }

    public void setVaccineDog(Dog vaccineDog) {
        this.vaccineDog = vaccineDog;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", dateOfVaccination='" + dateOfVaccination + '\'' +
                ", remarks='" + remarks + '\'' +
                ", vaccineDog=" + vaccineDog +
                '}';
    }
}
