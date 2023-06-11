package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        if (finish >= 2) {
            count++;
        }
        for (int number = 3; number <= finish; number += 2) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}