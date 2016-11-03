package Products;

/**
 * Потребительский кредит
 *
 *
 срок до 5 лет, ставка от 14.9%, сумма до 1.5 млн руб

 Мин. сумма кредита*  15 000
 Макс. сумма кредита**  1 500 000
 Срок кредита  от 3 месяцев до 5 лет***

 Срок (мес):3-24 месяца, от 14,9% до 20,9%
 Срок (мес):25-60 мес, 15.9% до 21.9%


 */

public class Product1 extends Product {


    @Override
    protected double Check(int s, int monthCount) {
        if (s < 15000 || s > 1500000) {
            System.out.println("Сумма несоответствует допустимому интервалу");
            System.out.println("Мин. сумма кредита:  15 000");
            System.out.println("Макс. сумма кредита:  1 500 000");
            return 0.0;//не знаю как написать,чтобы вводили суммму еще раз и прошел весь процесс
        } else {
            if (monthCount >= 3 && monthCount <= 24) {
                double percent = 14.9;
            } else if (monthCount >= 25 && monthCount <= 60) {
                double percent = 15.9;
            }
            return percent;
        }
    }
}