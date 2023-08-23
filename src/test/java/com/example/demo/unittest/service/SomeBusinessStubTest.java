package com.example.demo.unittest.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SomeDataServiceStub implements SomeBusinessService{
    @Override
    public int[] retreiveAllData() {
        return new int[]{1,2,4};
    }
}



public class SomeBusinessStubTest  {
    @Test
    public void  CalculateSumUsingData(){
        SomeBussinessLogic someBussinessLogic= new SomeBussinessLogic();
        someBussinessLogic.setSomeBusinessService(new SomeDataServiceStub());
        int actual = someBussinessLogic.calculateSumWithDataService();
        int expected =7;
        assertEquals(expected,actual);
    }


}
