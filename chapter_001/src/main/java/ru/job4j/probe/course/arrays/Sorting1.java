package ru.job4j.probe.course.arrays;

import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {
        int[][] field = {
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 1, 0 },
        };
        int temp = field[1][1];
        field[1][1] = field[2][1];
        field[2][1] = temp;

        temp = field[0][2];
        field[0][2] = field[1][2];
        field[1][2] = temp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}