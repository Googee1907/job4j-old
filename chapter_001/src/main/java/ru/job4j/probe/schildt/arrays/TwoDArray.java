package ru.job4j.probe.schildt.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        /**
         * элементы массива нумеруются слева направо
         * и сверху вниз, а затем выводятся их значения
         */
        int[][] twoD = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}