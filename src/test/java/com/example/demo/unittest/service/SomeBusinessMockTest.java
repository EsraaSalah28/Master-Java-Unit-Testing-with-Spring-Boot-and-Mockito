package com.example.demo.unittest.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {
    SomeBussinessLogic someBussinessLogic= new SomeBussinessLogic();
    SomeBusinessService someBusinessService = mock(SomeBusinessService.class);

    @Before
    public void setUp(){
        someBussinessLogic.setSomeBusinessService(someBusinessService);

    }
    @Test
    public void CalculateSum_Happy(){
        when(someBusinessService.retreiveAllData()).thenReturn(new int[]{1,2,3,1});
        assertEquals(7, someBussinessLogic.calculateSumWithDataService());
    }
    @Test
    public void CalculateSum_Empty(){
        when(someBusinessService.retreiveAllData()).thenReturn(new int[]{});
        assertEquals(0, someBussinessLogic.calculateSumWithDataService());
    }

    @Test
    public void CalculateSum_One_Value(){
        when(someBusinessService.retreiveAllData()).thenReturn(new int[]{5});
        someBussinessLogic.setSomeBusinessService(someBusinessService);
        assertEquals(5, someBussinessLogic.calculateSumWithDataService());
    }
}
