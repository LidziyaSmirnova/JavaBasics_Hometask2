package by.epam.javabasics.part3;

/*Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
        Если введены некорректные данные, то сообщить об этом.*/

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 31: > ");

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 31) {
                System.out.println("В месяце не может быть более 31 дня. Введите корректные данные");
            }
        } else {
            System.out.println("Введите корректные данные: целое число от 1 до 31");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите месяц от 1 до 12: > ");
        if (scan.hasNextInt()) {
            b = scan.nextInt();
            if (b > 12) {
                System.out.println("В году не может быть более 12 месяцев. Введите корректные данные");
            }
        } else {
            System.out.println("Введите корректные данные: целое число от 1 до 12");
        }
    }
}
