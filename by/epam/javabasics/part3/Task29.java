package by.epam.javabasics.part3;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        Определить, будут ли они расположены на одной прямой.*/

public class Task29 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 4;
        int x2 = -1;
        int y2 = -7;
        int x3 = -1;
        int y3 = 7;

        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
