package com.vikacompany.products;

/**
 * Ипотека с гос поддержкой
 * <p>Минимальная сумма кредита - 300 000 рублей</p>
 * <p>Процентная ставка - 11,4% годовых</p>
 * <p>Максимальная сумма кредита:</p>
 * <p>3 млн. руб.</p>
 */


public class Product3 extends Product {

    public boolean isValid(int s, int monthCount) {
        if (s < 300000 || s > 3000000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  300 тыс.");
            System.out.println("Макс. сумма кредита: 3 млн.");
            return false;
        }
        return true;
    }

    protected double countPercent(int monthCount) {
        return 11.4;
    }
}
