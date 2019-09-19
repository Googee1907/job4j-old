package ru.job4j.array;

public class SortSelected {

    /**
     * Метод сортировки массива методом выборки по возрастанию
     * @param data - массив чисел, который нужно отсортировать выбором по возрастанию
     * MinDiapason.findMin() - метод для получения минимально элемента в массиве.
     * FindLoop.indexOf() - метод для получения индекса минимального элемента.
     * @return data - отсортированный массив
     *
     */
    public static int[] sort(int[] data) {

        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        int temp = data[index]; // Переносим на первое место минимальный элемент
        data[index] = data[0];
        data[0] = temp;

            for (int i = 1; i < data.length; i++) {
                for (int j = i + 1; j < data.length; j++) {
                    if (data[i] > data[j]) { // Сортируем элементы массива по возрастанию
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        return data;
    }
}