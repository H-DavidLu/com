package com.Google;

import java.util.Arrays;

public class SqureOfNumbersInSorted
{
    public static void main(String args[])
    {
        int[] test = {9, -2, 0, 2, 3};
        int[] afterSquare = new int[test.length];
        for(int i= 0; i<test.length; i++)
        {
            afterSquare[i]= test[i]*test[i];
        }

        Arrays.sort(afterSquare);

        System.out.println("This is the sorted result: "+Arrays.toString(afterSquare));
    }
}
