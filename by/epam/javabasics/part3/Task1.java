package by.epam.javabasics.part3;

/*Составить программу сравнения двух чисел 1 и 2.
Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.*/

public class Task1 {
    public static void main(String[] args) {
        int x = -26;
        int y = 98;

        if (x < y) {
            System.out.println(7);
        } else {
            System.out.println(8);
        }
    }
}
