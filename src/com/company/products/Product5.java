package com.company.products;

/**
 * Приобретение готового жилья
 * * Мин. сумма кредита - 300 000
 * Макс. сумма кредита -  Не должна превышать меньшую из величин:
 * 80% договорной стоимости кредитуемого жилого помещения;
 * 80% оценочной стоимости кредитуемого или иного оформляемого в залог жилого помещения.
 * Срок кредита до 30 лет
 * Первоначальный взнос от 20%
 * <p/>
 * Срок кредита
 * <p/>
 * до 10 лет (включ.)               от 10 до 20 лет (включ.)    от 20 до 30 лет (включ.)
 * <p/>
 * 12,00%                             12,25%                   12,50%
 * +0,5% - если вы не получаете зарплату в Банке, а приобретаемое жилье построено без участия кредитных средств Банка
 */
public class Product5 extends Product {
    public Product5(int monthCount) {
        if (monthCount < 120) {
             percent = 12.5;
        }
        else if (monthCount >= 120 && monthCount < 240) {
            percent = 12.75;
        } else if (monthCount >= 240 && monthCount < 360) {
           percent = 13;
        }
    }

    @Override
    protected boolean isValid(int s, int monthCount) {
        if (s < 300000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита: 300 тыс.");

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
