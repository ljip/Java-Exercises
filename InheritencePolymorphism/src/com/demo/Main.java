package com.demo;

public class Main {
    public static void main(String[] args) {
        Vozilo vozilo = new Vozilo("crvena", 100);
        Automobil automobil = new Automobil("plava", 120, 4, "audi");
        Kamion kamion = new Kamion("zelena", 80, 1000);

        vozilo.vozi();
        automobil.vozi();
        kamion.vozi();

        vozilo.ubrzavanje();
        automobil.ubrzavanje();
        kamion.ubrzavanje();
    }
}