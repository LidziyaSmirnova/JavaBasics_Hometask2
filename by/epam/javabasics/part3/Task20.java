package by.epam.javabasics.part3;

/*Определить, делителем каких чисел а, b, с является число k.*/

public class Task20 {
    public static void main(String[] args) {
        int a = 7;
        int b = -14;
        int c = 5;
        int k = 12;

        if (a % k == 0) {
            System.out.println("k является делителем a");
        }
        if (b % k == 0) {
            System.out.println("k является делителем b");
        }
        if (c % k == 0) {
            System.out.println("k является делителем c");
        }
        if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
            System.out.println("k не является делителем указанных чисел");
        }
    }
}
