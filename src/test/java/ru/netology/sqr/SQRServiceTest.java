package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSquare() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.square();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxSquare() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.maxSquare();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSquare() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.notSquare();
        assertEquals(expected, actual);
    }
}
