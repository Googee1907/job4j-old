package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        boolean isPrime;

        for(int i = 2; i <= finish; i++) {
            isPrime = true;
            for(int j = 2; j <= i/j; j++) {
                if((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            count++;
        }
        return count;
    }
}