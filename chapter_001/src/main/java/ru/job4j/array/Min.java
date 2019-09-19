package ru.job4j.array;

public class Min {
    /**
     * Метод поиска минимального элемента массива
     * @param array - массив
     * @return min - минимальный элемент
     */
    public static int findMin(int[] array) {
        int min = array[0]; // Предполагаем, что первый элемент является минимальным
        for (int index = 0; index < array.length; index++) {
            for (int j = index + 1; j != array.length; j++) {
                if (array[j] < min) { // Ищем минимальный элемент
                    min = array[j];
                }
            }
        }
        return min;
    }
}