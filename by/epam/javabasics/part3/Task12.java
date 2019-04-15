package by.epam.javabasics.part3;

/*Даны три действительных числа. Возвести в квадрат те из них,
        значения которых неотрицательны,
        и в четвертую степень — отрицательные*/

public class Task12 {
    public static void main(String[] args) {
        double a = 33.789;
        double b = -8.28;
        double c = 78;


        if (a >= 0) {
            a = a * a;
        } else {
            a = Math.pow(a, 4);
        }
        if (b >= 0) {
            b = b * b;
        } else {
            b = Math.pow(b, 4);
        }
        if (c >= 0) {
            c = c * c;
        } else {
            c = Math.pow(c, 4);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
