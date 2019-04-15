package by.epam.javabasics.part3;

/*Составить программу нахождения наименьшего из квадратов двух чисел а и b.*/

public class Task8 {
    public static void main(String[] args) {
        int a = 2;
        int b = -4;

        if ((a * a) < (b * b)) {
            System.out.println("Квадрат числа a меньше квадрата числа b");
        } else if ((b * b) < (a * a)) {
            System.out.println("Квадрат числа b меньше квадрата числа a");
        } else {
            System.out.println("Квадраты a и b равны");
        }
    }
}
