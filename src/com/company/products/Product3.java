package com.company.products;

/**
 * Ипотека с гос поддержкой
 * * Минимальная сумма кредита - 300 000 рублей
 * Процентная ставка - 11,4% годовых
 * Ставка фиксируется на весь срок действия кредитного договора. В случае нарушения условия о ежегодном продлении страхования жизни и здоровья заемщика ставка увеличивается до 12,4% годовых
 * Максимальная сумма кредита:
 * <p/>
 * 8 млн. руб. (для объектов, располагающихся на территории Москвы, Московской области, Санкт-Петербурга и Ленинградской области)
 * 3 млн. руб. (для объектов, располагающихся на иных территориях РФ)
 */


public class Product3 extends Product {

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 300000 || s > 3000000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  300 тыс.");
            System.out.println("Макс. сумма кредита: 3 млн.");
            return false;
        }
        return true;
    }

    @Override
    public void printConditions(int sum, int monthCount) {
        double percent = countPercent(monthCount);
        System.out.println("Потребительский кредит (аннуитентная схема): " + getAnnuityPayment(sum,monthCount, percent));
        System.out.println();
        System.out.println("Потребительский кредит (дифференцированная схема):");
         printDifferentiatPayment(sum, monthCount,percent);
    }
    private double countPercent(int monthCount) {
        return  11.4;
    }
}
