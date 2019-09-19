package ru.job4j.array;

/**
 * Проверка соответствия начала слов
 */
public class ArrayChar {
    /**
     *
     * @param word - эталонное слово
     * @param pref - сверяемое начало слова
     * @return result: true - если слова совпадают,
     *                 false - если слова не совпадают
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;

        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
            break;
            }
            result = true;
        }
        return result;
    }
}