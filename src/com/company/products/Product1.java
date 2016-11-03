package com.company.products;

/**
 * Потребительский кредит
 * <p/>
 * <p/>
 * срок до 5 лет, ставка от 14.9%, сумма до 1.5 млн руб
 * <p/>
 * Мин. сумма кредита*  15 000
 * Макс. сумма кредита**  1 500 000
 * Срок кредита  от 3 месяцев до 5 лет***
 * <p/>
 * Срок (мес):3-24 месяца,  14,9%
 * Срок (мес):25-60 мес, 15.9%
 */

public class Product1 extends Product {


    public Product1(int monthCount) {
        if (monthCount >= 3 && monthCount <= 24) {
            this.percent = 14.9;
        } else if (monthCount >= 25 && monthCount <= 60) {
            this.percent = 15.9;
        }
    }

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 15000 || s > 1500000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  15 000");
            System.out.println("Макс. сумма кредита:  1 500 000");
            return false;
        }
        return true;
    }
}