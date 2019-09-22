package ru.job4j.array;

/**
 * Проверка соответствия окончания слов
 */
public class EndsWith {
    /**
     * Метод проверки окончания слов
     * @param word - эталонное слово
     * @param post - сверяемое окончание слова
     * @return result: true - если слова совпадают,
     *                 false - если слова не совпадают
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;

        for (int i = 0; i < post.length; i++) {
            if (word[i + (word.length - post.length)] != post[i]) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }
}