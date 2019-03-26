package com.Cisco;

public class Swaps
{
    static String finalString = "";
    public static void main(String args[])
    {
      String test = "10101010";
      String after = "";

      for(int i=0;i<test.length();i++)
      {
          swap(String.valueOf(test.charAt(i)), String.valueOf(test.charAt(i+1)));
          i++;
      }

      System.out.print(finalString);
    }

    static void swap(String first, String second)
    {
        String firstOne = second;
        String secondOne = first;
        finalString+=firstOne+secondOne;
    }
}
