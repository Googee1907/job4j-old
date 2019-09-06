package ru.job4j.condition;

public class SqAreaExe {
    public static int square(int P, int k) {
        int S;
        return S = (P / (2 * (1 + k))) * k * (P / (2 * (1 + k)));
    }

    public static void main(String[] args) {
        int S = square(6, 2);
        System.out.println("P = 6, k = 2, S = 2, real = " + S);
    }
}