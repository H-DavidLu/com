package com.Zillow;

public class StringConvertToIntegers
{
    public static void main(String args[])
    {
      String number1 = "12";

      int conver1 = StringConvertToIntegers.convert(number1);

      System.out.println("this is the ocnvert to integer without using built-in method:" +conver1);

    }
    public static int convert(String strNum)
    {
        int result =strNum.chars().reduce(0, (a, b)->10*a +b-'0');

        return result;
    }
}
