package by.epam.javabasics.part3;

/*Составить программу, которая определит по трем введенным сторонам,
        является ли данный треугольник равносторонним.*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: > ");
        a = scanner.nextInt();
        System.out.print("Введите b: > ");
        b = scanner.nextInt();
        System.out.print("Введите c: > ");
        c = scanner.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний");
        } else {
            System.out.println("Треугольник не равносторонний");
        }
    }
}
