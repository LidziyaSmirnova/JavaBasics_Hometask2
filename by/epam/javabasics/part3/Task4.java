package by.epam.javabasics.part3;

/*Составить программу:  равны ли два числа а и b?*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: > ");
        a = scanner.nextInt();
        System.out.print("Введите b: > ");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("a и b равны");
        } else {
            System.out.println("a и b не равны");
        }
    }
}
