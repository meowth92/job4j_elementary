package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number != 1;
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }
}
