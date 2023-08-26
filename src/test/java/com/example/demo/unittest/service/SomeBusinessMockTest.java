package com.example.demo.unittest.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
    @InjectMocks
    SomeBussinessLogic someBussinessLogic;
    @Mock
    SomeBusinessService someBusinessService ;

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
