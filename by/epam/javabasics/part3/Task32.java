package by.epam.javabasics.part3;

/*Написать программу, которая по заданным трем числам определяет,
является ли сумма каких-либо двух из них положительной.*/

public class Task32 {
    public static void main(String[] args) {
        int a = 35;
        int b = -78;
        int c = 1;

        if (a + b > 0) {
            System.out.println("Сумма a и b положительна");
        }
        if (a + c > 0) {
            System.out.println("Сумма a и c положительна");
        }
        if (b + c > 0) {
            System.out.println("Сумма b и c положительна");
        }
    }
}
