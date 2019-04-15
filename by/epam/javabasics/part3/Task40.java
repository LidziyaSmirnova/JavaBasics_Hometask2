package by.epam.javabasics.part3;

public class Task40 {
    public static void main(String[] args) {
        double x = 0;
        double y;

        if (x <= 13) {
            y = 9 - (x * x * x);
        } else {
            y = -3 / (x + 1);
        }
        System.out.println(y);
    }
}
