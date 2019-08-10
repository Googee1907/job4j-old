package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        double euro = rubleToEuro(140);
        double dollar = rubleToDollar(180);
        double rubles1 = euroToRuble(50);
        double rubles2 = dollarToRuble(100);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("50 euro are " + rubles1 + " rubles.");
        System.out.println("100 dollars are " + rubles2 + " rubles.");
        System.out.println();


         //Блок теста кода
         int inEUR = 140;       //входные параметры
         int expectedEUR = 2;   //переменная, для записи ожидаемого результата
         int outEUR = rubleToEuro(inEUR); //переменная, содержащая вычисленное значение нашего кода
         boolean passedEUR = expectedEUR == outEUR; //сравнение двух переменных (ожидаемое и вычисленное)
         System.out.println("140 rubles are 2. Test result: " + passedEUR);

         int inUSD = 180;
         int expectedUSD = 3;
         int outUSD = rubleToDollar(inUSD);
         boolean passedUSD = expectedUSD == outUSD;
         System.out.println("180 rubles are 3. Test result: " + passedUSD);

         int inRUR1 = 50;
         int expectedRUR1 = 3500;
         int outRUR1 = euroToRuble(inRUR1);
         boolean passedRUR1 = expectedRUR1 == outRUR1;
         System.out.println("50 euro are 3500. Test result: " + passedRUR1);

         int inRUR2 = 100;
         int expectedRUR2 = 6000;
         int outRUR2 = dollarToRuble(inRUR2);
         boolean passedRUR2 = expectedRUR2 == outRUR2;
         System.out.println("100 dollars are 6000. Test result: " + passedRUR2);
    }
}