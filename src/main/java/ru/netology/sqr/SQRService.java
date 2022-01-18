package ru.netology.sqr;

public class SQRService {
    int bottom = 100;
    int up = 200;

    public int square() {
        int count = 0;
        for (int i = 8; i < 100; i++) {
            if (i * i >= bottom && i * i <= up) {
                count = count + 1;
            }
        }
        System.out.println("Количество корней = " + count);
        return count;
    }
}
