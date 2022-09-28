package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SQRServiceTest {
    @Test
    public void calculateSQR() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minNumber = 100;
        int maxNumber = 100;
        int actual = service.calculateSQR(minNumber, maxNumber);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 35;
        int minNumber = 100;
        int maxNumber = 2000;
        int actual = service.calculateSQR(minNumber, maxNumber);
        assertEquals(expected, actual);
    }

}
