package com.company.Entity;

public abstract class User {
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String city;

    public User(String firstName, String lastName, String address, String zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

}
