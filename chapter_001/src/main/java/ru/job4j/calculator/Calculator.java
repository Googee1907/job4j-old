package ru.job4j.calculator;
/**
 * Class Calculator - решение задачи урока 1 части 001
 * @author German Gordienko (googee@rambler.ru)
 * @version 1.0
 * @since 05.09.2019
 */
public class Calculator {

    public static void add(int first, int second) {
        int result =  first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void subtrack(int first, int second) {
        int result =  first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void multiply(int first, int second) {
        int result =  first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void div(int first, int second) {
        int result =  first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Main - арифметический метод
     * функция add - сложение
     * функция subtrack - вычитание
     * функция multiply - умножение
     * функция div - деление
     */
    public static void main(String[] args) {
        add(1, 1);
        subtrack(10, 5);
        multiply(2, 1);
        div(4, 2);
    }
}