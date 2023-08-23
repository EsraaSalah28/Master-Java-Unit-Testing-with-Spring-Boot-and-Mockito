package com.example.demo.unittest.service;

public class SomeBussinessLogic {
     private SomeBusinessService someBusinessService;

    public void setSomeBusinessService(SomeBusinessService someBusinessService) {
        this.someBusinessService = someBusinessService;
    }

    public int calculateSum(int[]data){
        int sum=0;
        for(int value: data){
            sum+=value;
        }
        return sum;
    }
    public int calculateSumWithDataService(){
        int sum=0;
        int[]data=someBusinessService.retreiveAllData();
        for(int value: data){
            sum+=value;
        }
        return sum;
    }
}
