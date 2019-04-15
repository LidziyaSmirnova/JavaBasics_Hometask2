package by.epam.javabasics.part3;

/*Составить программу нахождения модуля выражения a*x*x + b*x + c
при заданных значениях a, b, c и х*/

public class Task7 {
    public static void main(String[] args) {
        int a = -2;
        int b = 4;
        int c = -38953;
        int x = -12;

        if (((a * x * x) + (b * x) + c) >= 0) {
            System.out.println((a * x * x) + (b * x) + c);
        } else {
            System.out.println(Math.abs((a * x * x) + (b * x) + c));
        }
    }
}
