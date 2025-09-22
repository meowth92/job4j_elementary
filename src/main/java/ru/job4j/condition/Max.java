package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int a) {
        return max(left, right) > a ? max(left, right) : a;
    }

    public static int max(int left, int right, int a, int b) {
        return max(left, right) > max(a, b) ? max(left, right) : max(a, b);
    }
}
