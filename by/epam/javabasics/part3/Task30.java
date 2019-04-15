package by.epam.javabasics.part3;

/*Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
        и заменить их абсолютными значениями, если это не так.*/

public class Task30 {
    public static void main(String[] args) {
        double a = 333.15;
        double b = 11;
        double c = 7;

        if (a > b && b > c && a > c) {
            a = a * 2;
            System.out.println(a);
            b = b * 2;
            System.out.println(b);
            c = c * 2;
            System.out.println(c);
        } else {
            a = Math.abs(a);
            System.out.println(a);
            b = Math.abs(b);
            System.out.println(b);
            c = Math.abs(c);
            System.out.println(c);
        }
    }

}
