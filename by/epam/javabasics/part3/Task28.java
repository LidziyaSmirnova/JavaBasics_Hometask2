package by.epam.javabasics.part3;

/*Даны три числа a, b, с. Определить, какое из них равно d.
        Если ни одно не равно d, то найти max(d — a, d — b, d —c).*/

public class Task28 {
    public static void main(String[] args) {
        int a = 3;
        int b = 58;
        int c = -112;
        int d = 2;

        if (a == d) {
            System.out.println("a равно d");
        } else if (b == d) {
            System.out.println("b равно d");
        } else if (c == d) {
            System.out.println("c равно d");
        } else {
            int max = d - a;
            if (d - b > max) {
                max = d - b;
            }
            if (d - c > max) {
                max = d - c;
            }
            System.out.println(max);
        }
    }
}
