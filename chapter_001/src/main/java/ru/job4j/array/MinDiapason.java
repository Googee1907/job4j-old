package ru.job4j.array;

public class MinDiapason {

    /**
     * Метод поиска минимального элемента массива в диапазоне
     * @param data - массив
     * @param start - начальный индекс диапазона поиска
     * @param finish конечный индекс диапазона поиска
     * @return min - минимальный элемент в заданном диапазоне
     */
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start]; // Предполагаем, что первый элемент является минимальным
        for (int i = start; i < finish; i++) {
            for (int j = i + 1; j != finish; j++) {
                if (data[j] < min) { // Ищем минимальный элемент
                    min = data[j];
                }
            }
        }
        return min;
    }
}