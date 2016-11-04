package com.vikacompany.products;

/**
 * Потребительский кредит
 * <p>срок до 5 лет, ставка от 14.9%, сумма до 1.5 млн руб</p>
 * <p> Мин. сумма кредита*  15 000</p>
 * <p>Макс. сумма кредита**  1 500 000</p>
 * <p>Срок кредита  от 3 месяцев до 5 лет</p>
 * <p>Срок (мес):3-24 месяца,  14,9%</p>
 * <p>Срок (мес):25-60 мес, 15.9%</p>
 */

public class Product1 extends Product {

    protected boolean isValid(int s, int monthCount) {
        if (s < 15000 || s > 1500000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  15 000");
            System.out.println("Макс. сумма кредита:  1 500 000");
            return false;
        }
        return true;
    }

    protected double countPercent(int monthCount) {
        if (monthCount >= 3 && monthCount <= 24) {
            return 14.9;
        } else if (monthCount >= 25 && monthCount <= 60) {
            return 15.9;
        }
        return 20;
    }
}