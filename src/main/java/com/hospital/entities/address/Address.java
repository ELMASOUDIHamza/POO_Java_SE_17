package com.hospital.entities.address;

import com.hospital.enums.AvenueOrStreet;

public class Address {
    private String streetName ;
    private AvenueOrStreet avenueOrStreet ;
    private int zipCode ; // Code postal
    private String city;
//Constructors :
    public Address() {
    }
    public Address(String streetName, AvenueOrStreet avenueOrStreet, int zipCode, String city) {
        this.streetName = streetName;
        this.avenueOrStreet = avenueOrStreet;
        this.zipCode = zipCode;
        this.city = city;
    }
//Getters :
    public String getStreetName() {
        return streetName;
    }
    public AvenueOrStreet getAvenueOrStreet() {
        return avenueOrStreet;
    }
    public int getZipCode() {
        return zipCode;
    }
    public String getCity() {
        return city;
    }
//Setters :
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setAvenueOrStreet(AvenueOrStreet avenueOrStreet) {
        this.avenueOrStreet = avenueOrStreet;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
