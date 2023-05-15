package Bai9.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        int number=15;
        String expected="FizzBuzz";
        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz1() {
        int number=138;
        String expected="Fizz";
        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void fizzBuzz2() {
        int number=125;
        String expected="Buzz";
        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }


    @Test
    void fizzBuzz3() {
        int number=6;
        String expected="6";
        String result =FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void translate(){
        int number=0;
        String expected="Không ";
        String result=FizzBuzz.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate1(){
        int number=10;
        String expected="Mười ";
        String result=FizzBuzz.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate2(){
        int number=11;
        String expected="Mười Một";
        String result=FizzBuzz.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate3(){
        int number=3;
        String expected="Ba ";
        String result=FizzBuzz.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate4(){
        int number=70;
        String expected="Bảy Mươi";
        String result=FizzBuzz.translate(number);
        assertEquals(expected,result);
    }

}