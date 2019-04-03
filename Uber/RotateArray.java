package com.Uber;
/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

import java.util.Arrays;

public class RotateArray
{
    public static void main(String args[])
    {
        int[] test  = {1,2,3,4,5,6,7};
        int target = 4;
        int lengthTest = test.length;
        int[] newOne = new int[test.length];
        int[] targetArraysCut = new int[target];  // store the target part
        int[] restNonTarget = new int[lengthTest-target]; // length of rest of non target part
        int startPosition = lengthTest-target;
        for(int i= 0;i< target ; i++) // to store the target array
        {
            targetArraysCut[i] = test[lengthTest-target+i];
        }
        // to store the  target part to the new one Array first
        for(int i= 0;i< target ; i++) // to store the target array
        {
            newOne[i] = targetArraysCut[i];
        }

        // to store the non target part:
        for(int i= 0;i<lengthTest-target ; i++) // to store the target array
        {
            restNonTarget[i]= test[i];
        }
        //
        for(int i=target ;i< lengthTest ; i++) // to store the target array
        {
            newOne[i] = restNonTarget[i-target];
        }
        System.out.println( " This is the array to retrive with target-length :" + Arrays.toString(newOne) );
    }
}
