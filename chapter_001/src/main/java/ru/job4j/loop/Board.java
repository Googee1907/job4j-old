package ru.job4j.loop;

public class Board {
    public static String paint(int width, int height) {
        String result = "";
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                // Сумма индексов всегда четное число (число делится на 2 без остатка)
                if ((row + cell) % 2 == 0) {
                    result += "X";
                    System.out.print("X");
                } else {
                    result += " ";
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
            result += System.lineSeparator();
        }
        return result;
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}