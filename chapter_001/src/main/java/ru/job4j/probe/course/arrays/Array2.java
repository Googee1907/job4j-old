package ru.job4j.probe.course.arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index != 5; index ++) {
            numbers[index] = numbers.length - index;
            int value = numbers[index];
            System.out.println(value);
        }
    }
}