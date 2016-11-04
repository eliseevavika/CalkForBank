package com.vikacompany.products;

/**
 * Образовательный кредит
 * <p></>Cумма кредита - Соответствует стоимости обучения.</p>
 * <p>Платежеспособность заемщика не учитывается.</p>
 * <p>Срок кредита -срок обучения, увеличенный на 10 лет, отведенных для погашения кредита.</p>
 * <p>Процентная ставка 12% годовых</p>
 * <p>Срок кредитования — не более 11 лет</p>
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

