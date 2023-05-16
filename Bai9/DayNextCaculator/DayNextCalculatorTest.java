package Bai9.DayNextCaculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

class DayNextCalculatorTest {
    private DayNextCalculator dayNextCalculator;
    @Test
    void dayNextCalculator() throws ParseException {
       String expected="2/1/2023";
       String result=DayNextCalculator.output(1,1,2023,false);
       Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator1() throws ParseException {
        String expected="1/2/2023";
        String result=DayNextCalculator.output(31,1,2023,false);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator2() throws ParseException {
        String expected="1/5/2023";
        String result=DayNextCalculator.output(30,4,2023,false);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator3() throws ParseException {
        String expected="1/3/2023";
        String result=DayNextCalculator.output(28,2,2023,false);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculato4r() throws ParseException {
        String expected="1/3/2020";
        String result=DayNextCalculator.output(29,2,2020,true);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void dayNextCalculator5() throws ParseException {
        String expected="1/1/2024";
        String result=DayNextCalculator.output(31,12,2023,false);
        Assertions.assertEquals(expected, result);
    }
}