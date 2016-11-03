package com.company.products;

/**
 * Автокредит без первоначального взноса
 * от 45 тыс. до 5 млн. руб.
 * 15,5% - 17,0% годовых в рублях
 * срок кредита от 3 до 60 месяцев*
 */
public class Product6 extends Product {
    double percent = 15.5;

    @Override
    protected double isValid(int s, int monthCount) {
        if (s < 45000 || s > 5000000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита: 45 тыс.");
            System.out.println("Макс. сумма кредита: 5 млн.");

            //не знаю как написать,чтобы вводили суммму еще раз и прошел весь процесс
        }
        return percent;
    }
}
