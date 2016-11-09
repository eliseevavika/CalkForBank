package com.vikacompany.credits;

/**
 * Автокредит без первоначального взноса
 * <p>от 45 тыс. до 5 млн. руб.</p>
 * <p>15,5% годовых в рублях</p>
 * <p>срок кредита от 3 до 60 месяцев*</p>
 */
public class CreditForCar extends Credit {

    public boolean isValid(int s, int monthCount) {
        return s >= 45000 && s <= 5000000 && monthCount >= 3 && monthCount <= 60;
    }

    protected double countPercent(int monthCount) {
        return 15.5;
    }

    public void offerAlternativeConditions(int s, int monthCount) {

        if (s < 45000 || s > 5000000) {
            System.out.println("Введенная сумма не удовлетворяет условиям кредита");
            System.out.println("Минимальная сумма по данному кредиту-45 тыс, максимальная сумма-5 млн");
        }

        if (monthCount < 3) {
            System.out.println("Минимальный срок кредита 3 месяца");
            System.out.println("Можем вам предложить процентную ставку 15.5 % на срок от 3 до 60 месяцев");
        }

        if (monthCount > 60) {
            System.out.println("Максимальный срок кредита 60 месяцев");
            System.out.println("Можем вам предложить процентную ставку 15.5 % на срок от 3 до 60 месяцев");
        }

        System.out.println("Введите параметры кредита снова:");
    }
}
