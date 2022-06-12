package ru.netology;

public class SQRService {
    public int sqrCell(int lowerBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}