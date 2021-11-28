package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


        public long averageSales(long[] sales) {
    return calculateSum(sales) / sales.length;
        }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

        public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthWithBelowAverage(long[] sales) {
    long avgSum = averageSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avgSum) {
                counter ++;
            }
        }
        return counter;
    }

    public int monthWithAboveAverage(long[] sales) {
        long avgSum = averageSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > avgSum) {
                counter ++;
            }
        }
        return counter;
    }

}

