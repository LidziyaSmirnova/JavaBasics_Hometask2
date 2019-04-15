package by.epam.javabasics.part3;

/*Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
        В зависимости от ответа на экране должен появиться текст
        «Мне нравятся девочки!» или «Мне нравятся мальчики!».*/

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        String a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Кто ты: мальчик или девочка? Введи Д или М > ");
        a = scanner.next();

        if (a.equals("Д")) {
            System.out.println("Мне нравятся девочки!");
        } else if (a.equals("М")) {
            System.out.println("Мне нравятся мальчики!");
        } else {
            System.out.println("Введите корректные данные");
        }
    }
}
