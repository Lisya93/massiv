package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) { //ищет сумму продаж
        long sum = 0;

        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }

        return sum;
    }

    public long AverageSales(long[] sales) { //ищет среднюю сумму продаж
        long sum = sumSales(sales);
        long average = sum / sales.length;

        return average;

    }

    public long maxSumMonth(long[] sales) { //ищет номер месяца с максимальными продажами
        long maxMonth = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSumMonth(long[] sales) { //ищет номер месяца с минимальными продажами
        long minMonth = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long aboveAverageSales(long[] sales) { //ищет количество месяцев с продажами выше среднего
        long average = AverageSales(sales);
        long count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > average) {
                count++;
            }
        }
        return count;
    }

    public long belowAverageSales(long[] sales) { //ищет количество месяцев с продажами ниже среднего
        long average = AverageSales(sales);
        long count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < average) {
                count++;
            }
        }
        return count;
    }

}