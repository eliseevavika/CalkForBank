package Products;

import java.util.Scanner;

/** Класс служит для хранения объектов со свойствами
 * @autor Eliseeva Vika
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        Product1 product1 = new Product1();
        Product2 product2 = new Product2();
        Product3 product3 = new Product3();
        Product4 product4 = new Product4();
        Product5 product5 = new Product5();
        Product6 product6 = new Product6();


        System.out.println("Выберите продукт");
        System.out.println("Наши продукты:");
        System.out.println("1-Потребительский кредит");
        System.out.println("2-Кредит на образование");
        System.out.println("3-Ипотека с гос. поддержкой");
        System.out.println("4-Ипотека на приобретение строящегося жилья");
        System.out.println("5-Кредит на приобретение готового жилья");
        System.out.println("6-Автокредит ");
        System.out.println("Ваш выбор кредит с №:1 ");


        Scanner in = new Scanner(System.in);
        int numberCredit = in.nextInt();
        switch (numberCredit) {
            case 1:
                System.out.println("Потребительский кредит (аннуитентная схема): " + product1.annuityPayment(100000,6));
                System.out.println();
                System.out.println("Потребительский кредит (дифференцированная схема):");
                System.out.println("Потребительский кредит: " + product1.differentiatPayment(100000,6));
                break;

            case 2:
                System.out.println("Образовательный кредит (аннуитентная схема): " + product2.annuityPayment(100000,10));
                System.out.println();
                System.out.println("Образовательный кредит (дифференцированная схема):");
                System.out.println("Образовательный кредит: " + product2.differentiatPayment(100000,10));
                break;
            case 3:
                System.out.println("Образовательный кредит (аннуитентная схема): " + product3.annuityPayment(100000,60));
                System.out.println();
                System.out.println("Образовательный кредит (дифференцированная схема):");
                System.out.println("Образовательный кредит: " + product3.differentiatPayment(100000,60));
                break;

            case 4:
                System.out.println("Образовательный кредит (аннуитентная схема): " + product4.annuityPayment(300000,144));
                System.out.println();
                System.out.println("Образовательный кредит (дифференцированная схема):");
                System.out.println("Образовательный кредит: " + product4.differentiatPayment(300000,144));
                break;

            case 5:
                System.out.println("Образовательный кредит (аннуитентная схема): " + product5.annuityPayment(300000,144));
                System.out.println();
                System.out.println("Образовательный кредит (дифференцированная схема):");
                System.out.println("Образовательный кредит: " + product5.differentiatPayment(400000,252));
                break;

            case 6:
                System.out.println("Образовательный кредит (аннуитентная схема): " + product6.annuityPayment(300000,144));
                System.out.println();
                System.out.println("Образовательный кредит (дифференцированная схема):");
                System.out.println("Образовательный кредит: " + product6.differentiatPayment(200000,50));
                break;
        }


    }
}