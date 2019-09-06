package ru.job4j.probe.schildt;

public class CharDemo {

    public static void Demo1(char ch1, char ch2) {
        ch1 = 88;       // 88 - код символа Х
        ch2 = 'Y';
        System.out.println("chl и ch2: " + ch1 + " и " + ch2);
    }

    public static void Demo2(char ch1) {
        ch1 = 'X';      //символьные переменные ведут себя, как целочисленные значения
        System.out.println("ch1 содержит: " + ch1);

        ch1 ++;         //увеличиваем на единицу значение переменной ch1
        System.out.println("chl теперь содержит: " + ch1);
    }

    public static void main(String[]args) {
        System.out.println();
        Demo1('X','Y');
        Demo2('X');
    }
}
