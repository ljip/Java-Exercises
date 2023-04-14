package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sale> sales = new ArrayList<>();

        sales.add(new Sale("Filip", "zapad", 10.0));
        sales.add(new Sale("Dominik", "zapad", 10.0));

        System.out.println("Ukupna prodaja:  \n" + StreamProcessor.getTotalSales(sales));

        //printa samo objekt
        System.out.println("Prodaja po regiji: \n" + StreamProcessor.getSalesByRegion(sales, "zapad"));


        /* tricky zadatak. Ne radi, nisam uspio srediti
        System.out.println(com.demo.StreamProcessor.getTopSalesPeople(sales, 34));
         */
        System.out.println("Prosjecna prodaja: \n" + StreamProcessor.getAverageSale(sales));
    }
}