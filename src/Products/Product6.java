package Products;

/**
 Автокредит без первоначального взноса
 от 45 тыс. до 5 млн. руб.
 15,5% - 17,0% годовых в рублях
 срок кредита от 3 до 60 месяцев*
 */
public class Product6 extends Product{
    public Product6() {
        double percent = 15.5;
        p = percent / (12 * 100);

    }
}
