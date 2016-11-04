package com.company.products;

/**
 * Аннуитетный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа остаётся постоянным на всём периоде кредитования.
 */
public abstract class Product {


    protected abstract boolean isValid(int s, int monthCount);

    public abstract void printConditions(int sum, int monthCount);

    /**
     * @param s
     * @return сумму выплаты за 1 месяц
     */
    public double getAnnuityPayment(int s, int monthCount, double percent) {
        double p = percent / (12 * 100);
        return s * (p + p / (Math.pow(1 + p, monthCount) - 1));
    }

    /**
     * *Дифференцированный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа по погашению кредита
     * постепенно уменьшается к концу периода кредитования.
     * Ежемесячный платёж, при дифференцированной схеме погашения кредита, состоит из двух составляющих.
     * Первая часть называется основным платежом, размер которого не изменяется на всём сроке кредитования. Основной платёж идет на погашения основного долга по кредиту. Вторая часть – убывающая, которая уменьшается к концу срока кредитования. Данная часть платежа идет на погашение процентов по кредиту.
     *
     * @param s-желаемая сумма
     * @return
     */
    public void printDifferentiatPayment(int s, int monthCount, double percent) {
        double p = percent / (12 * 100);
        double principalDiff = (double) s / monthCount; // основной платеж
        for (int i = 0; i < monthCount; i++) {
            System.out.println("Размер выплаты:");
            double result = principalDiff + (s - principalDiff * i) * p;
            System.out.println(i + 1 + "-месяц: " + result);
        }
    }
}


