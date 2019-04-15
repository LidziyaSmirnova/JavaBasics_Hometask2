package by.epam.javabasics.part3;

/*Найти max{min(a, b), min(c, d)}.*/

public class Task27 {
    public static void main(String[] args) {
        int a = 3;
        int b = 58;
        int c = -112;
        int d = 2;
        int min1;
        int min2;
        int max;

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        System.out.println(min1);

        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        System.out.println(min2);

        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println("Максимальное значение из минимальных: " + max);
    }
}
