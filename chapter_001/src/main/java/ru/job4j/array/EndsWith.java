package ru.job4j.array;

/**
 * Проверка соответствия окончания слов
 */
public class EndsWith {
    /**
     *
     * @param word - проверяемое слово
     * @param post - предлагаемое окончание слова
     * w - переменная для заполнения окончанием слова
     * p - переменная для заполнения предлагаемым окончанием
     * eq - переменная, сравнивающая окончания
     * @return result:  true - если окончание совпадает,
     *      *           false - если не совпадает
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        String w = "";
        String p = "";
        int i;

        for (i = (word.length - post.length); i < word.length; i++) {
            w += word[i];
        }
        for (i = 0; i < post.length; i++) {
            p += post[i];
        }
        boolean eq = w.equals(p);
        if (eq == true) {
            result = true;
        }
        return result;
    }
}