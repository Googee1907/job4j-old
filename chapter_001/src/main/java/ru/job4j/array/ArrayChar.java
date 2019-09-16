package ru.job4j.array;

/**
 * Проверка соответствия начала слов
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        String w = "";
        String c = "";
        int i;

        for (i = 0; i < pref.length; i++) {
            w += word[i];
        }
        for (i = 0; i < pref.length; i++) {
            c += pref[i];
        }
        boolean eq = w.equals(c);
        if (eq == true) {
            result = true;
        }
        return result;
    }
}