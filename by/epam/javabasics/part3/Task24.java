package by.epam.javabasics.part3;

/*Составить программу, определяющую результат гадания на ромашке
— «любит—не любит», взяв за исходное данное количество лепестков п.*/

public class Task24 {
    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 25; n++) {
            if (n % 2 == 0) {
                System.out.println("Не любит");
            } else {
                System.out.println("Любит");
            }
        }
    }
}
