package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int sum = 0;
        int month = 0;

        while (sum < (amount + amount * percent / 100)) {
            sum += monthly;
            month ++;
        }
        /**вычисляем, сколько лет будет выплачиваться кредит
         * с округлением дробного результата в большую сторону*/
        year = (int)Math.ceil((double) month / 12);
        return year;
    }
}