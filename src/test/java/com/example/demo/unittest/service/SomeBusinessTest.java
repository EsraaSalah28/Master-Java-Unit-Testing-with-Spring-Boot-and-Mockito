package com.example.demo.unittest.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {
    @Test
    void CalculateSum(){
        SomeBussinessLogic someBussinessLogic= new SomeBussinessLogic();
        int actual = someBussinessLogic.calculateSum(new int[]{1, 2, 3});
        int expected =7;
        assertEquals(expected,actual);
    }
}
