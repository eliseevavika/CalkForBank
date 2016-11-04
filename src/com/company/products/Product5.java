package com.company.products;

/**
 * Приобретение готового жилья
 * Мин. сумма кредита - 300 000
 * Срок кредита
 * до 10 лет (включ.) -12,50%
 * от 10 до 20 лет (включ.)- 12,75%
 * от 20 до 30 лет (включ.) -  13.0%
 */
public class Product5 extends Product {


    protected boolean isValid(int s, int monthCount) {
        if (s < 300000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита: 300 тыс.");

            return false;
        }
        return true;
    }


    protected double countPercent(int monthCount) {
        if (monthCount < 120) {
            return 12.5;
        } else if (monthCount >= 120 && monthCount < 240) {
            return 12.75;
        } else if (monthCount >= 240 && monthCount < 360) {
            return 13;
        }
        return 20;

    }
}
