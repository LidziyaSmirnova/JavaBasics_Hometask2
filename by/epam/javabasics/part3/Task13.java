package by.epam.javabasics.part3;

/*Даны две точки А(х1, у1) и В(х2, у2).
        Составить алгоритм, определяющий,
        которая из точек находится ближе к началу координат*/

public class Task13 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = -4;
        int x2 = -17;
        int y2 = 2;

        if ((x1 * x1 + y1 * y1) < (x2 * x2 + y2 * y2)) {
            System.out.println("Точка (х1;y1) ближе");
        } else if ((x1 * x1 + y1 * y1) > (x2 * x2 + y2 * y2)) {
            System.out.println("Точка (x2;y2) ближе");
        } else {
            System.out.println("Точки на одинаковом расстоянии");
        }
    }
}
