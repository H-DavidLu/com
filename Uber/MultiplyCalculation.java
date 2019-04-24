package com.Uber;
/*
Multiply 2 long numbers without using multiplication.

132*123


 */

public class MultiplyCalculation
{

    public static void main(String args[])
    {
       long a = 123;
       long b= 135;
       long sum = 0;
       long sumWithSign = 0;

       for(int i= 0; i<b; i++)
       {
           sum+= a;

       }

        System.out.println("The approach without multiplication: " + sum);
        System.out.println("The approach without multiplication: " + a*b);



    }
}
