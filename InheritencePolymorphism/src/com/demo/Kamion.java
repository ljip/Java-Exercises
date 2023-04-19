package com.demo;

public class Kamion extends Vozilo{
    private int kapacitetTereta;

    public Kamion(String boja, int najvecaBrzina, int kapacitetTereta) {
        super(boja, najvecaBrzina);
        this.kapacitetTereta = kapacitetTereta;
    }
    @Override
    public void vozi(){
        System.out.println("Kamion vozi...");
    }
    @Override
    public void ubrzavanje(){
        System.out.println("Kamion ubrzava...");
    }
}