package com.sripiranavan.spring.veterinary.basiccs.dto;

public class Vaccine {

    private Long id;
    private String vaccineName;
    private String dateOfVaccination;
    private String remarks;
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

}
