package by.epam.javabasics.part3;

/*Подсчитать количество положительных среди чисел а, b, с.*/

public class Task19 {
    public static void main(String[] args) {
        int a = 91;
        int b = -51;
        int c = 0;
        int count = 0; //количество положительных чисед

        if (a > 0) {
            count = count + 1;
        }
        if (b > 0) {
            count = count + 1;
        }
        if (c > 0) {
            count = count + 1;
        }
        System.out.println("Количество положительных чисел: " + count);
    }
}
