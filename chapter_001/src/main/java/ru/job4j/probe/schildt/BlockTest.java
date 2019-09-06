package ru.job4j.probe.schildt;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        for(x = 0;  x < 10; x ++) {    //адресатом этого оператора цикла служит блок кода
            System.out.println("Знaчeниe х: " + x);
            y = y - 2;
            System.out.println("Знaчeниe у: " + y);
        }
    }
}