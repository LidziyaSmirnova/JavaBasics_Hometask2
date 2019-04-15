package by.epam.javabasics.part3;

/*Составить программу,реализующую эпизод применения компьютера в книжном магазине.
        Компьютер запрашивает стоимость книг,сумму денег,внесенную покупателем;
        если сдачи не требуется,печатает на экране «спасибо»;если денег внесено больше,
        чем необходимо,то печатает «возьмите сдачу» и указывает сумму сдачи;
        если денег недостаточно,то печатает сообщение об этом и указывает размер недостающей суммы.*/

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        double price;
        double cash;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость книг > ");
        price = scanner.nextDouble();
        System.out.print("Введите сумму денег, внесенную покупателем > ");
        cash = scanner.nextDouble();

        if (price == cash) {
            System.out.println("спасибо");
        }
        if (cash > price) {
            System.out.println("возьмите сдачу: " + (cash - price));
        }
        if (cash < price) {
            System.out.println("необходимо доплатить: " + (price - cash));
        }
    }
}
