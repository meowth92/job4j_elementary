package ru.job4j.calculator;

public class Fit {
    public static double manWeight(int height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(int height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        int height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        int heightWoman = 170;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 167 is " + woman);
    }
}
