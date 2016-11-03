package Products;

/**
 Аннуитетный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа остаётся постоянным на всём периоде кредитования.
 */
public class Product {
    protected double p;// месячная процентная ставка по кредиту (= годовая ставка/12 месяцев),
    protected int monthCount;//количество периодов, в течение которых выплачивается кредит.

    public double annuityPayment(int s, int monthCount) {
        return s * (p + p / (Math.pow(1 + p, monthCount) - 1));//аннуитентный расчет
    }

    /**
     * *Дифференцированный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа по погашению кредита
     * постепенно уменьшается к концу периода кредитования.
     * Ежемесячный платёж, при дифференцированной схеме погашения кредита, состоит из двух составляющих.
     * Первая часть называется основным платежом, размер которого не изменяется на всём сроке кредитования. Основной платёж идет на погашения основного долга по кредиту. Вторая часть – убывающая, которая уменьшается к концу срока кредитования. Данная часть платежа идет на погашение процентов по кредиту.
     *
     * @param s,
     * где s-желаемая сумма
     *
     * @return
     */
    public double differentiatPayment(int s, int monthCount) {
        int principalDiff = s / monthCount; // основной платеж
        for (int i = 0; i < monthCount; i++) {
            System.out.println("Размер выплаты:");
            System.out.println(i+1+"-месяц: " + principalDiff + (s - principalDiff * i) * p);

        }
return 1.1;
        }
    }


