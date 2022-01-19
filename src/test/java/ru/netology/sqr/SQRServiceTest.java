package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSquare() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.square(service.bottom,service.up);
        assertEquals(expected, actual);
    }
}