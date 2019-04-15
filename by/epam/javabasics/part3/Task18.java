package by.epam.javabasics.part3;

/*Подсчитать количество отрицательных среди чисел а, b, с.*/

public class Task18 {
    public static void main(String[] args) {
        int a = -3;
        int b = 78;
        int c = 0;
        int count = 0; //количество отрицательных чисед

        if (a < 0) {
            count = count + 1;
        }
        if (b < 0) {
            count = count + 1;
        }
        if (c < 0) {
            count = count + 1;
        }
        System.out.println("Количество отрицательных чисел: " + count);
    }
}
