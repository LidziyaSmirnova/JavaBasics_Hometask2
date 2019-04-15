package by.epam.javabasics.part3;

/*Составить программу сравнения двух чисел 1 и 2.
Если 1 меньше 2 – вывести на экран слово «yes»,
в противном случае – слово «no»*/

public class Task2 {
    public static void main(String[] args) {
        double x = -26.258;
        double y = -5.85;

        if (x < y) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
