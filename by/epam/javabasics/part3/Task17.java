package by.epam.javabasics.part3;

/*Даны целые числа т, п. Если числа не равны,
        то заменить каждое из них одним и тем же числом,
        равным большему из исходных, а если равны, то заменить числа нулями.*/

public class Task17 {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;

        if (m != n) {
            if (m > n) {
                n = m;
                System.out.println("m: " + m);
                System.out.println("n: " + n);
            } else {
                m = n;
                System.out.println("m: " + m);
                System.out.println("n: " + n);
            }
        } else {
            m = 0;
            n = 0;
            System.out.println("m: " + m);
            System.out.println("n: " + n);
        }
    }
}
