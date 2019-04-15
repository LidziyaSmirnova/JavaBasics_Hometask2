package by.epam.javabasics.part3;

/*Даны два угла треугольника (в градусах).
        Определить, существует ли такой треугольник,
        и если да, то будет ли он прямоугольным.*/

public class Task14 {
    public static void main(String[] args) {
        int x = 40;
        int y = 180;

        if ((x + y) < 180) {
            System.out.println("Треугольник существует");
            if ((x == 90) || (y == 90) || ((x + y) == 90)) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
