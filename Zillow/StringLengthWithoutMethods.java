package com.Zillow;

/*
** Write a function that takes a string and returns its length
 without using built in properties (such as .length or .size()).
 //
 */

public class StringLengthWithoutMethods
{
    public static void main(String args[])
    {

        String blah = "HellO    rtrtrt";
        int count = 0;
        for (char c : blah.toCharArray()) {
            count++;
        }
        System.out.println("blah's length: " + count);
    }
}
