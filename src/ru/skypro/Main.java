package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Task1

        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("  ");

        // Task2

        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница  " + friday + " число.  Необходимо составить отчет");
            friday = friday + 7;
        }
        System.out.println();

        // Task3

        int nowYear = 2022;
        int kometaYear = 0;
        while (kometaYear <= nowYear) {
            kometaYear = kometaYear + 79;
            if (kometaYear > nowYear - 200){
                System.out.println(kometaYear);
            }
        }
    }
}
