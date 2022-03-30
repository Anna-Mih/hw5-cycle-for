package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @CsvSource(
            value = {
                    "'interval 200-300',200,300,3",
                    "'interval 0-1',0,1,0",
                    "'interval -200-(-100)',-200,-100,0",
                    "'interval -200-200',-200,200,5",
                    "'interval 0-1_000_000',0,1000000,90",
                    "'interval -100-0',-100,0,0"
            },
            delimiter = ','
    )
    @ParameterizedTest
    void shouldCalculateSQR200And300(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateSQR0And1(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateSQRNeg200AndNeg100(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateSQRNeg200And200(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateSQR0And1_000_000(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    void shouldCalculateSQRNeg100And0(String test, long limit1, long limit2, long expected) {
        SQRService service = new SQRService();
        long actual = service.calculateSQR(limit1, limit2);
        assertEquals(expected, actual);
    }

}