package com.Zillow;

public class TwoStringProduction
{
    public static void main(String args[])
    {
      String s1= "123" ;
      String s2= "456";

      // approach one: using the built-in method to convert to integer values
      int first = Integer.valueOf(s1);
      int second = Integer.valueOf(s2);
      int production = getNumber1(s1)*getNumber1(s2);

      System.out.println("This is the production: " + production);

      // how about if not allow to use library to get the values

    }

    // Java 7:
    public static int getNumber1(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * 10 + number.charAt(i) - '0';
        }
        return result;
    }

    // Java 8
    public static int getNumber(String number) {
        return number.chars().reduce(0, (a, b) -> 10 * a + b - '0');
    }
}
