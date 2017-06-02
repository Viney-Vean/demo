package com.example.demo.ObjectMe;

/**
 * Created by User on 6/2/2017.
 */
public class Address {
    private String street;

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
