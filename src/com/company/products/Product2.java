package com.company.products;

/**
 * Образовательные кредиты:
 * Cумма кредита - Соответствует стоимости обучения.
 * Платежеспособность заемщика не учитывается.
 * <p/>
 * Срок кредита
 * Срок обучения, увеличенный на 10 лет, отведенных для погашения кредита.
 * <p/>
 * (!) 12% годовых
 * Срок кредитования — не более 11 лет, включая в себя срок обучения.
 */

public class Product2 extends Product {
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param monthCount - количество периодов, в течение которых выплачивается кредит
     * @see Product1#Product1(int monthCount)
     * */

    public Product2(int monthCount) {
        this.monthCount = monthCount;
        percent = 12.0;
    }

    /**
     * Проверка переданных параметров на Валидность
     * @param s - сумму выплаты за 1 месяц
     * @param monthCount - количество периодов, в течение которых выплачивается кредит
     * @return -проверяем правильность параметров-сумма, кол-во месяцев
     * Возвращаем условие: правильный или неправильный параметр.
     */
    @Override
    protected boolean isValid(int s, int monthCount) {
        if (monthCount > 132) {
            System.out.println("Срок кредитования по данному продукту— не более 11 лет");
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

        System.out.println(" Образовательный кредит (аннуитентная схема): " + annuityPayment(sum));
        System.out.println();
        System.out.println(" Образовательный кредит (дифференцированная схема):");
        System.out.println(" Образовательный кредит: " + differentiatPayment(sum));
    }
}
