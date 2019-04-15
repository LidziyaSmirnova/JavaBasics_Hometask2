package by.epam.javabasics.part3;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Task26 {
    public static void main(String[] args) {
        int a=2;
        int b=-77;
        int c=39;

        if (a > b && a > c) {
            if (b < c) {
                System.out.println(a + b);
            } else {
                System.out.println(a + c);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + c);
            } else {
                System.out.println(b + a);
            }
        } else if (c > a && c > b) {
            if (b > a) {
                System.out.println(c + a);
            } else {
                System.out.println(c + b);
            }
        }
        if (a == b && a == c && b == c) {
            System.out.println("Все числа равны");
        }
    }
}
