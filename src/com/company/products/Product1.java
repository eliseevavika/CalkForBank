package com.company.products;

/**
 * Потребительский кредит
 *
 * срок до 5 лет, ставка от 14.9%, сумма до 1.5 млн руб
 * Мин. сумма кредита*  15 000
 * Макс. сумма кредита**  1 500 000
 * Срок кредита  от 3 месяцев до 5 лет***
 * <p/>
 * Срок (мес):3-24 месяца,  14,9%
 * Срок (мес):25-60 мес, 15.9%
 */

public class Product1 extends Product {
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param monthCount - количество периодов, в течение которых выплачивается кредит
     * @see Product1#Product1(int monthCount)
     */

    public Product1(int monthCount) {
        this.monthCount = monthCount;
        if (monthCount >= 3 && monthCount <= 24) {
            this.percent = 14.9;
        } else if (monthCount >= 25 && monthCount <= 60) {
            this.percent = 15.9;
        }
    }

    /**
     * Проверка переданных параметров на Валидность
     * @param s - сумму выплаты за 1 месяц
     * @param monthCount - количество периодов, в течение которых выплачивается кредит
     * @return: проверяем правильность параметров-сумма, кол-во месяцев
     * Возвращаем условие: правильный или неправильный параметр.
     */
    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 15000 || s > 1500000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  15 000");
            System.out.println("Макс. сумма кредита:  1 500 000");
            return false;
        }
        return true;
    }

    /**
     * Полная печать расчета Пользовательского кредита по аннуитентной и дифференцированной схемам.
     * @param sum - сумму выплаты за 1 месяц
     */
    @Override
    public void printConditions(int sum) {

        System.out.println("Потребительский кредит (аннуитентная схема): " + annuityPayment(sum));
        System.out.println();
        System.out.println("Потребительский кредит (дифференцированная схема):");
        System.out.println("Потребительский кредит: " + differentiatPayment(sum));
    }
}