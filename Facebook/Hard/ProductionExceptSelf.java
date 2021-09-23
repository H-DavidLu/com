package com.Facebook.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductionExceptSelf {

    public static void main(String[] args) {
        ProductionExceptSelf productionExceptSelf =  new ProductionExceptSelf();
        int[] test = {6,2,3};
        System.out.println("The new array of production is: " + productionExceptSelf.getProduction(test));
    }

    public String getProduction(int[] test){
        if(test.length==0 || test==null){
            return test.toString() ;
        }
        int[] production = new int[test.length];

        int currentIndex = 0;
        for(int i= 0; i<test.length ; i++) {

            production[i]=jumpCurrentPosition(i, test);
        }
        return Arrays.toString(production);
    }

    public int jumpCurrentPosition(int currentIndex, int[] test){
        int tempProduction = 1;
        for(int j= 0; j<test.length; j++) {
            if(j !=currentIndex){
                tempProduction*= test[j];
            }
            else{
                continue;
            }
        }
        return tempProduction;
    }
}
