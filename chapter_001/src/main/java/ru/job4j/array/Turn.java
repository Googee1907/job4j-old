package ru.job4j.array;

public class Turn {
    /**
     * Метод разворачивания массива наоборот
     * @param array - исходный массив
     * @return array - перевернутый массив
     */
    public int[] back (int[] array) {
        int half = array.length / 2; // int отбрасывает дробную часть, поэтому это условие
                                    // верно для четного и нечетного коичества элементов
        for (int i = 0; i <= half - 1; i++) {
            // Запишем левый элемент в temp
            int temp = array[i];
            // Присвоим в освободившийся индекс значение зеркального элемента
            array[i] = array[array.length - 1 - i];
            // Присвоим зеркальному элементу значение из temp
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}