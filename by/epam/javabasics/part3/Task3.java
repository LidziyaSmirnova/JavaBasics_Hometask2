package by.epam.javabasics.part3;

/*Составить программу сравнения введенного числа а и цифры 3.
Вывести на экран слово «yes», если число а меньше 3;
если больше, то вывести слово «no».*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: > ");
        a = scanner.nextDouble();
        if (a < 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
