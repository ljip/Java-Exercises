package com.demo;

public class Sale {
    public String salesPerson;
    public String region;
    public double amount;

    public Sale(String salesPerson, String region, double amount) {
        this.salesPerson = salesPerson;
        this.region = region;
        this.amount = amount;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public String getRegion() {
        return region;
    }

    public double getAmount() {
        return amount;
    }
}

