package com.Wayfair;

public class ReverseStringsNumbers
{
    public static void main(String args[])
    {
       String test = "love";
       int length = test.length();
       String newString = "";
       for(int i =0; i<test.length();i++)
       {
           newString+=test.charAt(length-1-i);
       }
       System.out.println("The reverse of the string is: " + newString);
    }
}
