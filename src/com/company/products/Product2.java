package com.company.products;

/**
 * Образовательный кредит
 * Cумма кредита - Соответствует стоимости обучения.
 * Платежеспособность заемщика не учитывается.
 * Срок кредита -срок обучения, увеличенный на 10 лет, отведенных для погашения кредита.
 * Процентная ставка 12% годовых
 * Срок кредитования — не более 11 лет
 */

public class Product2 extends Product {

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (monthCount > 132) {
            System.out.println("Срок кредитования по данному продукту— не более 11 лет");
            return false;
        }
        return true;
    }

    protected double countPercent(int monthCount) {
        return 12.0;
    }
}

