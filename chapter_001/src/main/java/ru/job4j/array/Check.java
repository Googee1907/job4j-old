package ru.job4j.array;

public class Check {
    /**
     *
     * @param data - массив логических элементов, в котором они все проверяются с эталоном
     * i - счетчик истиных значений
     * j - счетчик ложных значений
     * @return result: true - если массив однородный,
     *                 false - если массив неоднородный
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int i = 1;
        int j = 0;

        for (int count = 1; count < data.length; count++) {
            int measurer = data[0] == data[count] ? i++ : j++;
            if (i == 0 || j == 0) {
                result = true;
            }
        }
        return result;
    }
}