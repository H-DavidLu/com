package com.AirBnB;
/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */

public class ReverseInteger
{

    public static void main(String args[])
    {

        int test = -123;
        int tmp = Math.abs(test);

        int reverse = 0;
        while(test != 0){
            reverse = (reverse*10)+(test%10);
            test = test/10;
        }

        if(test<0)
            System.out.println("This is the reverse:" + "-"+ reverse);
        else
            System.out.println("This is the reverse:" + reverse);


    }
}
