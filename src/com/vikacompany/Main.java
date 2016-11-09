package com.vikacompany;

import com.vikacompany.credits.*;


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


        ConsumerCredit consumerCredit = new ConsumerCredit();
        CreditForEducation creditForEducation = new CreditForEducation();
        CreditStateSupport creditStateSupport = new CreditStateSupport();
        CreditForNewBuilding creditForNewBuilding = new CreditForNewBuilding();
        CreditForFinishedHousing creditForFinishedHousing = new CreditForFinishedHousing();
        CreditForCar creditForCar = new CreditForCar();


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
                    if (consumerCredit.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        consumerCredit.printConditions(sum, monthCount);
                    } else {
                        consumerCredit.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 2:
                    if (creditForEducation.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        creditForEducation.printConditions(sum, monthCount);
                    } else {
                        creditForEducation.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 3:
                    if (creditStateSupport.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        creditStateSupport.printConditions(sum, monthCount);
                    } else {
                        creditStateSupport.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 4:
                    if (creditForNewBuilding.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        creditForNewBuilding.printConditions(sum, monthCount);
                    } else {
                        creditForNewBuilding.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 5:
                    if (creditForFinishedHousing.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        creditForFinishedHousing.printConditions(sum, monthCount);
                    } else {
                        creditForFinishedHousing.offerAlternativeConditions(sum, monthCount);
                    }
                    break;

                case 6:
                    if (creditForCar.isValid(sum, monthCount)) {
                        isDataCorrect=true;
                        creditForCar.printConditions(sum, monthCount);
                    } else {
                        creditForCar.offerAlternativeConditions(sum, monthCount);
                    }
                    break;
                default:
                    System.out.println("Указан неверный продукт");
                    break;
            }
        }

    }
}
