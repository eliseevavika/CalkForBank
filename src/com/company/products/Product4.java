package com.company.products;

/**
 * Ипотека на строящееся жилье:
 * Мин. сумма кредита -300 000
 * Макс. сумма кредита -Не должна превышать меньшую из величин:
 * 80% договорной стоимости кредитуемого жилого помещения;
 * 80% оценочной стоимости иного объекта недвижимости, оформляемого в залог.
 * Срок кредита- до 30 лет
 * Первоначальный взнос от 20%
 * Первоначальный взнос
 * <p/>
 * <p/>
 * <p/>
 * Срок кредита
 * <p/>
 * до 10 лет (включ.)     от 10 до 20 лет (включ.)  от 20 до 30 лет (включ.)
 * <p/>
 * 12,00%                 12,25%                   12,50%
 */


public class Product4 extends Product {

    public Product4(int monthCount) {
        this.monthCount = monthCount;
        if (monthCount < 120) {
            percent = 12.0;
        } else if (monthCount >= 120 && monthCount < 240) {
            percent = 12.25;
        } else if (monthCount >= 240 && monthCount < 360) {
            percent = 12.5;
        }
    }

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 300000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  300 тыс.");
            return false;
        }
        return true;
    }

    @Override
    public void printConditions(int sum) {
        System.out.println("Образовательный кредит (аннуитентная схема): " + annuityPayment(sum));
        System.out.println();
        System.out.println("Образовательный кредит (дифференцированная схема):");
        System.out.println("Образовательный кредит: " + differentiatPayment(sum));
    }
}



