package ru.job4j.array;

public class Check {
    /**
     *
     * @param data - массив логических элементов, в котором они все проверяются с эталоном
     * @return result: true - если массив однородный,
     *                 false - если массив неоднородный
     */
    public boolean mono(boolean[] data) {
        boolean result = false;

        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}