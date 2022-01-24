package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSquare() {
        SQRService service = new SQRService();
        int bottom = 100;
        int up = 300;
        int expected = 5;
        int actual = service.square(bottom, up);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSquare() {
        SQRService service = new SQRService();
        int bottom = 100;
        int up = 9801;
        int expected = 90;
        int actual = service.square(bottom, up);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSquare() {
        SQRService service = new SQRService();
        int bottom = 3;
        int up = 8;
        int expected = 0;
        int actual = service.square(bottom, up);
        assertEquals(expected, actual);
    }
}
