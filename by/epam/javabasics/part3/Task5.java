package by.epam.javabasics.part3;

/*Составить программу: определения наименьшего из двух чисел а и b.*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: > ");
        a = scanner.nextInt();
        System.out.print("Введите b: > ");
        b = scanner.nextInt();

        if (a < b) {
            System.out.println("a меньше b");
        } else if (b < a) {
            System.out.println("b меньше a");
        } else {
            System.out.println("a и b равны");
        }
    }
}
