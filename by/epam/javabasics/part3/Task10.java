package by.epam.javabasics.part3;

/*Составить программу, которая определит площадь какого круга меньше*/

public class Task10 {
    public static void main(String[] args) {
        int r1 = 3; //радиус круга 1
        int r2 = 3; //радиус круга 2

        if ((Math.PI * r1 * r1) < (Math.PI * r2 * r2)) {
            System.out.println("Площадь круга 1 меньше");
        } else if ((Math.PI * r2 * r2) < (Math.PI * r1 * r1)) {
            System.out.println("Площадь круга 2 меньше");
        } else {
            System.out.println("Площади равны");
        }
    }
}
