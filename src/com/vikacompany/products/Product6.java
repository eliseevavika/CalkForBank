package com.vikacompany.products;

/**
 * Автокредит без первоначального взноса
 * <p>от 45 тыс. до 5 млн. руб.</p>
 * <p>15,5% годовых в рублях</p>
 * <p>срок кредита от 3 до 60 месяцев*</p>
 */
public class Product6 extends Product {

    protected boolean isValid(int s, int monthCount) {
        if (s < 45000 || s > 5000000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита: 45 тыс.");
            System.out.println("Макс. сумма кредита: 5 млн.");

            return false;
        }
        return true;
    }

    protected double countPercent(int monthCount) {
        return 15.5;
    }
}