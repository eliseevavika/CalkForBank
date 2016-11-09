package com.vikacompany.credits;

/**
 * Образовательный кредит
 * <p></>Cумма кредита - Соответствует стоимости обучения.</p>
 * <p>Платежеспособность заемщика не учитывается.</p>
 * <p>Срок кредита -срок обучения, увеличенный на 10 лет, отведенных для погашения кредита.</p>
 * <p>Процентная ставка 12% годовых</p>
 * <p>Срок кредитования — не более 11 лет</p>
 */

public class CreditForEducation extends Credit {

    @Override
    public boolean isValid(int s, int monthCount) {
        return monthCount >= 3 && monthCount <= 132;
    }

    protected double countPercent(int monthCount) {
        return 12.0;
    }

    public void offerAlternativeConditions(int s, int monthCount) {

        if (monthCount < 3) {
            System.out.println("Минимальный срок кредита 3 месяца");
            System.out.println("Можем вам предложить процентную ставку 12 % на срок от 3 месяцев до 11 лет");
        }

        if (monthCount > 132) {
            System.out.println("Максимальный срок кредита 132 месяцев");
            System.out.println("Можем вам предложить процентную ставку 12 % на срок от 3 месяцев до 11 лет");
        }

        System.out.println("Введите параметры кредита снова:");
    }
}

