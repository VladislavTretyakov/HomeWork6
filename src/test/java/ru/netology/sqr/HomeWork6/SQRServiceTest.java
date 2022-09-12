package ru.netology.sqr.HomeWork6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {


    @ParameterizedTest
    //@CsvSource({
    //      "3,200,300",
    //      "8,200,500"
    //})
    @CsvFileSource (files="src/test/resources/SQR.csv")
    public void shouldCalcExact(int expected, int x, int y) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.calcSQR(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
