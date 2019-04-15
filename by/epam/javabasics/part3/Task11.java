package by.epam.javabasics.part3;

/*Составить программу, которая определит площадь какого треугольника больше*/

public class Task11 {
    public static void main(String[] args) {
        int a1 = 33; //основание треугольника 1
        int a2 = 9; //основание треугольника 2
        int h1 = 7; //высота треугольника 1
        int h2 = 12; //высота треугольника 2

        if ((a1 * h1 / 2) > (a2 * h2 / 2)) {
            System.out.println("Площадь треугольника 1 больше");
        } else if ((a2 * h2 / 2) > (a1 * h1 / 2)) {
            System.out.println("Площадь треугольника 2 больше");
        } else {
            System.out.println("Площади равны");
        }
    }
}
