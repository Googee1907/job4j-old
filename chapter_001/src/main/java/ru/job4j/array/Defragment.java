package ru.job4j.array;

public class Defragment {
    /**
     * Метод фрагментирования строкового массива
     * @param array - строковый массив
     * @return array - дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            // Ищем непустую ячейку
            if (array[index] == null) {
                int count = index - 1;
                while (count < array.length && array[index] == null){
                    count++;
                    // Перемещаем непустую ячейку к началу массива, вычленяя null
                    if (count < array.length){
                        array[index] = array[count];
                        array[count] = null;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}