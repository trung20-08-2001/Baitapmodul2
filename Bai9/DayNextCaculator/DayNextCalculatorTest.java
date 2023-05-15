package Bai9.DayNextCaculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

class DayNextCalculatorTest {
    private DayNextCalculator dayNextCalculator;
    @Test
    void dayNextCalculator() throws ParseException {
       String today="1/1/2023";
       String expected="02/01/2023";
       String result=DayNextCalculator.dayNextCalculator(today);
       Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator1() throws ParseException {
        String today="31/1/2023";
        String expected="01/02/2023";
        String result=DayNextCalculator.dayNextCalculator(today);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator2() throws ParseException {
        String today="30/4/2023";
        String expected="01/05/2023";
        String result=DayNextCalculator.dayNextCalculator(today);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator3() throws ParseException {
        String today="28/2/2023";
        String expected="01/03/2023";
        String result=DayNextCalculator.dayNextCalculator(today);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculato4r() throws ParseException {
        String today="29/2/2020";
        String expected="01/03/2020";
        String result=DayNextCalculator.dayNextCalculator(today);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator5() throws ParseException {
        String today="31/12/2023";
        String expected="01/01/2024";
        String result=DayNextCalculator.dayNextCalculator(today);
        Assertions.assertEquals(expected, result);
    }
}