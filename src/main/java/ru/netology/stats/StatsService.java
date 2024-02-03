package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long sumSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    //средняя сумма продаж в месяц

    public long avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего

    public int belowAvgSales(long[] sales) {
        int belowAvgSales = 0;
        long averageSales = avgSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                belowAvgSales++;
            }
        }
        return belowAvgSales;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int aboveAvgSales(long[] sales) {
        int aboveAvgSales = 0;
        long averageSales = avgSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                aboveAvgSales++;
            }
        }
        return aboveAvgSales;
    }

}