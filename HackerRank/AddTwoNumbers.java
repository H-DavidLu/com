package com.HackerRank;

public class AddTwoNumbers {

    public static int addNumbers(float a, float b)
    {
        int sum = (int)Math.round(a+b);
        return sum;

    }

    public static void main(String[] args) {
        float a = 2.34f ;
        float b = 5.7f;

      System.out.println( addNumbers(a,b));

    }
}



