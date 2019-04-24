package com.Uber;
/*
 reverse(lst, i, j), which reverses lst from i to j.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ReverseListFromAToB
{
   // String reverse = "";
    public static void main(String args[])
    {

        int input =  -120;
        ReverseListFromAToB reverseListFromAToB = new ReverseListFromAToB();
        System.out.println( " This is the reverse integer: " + reverseListFromAToB.reverse(input));

    }

    String reverse = "";

    public int reverse(int number)
    {
        String str = String.valueOf( Math.abs(number));
        String[] test = new String[str.length()];
        String afterConversion = "";
        for(int i= str.length()-1; i>=0; i--)
        {
                test[i] = String.valueOf(str.charAt(i));
        }

        for(int j= test.length-1; j>=0 ; j--)
        {
            afterConversion+=  test[j];
        }

        int negativeNumber = 0;

        if(number>=0)
            return Integer.valueOf(afterConversion);
        else
        {
            negativeNumber = Integer.valueOf(afterConversion);
            negativeNumber= -negativeNumber;
            return negativeNumber;
        }
    }
}

