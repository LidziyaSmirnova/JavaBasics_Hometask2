package by.epam.javabasics.part3;

public class Task39 {
    public static void main(String[] args) {
        double x = 2;
        double y;

        if (x >= 8) {
            y = x - (x * x) - 9;
        } else {
            y = 1 / ((x * x * x * x) - 6);
        }
        System.out.println(y);
    }
}
