package com.sripiranavan.spring.veterinary.basicrs.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class DogHandler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String joinedDate;
    @Column(nullable = false)
    private boolean isActive = false;
    @Column(nullable = true)
    private String retiredDate;
    @Column(nullable = true)
    private String qualification;

    @OneToMany(mappedBy = "handlerHistory",cascade = CascadeType.ALL)
    private List<DogsHandlersHistory> handlerHistory;

    public DogHandler() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(String retiredDate) {
        this.retiredDate = retiredDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<DogsHandlersHistory> getHandlerHistory() {
        return handlerHistory;
    }

    public void setHandlerHistory(List<DogsHandlersHistory> handlerHistory) {
        this.handlerHistory = handlerHistory;
    }

    @Override
    public String toString() {
        return "DogHandler{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", joinedDate='" + joinedDate + '\'' +
                ", isActive=" + isActive +
                ", retiredDate='" + retiredDate + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
