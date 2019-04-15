package by.epam.javabasics.part3;

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        Определить, пройдет ли кирпич через отверстие*/

public class Task31 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int x = 33;
        int y = 9;
        int z = 7;

        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
    }
}
