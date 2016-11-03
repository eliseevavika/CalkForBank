package Products;

/**
 * Образовательные кредиты:
 * Cумма кредита - Соответствует стоимости обучения.
 Платежеспособность заемщика не учитывается.

 * Срок кредита
 Срок обучения, увеличенный на 10 лет, отведенных для погашения кредита.

 (!) 12% годовых
 Срок кредитования — не более 11 лет, включая в себя срок обучения.
 */

public class Product2 extends Product {
    double percent = 12.0;

    @Override
    protected double Check(int s, int monthCount) {
        if (monthCount > 132) {
            System.out.println("Срок кредитования по данному продукту— не более 11 лет");
        }
return percent;
    }
}
