public class Main {
    public static void main(String[] args) {

        // Задание 1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задание 3
        for (int i = 0; i <= 17; i = i + 2 ) {
            System.out.println(i);
        }

        // Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задание 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        // Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задание 7
        System.out.println(1);
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задание 8
        int payment = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++){
            total = total + payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        // Задание 9
        int total2 = 0;
        for (int i = 1; i < 13; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей.");
        }
    }
}