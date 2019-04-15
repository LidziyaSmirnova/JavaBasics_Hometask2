package by.epam.javabasics.part3;

/*На плоскости ХОY задана своими координатами точка А.
        Указать, где она расположена (на какой оси или в каком координатном угле).*/

public class Task16 {
    public static void main(String[] args) {
        int x = 85;
        int y = -5;


        if (x == 0 && y == 0) {
            System.out.println("Точка лежит в начале кооординат");
        } else if (x == 0) {
            System.out.println("Точка лежит на оси y");
        } else if (y == 0) {
            System.out.println("Точка лежит на оси x");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка лежит в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка лежит в 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка лежит в 3 четверти");
        } else {
            System.out.println("Точка лежит в 4 четверти");
        }
    }
}
