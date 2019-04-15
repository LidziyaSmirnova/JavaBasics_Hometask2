package by.epam.javabasics.part3;

/*Вычислить число и месяц в невисокосном году по номеру дня.*/

public class Task35 {
    public static void main(String[] args) {
        int day = 360;

        if (day > 0 && day <= 31) {
            System.out.println(day + " января");
        }
        if (day > 31 && day <= 59) {
            System.out.println((day - 31) + " февраля");
        }
        if (day > 59 && day <= 90) {
            System.out.println((day - 59) + " марта");
        }
        if (day > 90 && day <= 120) {
            System.out.println((day - 90) + " апреля");
        }
        if (day > 121 && day <= 151) {
            System.out.println((day - 121) + " мая");
        }
        if (day > 151 && day <= 181) {
            System.out.println((day - 151) + " июня");
        }
        if (day > 181 && day <= 212) {
            System.out.println((day - 181) + " июля");
        }
        if (day > 212 && day <= 243) {
            System.out.println((day - 212) + " августа");
        }
        if (day > 243 && day <= 273) {
            System.out.println((day - 243) + " сентября");
        }
        if (day > 273 && day <= 304) {
            System.out.println((day - 273) + " октября");
        }
        if (day > 304 && day <= 334) {
            System.out.println((day - 304) + " ноября");
        }
        if (day > 334 && day <= 365) {
            System.out.println((day - 334) + " декабря");
        }
        if (day < 0 && day > 365) {
            System.out.println("Введен неверный день");
        }
    }
}

