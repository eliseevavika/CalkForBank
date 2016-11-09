package com.vikacompany;

import com.vikacompany.products.*;


import java.util.Scanner;

/**
 * @version 1.0
 * @author Eliseeva Vika
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите продукт");
        System.out.println("Наши продукты:");
        System.out.println("1-Потребительский кредит");
        System.out.println("2-Кредит на образование");
        System.out.println("3-Ипотека с гос. поддержкой");
        System.out.println("4-Ипотека на приобретение строящегося жилья");
        System.out.println("5-Кредит на приобретение готового жилья");
        System.out.println("6-Автокредит ");
        System.out.println("Ваш выбор кредит с №: ");


        Product1 product1 = new Product1();
        Product2 product2 = new Product2();
        Product3 product3 = new Product3();
        Product4 product4 = new Product4();
        Product5 product5 = new Product5();
        Product6 product6 = new Product6();


        Scanner in = new Scanner(System.in);
        int numberCredit = in.nextInt();
        boolean isDataCorrect = false;
        while (!isDataCorrect) {
            System.out.println("Введите сумму кредита:");
            int sum = in.nextInt();

            System.out.println("Введите срок кредита в месяцах:");
            int monthCount = in.nextInt();

            switch (numberCredit) {
                case 1:
                    if (product1.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        product1.printConditions(sum, monthCount);
                    } else {
                        product1.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 2:
                    product2.printConditions(sum, monthCount);
                    break;

                case 3:
                    product3.printConditions(sum, monthCount);
                    break;

                case 4:
                    product4.printConditions(sum, monthCount);
                    break;

                case 5:
                    product5.printConditions(sum, monthCount);
                    break;

                case 6:
                    product6.printConditions(sum, monthCount);
                    break;

                default:
                    System.out.println("Указан неверный продукт");
                    break;
            }
        }

    }
}
