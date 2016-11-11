package com.vikacompany.credits;


public abstract class Credit {
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
//
    public void printAnnuityPayment(int s, int monthCount, double percent) {
        double p = percent / (12 * 100);
        double result = s * (p + p / (Math.pow(1 + p, monthCount) - 1));
        System.out.println("Аннуитентная схема: сумма месячного платежа:");
        System.out.println(String.format("%(.2f",result));
        System.out.println("Деталлизация расчета:");
        double  mainDebtresult=0.0;
        double creditBalance=s;
        for (int i = 0; i < monthCount; i++) {
            System.out.println(i + 1 + "-месяц: ");


            System.out.print("Остаток кредита:");
            creditBalance = creditBalance - mainDebtresult;
            System.out.println(String.format("%(.2f",creditBalance));

                            System.out.print("Проценты:");
            double percentDetal = creditBalance * p;
            System.out.println(String.format("%(.2f",percentDetal));


            System.out.print("Основной долг:");
            mainDebtresult = result - percentDetal;
            System.out.println(String.format("%(.2f",mainDebtresult));
            System.out.println();

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
            System.out.println(i + 1 + "-месяц: "+ String.format("%(.2f",result));
        }
    }
}


