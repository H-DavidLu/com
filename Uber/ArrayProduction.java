package com.Uber;
/*
Given an array nums of n integers where n > 1,
return an array output such that output[i] is equal to the product of all the elements of
nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
 */

import java.util.Arrays;

public class ArrayProduction
{

    public static void main(String args[])
    {
        int[] test = {1,2,3,4};
        int[] sumArray = new int[test.length];
       // ArrayProduction arrayProduction = new ArrayProduction();
        int sumProduction = 1;
        for(int i= 0; i<test.length ; i++)
        {
            sumProduction*=test[i];
        }

        for(int i= 0; i<sumArray.length ; i++)
        {
            sumArray[i] = sumProduction/test[i];
        }

        System.out.println("The production list is: " + Arrays.toString(sumArray) );

    }
}
