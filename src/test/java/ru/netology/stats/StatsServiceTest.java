package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 180;

        long actual = service.calculateSum(salesEnterprise);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageSales() {
        StatsService service = new StatsService();
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(salesEnterprise);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(salesEnterprise);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(salesEnterprise);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithBelowAverage() {
        StatsService service = new StatsService();
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthWithBelowAverage(salesEnterprise);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthWithAboveAverage() {
        StatsService service = new StatsService();
        long[] salesEnterprise = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthWithAboveAverage(salesEnterprise);
        assertEquals(expected, actual);
    }
}