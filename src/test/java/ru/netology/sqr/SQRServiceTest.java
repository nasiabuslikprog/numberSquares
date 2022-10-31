package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldCalculateBorders() {
        SQRService service = new SQRService();
        int rangeStart = 200;
        int rangeEnd = 300;
        int expected = 3;
        int actual = service.compareHitSquaresRange(200, 300);
        assertEquals(expected, actual);


    }

    @Test
    void shouldCalculateBordersAlready() {
        SQRService service = new SQRService();
        int rangeStart = 200;
        int rangeEnd = 250;
        int expected = 1;
        int actual = service.compareHitSquaresRange(200, 250);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateBordersWider() {
        SQRService service = new SQRService();
        int rangeStart = 150;
        int rangeEnd = 350;
        int expected = 6;
        int actual = service.compareHitSquaresRange(150, 350);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateBordersZero() {
        SQRService service = new SQRService();
        int rangeStart = 0;
        int rangeEnd = 0;
        int expected = 0;
        int actual = service.compareHitSquaresRange(0, 0);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateBordersNegative() {
        SQRService service = new SQRService();
        int rangeStart = -200;
        int rangeEnd = -300;
        int expected = 0;
        int actual = service.compareHitSquaresRange(-200, -300);
        assertEquals(expected, actual);

    }
}
