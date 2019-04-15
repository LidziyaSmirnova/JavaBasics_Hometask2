package by.epam.javabasics.part3;

public class Task37 {
    public static void main(String[] args) {
        double x = 2;
        double y;

        if (x >= 3) {
            y = (3 * x) - (x * x) + 9;
        } else {
            y = 1 / ((x * x * x) - 6);
        }
        System.out.println(y);
    }
}
