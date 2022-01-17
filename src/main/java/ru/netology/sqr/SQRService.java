package ru.netology.sqr;

public class SQRService {
    int count = 0;
    int bottom = 100;
    int up = 200;

    public int square() {
        for (int i = 10; i < 99; i++) {
            if (i * i >= bottom && i * i <= up) {
                count = count + 1;
            }
        }
        System.out.println("Количество корней = "+count);
        return count;
    }
}
