package by.epam.javabasics.part3;

/*Перераспределить значения переменных х и у так,
        чтобы в х оказалось большее из этих значений, а в y - меньшее.*/

public class Task22 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;

        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        } else if (y > x) {
            y = y + x;
            x = y - x;
            y = y - x;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        } else {
            System.out.println("x и y равны");
        }
    }
}
