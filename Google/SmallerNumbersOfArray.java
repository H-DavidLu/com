package com.Google;
/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array.

For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0], since:

There is 1 smaller element to the right of 3
There is 1 smaller element to the right of 4
There are 2 smaller elements to the right of 9
There is 1 smaller element to the right of 6
There are no smaller elements to the right of 1
 */

import java.util.Arrays;

public class SmallerNumbersOfArray
{

    public String checkNumbers(int[] test)
    {
        int length = test.length;
        int[] numberArrayCollection = new int[length];
        numberArrayCollection[length-1]=0; // put 0 into the last position

        for(int i= 0; i<length-1 ; i++)
        {
            int flag = 0;
            for(int j= i+1; j<length ; j++)
            {
                if(test[i]>test[j])
                {

                    flag++;
                }

            }
            numberArrayCollection[i] = flag;
            flag=0;
        }

        return Arrays.toString(numberArrayCollection);

    }

    public static void main(String[] args)
    {

        int[] test = {3, 4, 9, 6, 1};
        /*
         1 3 4 6 9 10

         1 6  3 9  4
         */
        SmallerNumbersOfArray s = new SmallerNumbersOfArray();

        System.out.println(s.checkNumbers(test));
    }
}
