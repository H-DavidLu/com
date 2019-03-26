package com.Zillow;
/*
**Make a simple function that returns the minimum value of 0 or more integers.
Without using builtins such as Math.min(), etc.
 // example: [6, 2, 33, -3, 3, 6, 10, -1] should return -3
 */

import java.util.Arrays;

public class MiminumValues
{
    public static void main(String args[])
    {
        int[] test = {6, 2, 33, -3, 3, 6, 10, -1};

        int bigger = 0, smaller =0;

        for(int i=0; i< test.length-1; i++)
        {
            for(int j=i+1; j<test.length; j++)
            {
                if(test[i]>test[j])
                {
                    bigger=test[i];
                    smaller = test[j];
                    test[i]= smaller;
                    test[j]=bigger;

                }

            }

        }

        System.out.println("The list is: " + Arrays.toString(test));
        System.out.println("The smallest element is: " +test[0]);
    }
}
