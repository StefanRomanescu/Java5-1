package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChillMonthTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000",
            "100000, 60000, 150000"
    })
    public void testFirstCombinedOption(int income, int expenses, int threshold) {
        ChillMonth service = new ChillMonth();
        int ChillMonth = service.calculate(income, expenses, threshold);
        System.out.println(ChillMonth);
    }

    @Test
    public void testSecondOption() {
        ChillMonth service = new ChillMonth();
        int ChillMonth = service.calculate(10_000, 3000, 20_000);
        System.out.println(ChillMonth);
    }

    @Test
    public void testThirdOption() {
        ChillMonth service = new ChillMonth();
        int ChillMonth = service.calculate(100_000, 60_000, 150_000);
        System.out.println(ChillMonth);
    }
}