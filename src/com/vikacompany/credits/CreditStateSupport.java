package com.vikacompany.credits;

/**
 * Ипотека с гос поддержкой
 * <p>Минимальная сумма кредита - 300 000 рублей</p>
 * <p>Процентная ставка - 11,4% годовых</p>
 * <p>Срок кредита</p>
 * <p>от 1 года до 20 лет (включ.)</p>
 * <p>Максимальная сумма кредита:</p>
 * <p>3 млн. руб.</p>
 */


public class CreditStateSupport extends Credit {

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

    public void offerAlternativeConditions(int s, int monthCount) {

        if (s < 300000 || s>3000000) {
            System.out.println("Введенная сумма не удовлетворяет условиям кредита");
            System.out.println("Минимальная сумма по данному кредиту-300 тыс");
            System.out.println("Минимальная сумма по данному кредиту-3 млн");
        }

        if (monthCount < 12) {
            System.out.println("Минимальный срок кредита 1 год");
            System.out.println("Можем вам предложить процентную ставку 12 % на срок от 1 года до 10 лет");
        }

        if (monthCount > 240) {
            System.out.println("Максимальный срок кредита 20 лет");
            System.out.println("Можем вам предложить процентную ставку 11.4 % на срок от 1 года до 20 лет");
        }

        System.out.println("Введите параметры кредита снова:");
    }

}
