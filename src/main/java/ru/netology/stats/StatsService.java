package ru.netology.stats;

public class StatsService {


    public long getSalesAmount(long[] sales) {
        long getSalesAmount = 0;
        for (long sale : sales) {
            getSalesAmount = getSalesAmount + sale;

        }
        return getSalesAmount;

    }

    public long average(long[] sales) {
        return getSalesAmount(sales) / 12;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
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

    public int belowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;
            }
        }
        return count;
    }

}
