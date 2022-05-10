package com.company.Entity;

public class Case {
    private Customer customer;
    private Employee perfomedBy;
    private String orderNumber;
    private String address;
    private String zipCode;
    private String city;
    //TODO skal laves felter tjeklisten... Ikke 100% aftalt hvordan endnu.


    public Case(Customer customer, Employee perfomedBy, String orderNumber, String address, String zipCode, String city) {
        this.customer = customer;
        this.perfomedBy = perfomedBy;
        this.orderNumber = orderNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getPerfomedBy() {
        return perfomedBy;
    }

    public String getOrderNumber() {
        return orderNumber;
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
