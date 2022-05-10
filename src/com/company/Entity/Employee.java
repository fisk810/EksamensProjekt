package com.company.Entity;

import com.company.Entity.User;

public class Employee extends User {
    String phoneNumber;

    public Employee(String firstName, String lastName, String address, String zipCode, String city, String phoneNumber) {
        super(firstName, lastName, address, zipCode, city);
        this.phoneNumber = phoneNumber;
    }
}
