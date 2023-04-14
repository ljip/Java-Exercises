package com.demo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessor {

    public static double getTotalSales(List<Sale> sales){
        return sales.stream()
                .mapToDouble(s -> s.getAmount())
                .sum();

    }
    public static List<Sale> getSalesByRegion(List<Sale> sales, String region) {
        return sales.stream()
                .filter(s -> s.getRegion().equals(region))
                .collect(Collectors.toList());
    }

    public static List<Sale> getTopSalesPeople(List<Sale> sales, int n) {
        return sales.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static double getAverageSale(List<Sale> sales) {
        return sales.stream()
                .mapToDouble(Sale::getAmount)
                .average()
                .orElse(0);
}
}

