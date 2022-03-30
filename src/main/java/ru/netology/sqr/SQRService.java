package ru.netology.sqr;

public class SQRService {
    public long calculateSQR(long limit1, long limit2) {
        long counter = 0;
        for (int i = 10; i <= 99; i++) {
            long sqrt = i * i;
            if (sqrt >= limit1 && sqrt <= limit2) {
                counter++;
            }
        }
        return counter;
    }
}
