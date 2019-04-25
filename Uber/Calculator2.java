package com.Uber;
/*
Implement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

Example 1:

Input: "3+2*2"
Output: 7
Example 2:

Input: " 3/2 "
Output: 1
Example 3:

Input: " 3+5 / 2 "
Output: 5
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculator2
{

    public static void main(String args[])
    {
      String str = "3+24*2";
      Calculator2 calculator2 =  new Calculator2();
      calculator2.calculate(str);
    }

    void calculate(String s)
    {

       // String[] result = Arrays.stream(s.split(",")).map(String::trim).toArray(String[]::new);

        String number = s.replaceAll("[^a-zA-Z0-9]", " "); // remove all specific signs
        String sign = s.replaceAll("[a-zA-Z0-9]", " ");// remove all numeric numbers and signs only

        String[] numberStrings = number.split("[^\\w]+");
        String[] signString = sign.trim().split("[\\s]+");
        String[] signAfter = new String[signString.length];  // here
        String[] numberAfter = new String[numberStrings.length]; // here
        String[] combineAl = new String[signAfter.length+numberAfter.length];

        //String[] sa = s.split("[^\\w]+");//split by any non word char
        //String s = str1.replaceAll("^\\s+","");//starting with whitespace one or more
        for(int i= 0; i<numberAfter.length ; i++)
        {
            numberAfter[i] = numberStrings[i];
        }

        for(int j= 0; j<signAfter.length ; j++)
        {
            signAfter[j] = signString[j];
        }

        // reveal the whole expressions of calculation
        String tests = "";
        for(int i= 0; i<numberAfter.length ; i++)
        {

        }

        System.out.println("this is the sign string with removing the spaces: "+ Arrays.toString(signAfter));
        System.out.println(" This is the number after: "+ Arrays.toString(numberAfter));

    }
}
