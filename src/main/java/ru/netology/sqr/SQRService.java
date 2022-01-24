package ru.netology.sqr;

public class SQRService {
    public int square(int bottom, int up) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= bottom && i * i <= up) {
                count = count + 1;
            }
        }
        System.out.println("Количество корней = " + count);
        return count;
    }
}
