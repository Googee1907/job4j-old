package ru.job4j.array;
/**
 * Поиск в массиве
 */
public class FindLoop {
    /**
     * @param data - массив
     * @param el - искомый элемент массива
     * @return rst - индекс элемента массива, если такой элемент есть или -1
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}