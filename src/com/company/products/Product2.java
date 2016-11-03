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


    public Product2(int monthCount) {
        this.monthCount=monthCount;
        percent = 12.0;
    }

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (monthCount > 132) {
            System.out.println("Срок кредитования по данному продукту— не более 11 лет");
            return  false;
        }
        return true;
    }
    @Override
    public void printConditions(int sum) {

        System.out.println(" Образовательный кредит (аннуитентная схема): " + annuityPayment(sum));
        System.out.println();
        System.out.println(" Образовательный кредит (дифференцированная схема):");
        System.out.println(" Образовательный кредит: " + differentiatPayment(sum));
    }
}
