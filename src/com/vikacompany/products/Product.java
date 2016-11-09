package com.vikacompany.products;


public abstract class Product {
    /**
     * Проверка переданных параметров на Валидность
     *
     * @param s  сумма кредита
     * @param monthCount кол-во месяцев
     * @return true если параметры верны
     */
    public abstract boolean isValid(int s, int monthCount);

    /**
     * Расчет процента
     *
     * @param monthCount кол-во месяцев
     * @return процент
     */
    protected abstract double countPercent(int monthCount);

    /**
     * Полная печать расчета Пользовательского кредита по аннуитентной и дифференцированной схемам.
     *
     * @param sum сумма кредита
     * @param monthCount  кол-во месяцев
     */
    public void printConditions(int sum, int monthCount) {
            double percent = countPercent(monthCount);
            printAnnuityPayment(sum, monthCount, percent);
            printDifferentiatPayment(sum, monthCount, percent);
        }


    /**
     * Расчет и вывод аннуитентного платежа
     * <p>
     * Аннуитетный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа остаётся постоянным на всём периоде кредитования.
     * </p>
     * @param s сумма кредита
     * @param monthCount кол-во месяцев
     * @param percent процентная ставка
     */
    public void printAnnuityPayment(int s, int monthCount, double percent) {
        double p = percent / (12 * 100);
        double result = s * (p + p / (Math.pow(1 + p, monthCount) - 1));
        System.out.println("Аннуитентная схема: ");
        System.out.println(result);
        System.out.println("Деталлизация расчета:");
        double mainDebtresult = 0.0;
        for (int i = 0; i < monthCount; i++) {
            System.out.println(i + 1 + "-месяц: ");
            System.out.println("Остаток кредита:");
            double creditBalance = s - mainDebtresult;
            System.out.println(creditBalance);
            System.out.println("Проценты:");
            double percentDetal = s * p;
            System.out.println(percentDetal);
            System.out.println("Основной долг:");
            mainDebtresult = result - percentDetal;
            System.out.println(mainDebtresult);


        }
    }

    /**
     * Расчет и вывод диференцированного платежа
     * <p>
     * Дифференцированный платеж – вариант ежемесячного платежа по кредиту, когда размер ежемесячного платежа по погашению кредита постепенно уменьшается к концу периода кредитования.
     *</p>
     * @param s сумма кредита
     * @param monthCount кол-во месяцев
     * @param percent  процентная ставка
     */
    public void printDifferentiatPayment(int s, int monthCount, double percent) {
        double p = percent / (12 * 100);
        double principalDiff = (double) s / monthCount; // основной платеж
        System.out.println("Дифференцированная схема:");
        System.out.println("Размер выплаты:");
        for (int i = 0; i < monthCount; i++) {

            double result = principalDiff + (s - principalDiff * i) * p;
            System.out.println(i + 1 + "-месяц: " + result);
        }
    }
}


