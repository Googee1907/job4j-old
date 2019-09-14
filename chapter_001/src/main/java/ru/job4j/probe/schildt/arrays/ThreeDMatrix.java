package ru.job4j.probe.schildt.arrays;

public class ThreeDMatrix {
    public static void main(String[] args) {
    int[][][] threeD = new int[3][4][5];
    /**
     * сначала создается трехмерный массив размерностью Зх4х5,
     * а затем каждый элемент массива заполняется произведением
     * его индексов, и, наконец, эти произведения выводятся на экран.
     */
    int i, j, k;
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 4; j++) {
            for (k = 0; k < 5; k++) {
                threeD[i][j][k] = i * j * k;
            }
        }
    }

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 4; j++) {
            for (k = 0; k < 5; k++) {
                System.out.print(threeD[i][j][k] + " ");
            }
                System.out.println();
            }
            System.out.println();
        }
    }
}