package ru.job4j.probe.course.arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] data = { 5, 3, 2, 1, 4 };
        int tmp = data[0];
        data[0] = data[3];
        data[3] = tmp;
        System.out.println(Arrays.toString(data));
    }
}