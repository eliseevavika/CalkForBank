package com.vikacompany.products;

/**
 * Ипотека на строящееся жилье:
 * <p>Мин. сумма кредита -300 000</p>
 * <p>Срок кредита- до 30 лет</p>
 * <p>Срок кредита</p>
 * <p>до 10 лет (включ.) -12,00%</p>
 * <p>от 10 до 20 лет (включ.)- 12,25%</p>
 * <p>от 20 до 30 лет (включ.) -  12,50%</p>
 */


public class Product4 extends Product {

    public boolean isValid(int s, int monthCount) {
        if (s < 300000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  300 тыс.");
            return false;
        }
        return true;
    }

    protected double countPercent(int monthCount) {
        if (monthCount < 120) {
            return 12.0;
        } else if (monthCount >= 120 && monthCount < 240) {
            return 12.25;
        } else if (monthCount >= 240 && monthCount < 360) {
            return 12.5;
        }
        return 20;
    }

}


