package ru.job4j.array;

public class Turn {
    public int[] back (int[] array) {
        int temp;
        // Проверим массив на четность/нечетность элементов
        int half = array.length % 2 == 0 ? array.length / 2 : (array.length - 1) / 2;

        for (int i = 0; i <= half - 1; i++) {
            // Запишем левый элемент во temp
            temp = array[i];
            // Присвоим в освободившийся индекс значение зеркального элемента
            array[i] = array[array.length - 1 - i];
            // Присвоим зеркальному элементу значение из temp
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}