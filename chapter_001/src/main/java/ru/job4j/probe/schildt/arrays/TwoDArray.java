package ru.job4j.probe.schildt.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        /**
         * элементы массива нумеруются слева направо
         * и сверху вниз, а затем выводятся их значения
         */
        int[][] twoD = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}