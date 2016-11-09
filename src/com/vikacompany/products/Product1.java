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

    public boolean isValid(int s, int monthCount) {
        return s >= 15000 && s <= 1500000 && monthCount >= 3 && monthCount <= 60;
    }


    protected double countPercent(int monthCount) {
        if (monthCount >= 3 && monthCount <= 24) {
            return 14.9;
        } else if (monthCount >= 25 && monthCount <= 60) {
            return 15.9;
        }

        return 20;
    }



    public void offerAlternativeConditions(int s, int monthCount) {

        if (s < 15000 || s > 1500000) {
            System.out.println("Введенная сумма не удовлетворяет условиям кредита");
            System.out.println("Минимальная сумма по данному кредиту-15 тыс, максимальная сумма-1.5 млн");
        }

        if (monthCount < 3) {
            System.out.println("Минимальный срок кредита 3 месяца");
            System.out.println("Можем вам предложить процентную ставку 14.9 % на срок от 3 до 24 месяцев");
        }

        if (monthCount > 60) {
            System.out.println("Максимальный срок кредита 60 месяцев");
            System.out.println("Можем вам предложить процентную ставку 15.9 % на срок от 25 до 60 месяцев");
        }

        System.out.println("Введите параметры кредита снова:");
    }

}