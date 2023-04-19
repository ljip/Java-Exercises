package com.demo;

public class Vozilo implements Ubrzavanje{

    private String boja;
    private int najvecaBrzina;
    public Vozilo(String boja, int najvecaBrzina){
        this.boja = boja;
        this.najvecaBrzina = najvecaBrzina;
    }

    public void vozi(){
        System.out.println("Vozi....");
    }
    @Override
    public void ubrzavanje() {
        System.out.println("vrooooom");
    }

}