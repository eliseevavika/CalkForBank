package com.vikacompany.credits;

/**
 * Ипотека на строящееся жилье:
 * <p>Мин. сумма кредита -300 000</p>
 * <p>Срок кредита- от 1 года до 30 лет</p>
 * <p>Срок кредита</p>
 * <p>от 1 года до 10 лет (включ.) -12,00%</p>
 * <p>от 10 до 20 лет (включ.)- 12,25%</p>
 * <p>от 20 до 30 лет (включ.) -  12,50%</p>
 */


public class CreditForNewBuilding extends Credit {

    public boolean isValid(int s, int monthCount) {
        return s >= 300000 && monthCount >= 12 && monthCount <=360;
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
    public void offerAlternativeConditions(int s, int monthCount) {

        if (s < 300000) {
            System.out.println("Введенная сумма не удовлетворяет условиям кредита");
            System.out.println("Минимальная сумма по данному кредиту-300 тыс");
        }

        if (monthCount < 12) {
            System.out.println("Минимальный срок кредита 1 год");
            System.out.println("Можем вам предложить процентную ставку 12 % на срок от 1 года до 10 лет");
        }

        if (monthCount > 360) {
            System.out.println("Максимальный срок кредита 30 лет");
            System.out.println("Можем вам предложить процентную ставку 12.5 % на срок от 20 до 30 лет");
        }

        System.out.println("Введите параметры кредита снова:");
    }


}


