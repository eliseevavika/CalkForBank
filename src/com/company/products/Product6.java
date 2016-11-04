package com.company.products;

/**
 * Автокредит без первоначального взноса
 * от 45 тыс. до 5 млн. руб.
 * 15,5% - 17,0% годовых в рублях
 * срок кредита от 3 до 60 месяцев*
 */
public class Product6 extends Product {


    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 45000 || s > 5000000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита: 45 тыс.");
            System.out.println("Макс. сумма кредита: 5 млн.");

            return false;
        }
        return true;
    }

    @Override
    public void printConditions(int sum, int monthCount) {
        double percent = countPercent(monthCount);
        System.out.println("Образовательный кредит (аннуитентная схема): " + getAnnuityPayment(sum, monthCount, percent));
        System.out.println();
        System.out.println("Образовательный кредит (дифференцированная схема):");
        printDifferentiatPayment(sum, monthCount, percent);
    }

    private double countPercent(int monthCount) {
        return 15.5;
    }
}
