package com.application.addressbook.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity : Defining class mapped to tabel
 * @Table : Defining Table Name
 */
@Entity
@Table(name = "AddressBook_Table")
public class AddressBookDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private Long pinCode;
    private Long phoneNumber;
    private String email;

    public AddressBookDTO(){}
    
    /**
     * Defining Constructer
     * @param id
     * @param name
     * @param address
     * @param city
     * @param state
     * @param pinCode
     * @param phoneNumber
     * @param email
     */
    public AddressBookDTO(Long id, String name, String address, String city, String state, Long pinCode,
            Long phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public Long getid() {
        return id;
    }

    public void setiD(Long iD) {
        this.id = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}