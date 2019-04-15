package by.epam.javabasics.part3;

/*Даны действительные числа х и у, не равные друг другу.
        Меньшее из этих двух чисел заменить половиной их суммы,
        а большее — их удвоенным произведением.*/

public class Task15 {
    public static void main(String[] args) {
        double a = 33;
        double b = -17.36;


        if (a < b) {
            a = (a + b) / 2.0;
            b = a * b * 2;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        } else {
            b = (a + b) / 2.0;
            a = a * b * 2;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}
