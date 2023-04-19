package com.demo;

public class Automobil extends Vozilo{
    private String model;
    private int brojVrata;
    public Automobil(String boja, int najvecaBrzina, int brojVrata, String model) {
        super(boja, najvecaBrzina);
        this.model = model;
        this.brojVrata = brojVrata;
    }

    @Override
    public void vozi() {
        System.out.println("Automobil vozi...");
    }
    @Override
    public void ubrzavanje() {
        System.out.println("Automobil ubrzava");
    }
}
