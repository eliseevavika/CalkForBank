package com.vikacompany.products;

import java.util.Scanner;

/**
 * Потребительский кредит
 * <p>срок до 5 лет, ставка от 14.9%, сумма до 1.5 млн руб</p>
 * <p> Мин. сумма кредита*  15 000</p>
 * <p>Макс. сумма кредита**  1 500 000</p>
 * <p>Срок кредита  от 3 месяцев до 5 лет</p>
 * <p>Срок (мес):3-24 месяца,  14,9%</p>
 * <p>Срок (мес):25-60 мес, 15.9%</p>
 */

public class Product1 extends Product {

    protected boolean isValid(int s, int monthCount) {
        if (s < 15000 || s > 1500000||monthCount < 3|| monthCount > 60) {
            continuedSelectConditions(s, monthCount);
        }
        return true;
    }


    protected double countPercent(int monthCount) {
        if (monthCount >= 3 && monthCount <= 24) {
            return 14.9;
        } else if (monthCount >= 25 && monthCount <= 60) {
            return 15.9;
        }

        return 20;
    }

    public boolean continueInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt() == 1;
    }

    public int continuedSelectConditions(int s, int monthCount) {
        if (monthCount < 3 || monthCount < 3 & s<15000||monthCount < 3 & s>1500000 ) {
            System.out.println("Минимальный срок кредита 3 месяца, от 15 тыс до 1.5 млн");
            System.out.println("Можем вам предложить процентную ставку по кредиту от 3 до 24 месяцев, которая составляет 14.9 %");
            System.out.println("Хотите выбрать другой срок кредита?");
            System.out.println("Если да-введите 1");
            System.out.println("Если нет-введите любую клавишу");
            continueInput();
            if (continueInput()) {
                continueInputConditions();
                isValid(s, monthCount);
            }
        }

        if (monthCount >60 ||monthCount >60 & s<15000||monthCount>60 & s>1500000){
            System.out.println("Максимальный срок кредита 60 месяцев, от 15 тыс до 1.5 млн");
            System.out.println("Можем вам предложить процентную ставку по кредиту от 25 до 60 месяцев, которая составляет 15.9 %");
            System.out.println("Хотите выбрать другой срок кредита?");
            System.out.println("Если да-введите 1");
            System.out.println("Если нет-введите любую клавишу");
            continueInput();
            if (continueInput()) {
                continueInputConditions();
                isValid(s, monthCount);
            }
        }
        if(s<15000||s>1500000){
            System.out.println("Минимальная сумма по данному кредиту-15 тыс, максимальная сумма-1.5 млн");
            System.out.println("Хотите ввести другие параметры?");
            System.out.println("Если да-введите 1");
            System.out.println("Если нет-введите любую клавишу");
            continueInput();
            if (continueInput()) {
                continueInputConditions();

            }
        }
        return s;

        }



    public int continueInputConditions() {
        System.out.println("Введите сумму кредита от 15 тыс до  1,5 млн");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        System.out.println("Введите срок кредита от 3 месяцев");
        int monthCount = in.nextInt();
        return s;
    }
}