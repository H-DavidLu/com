package com.Google;

import java.util.Arrays;

/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.
 */
public class ShiftCharacters
{

    public static void main (String[] args) throws java.lang.Exception
    {
        String input = "Stackoverflow";
        String[] string = new String[input.length()];
        String targetString = "wStack";
        for(int i = 0; i < input.length(); i++){
            input = shift(input);
            string[i] = input;
            System.out.println(input);
        }




        for(String string2: string)
        {
            if(string2.contains(targetString)) {
                System.out.println("This is YES");
                break;
            }
            else
                {
                System.out.println("This is No");
                break;
            }
        }


        System.out.println(Arrays.toString(string));
    }

    public static String shift(String s) {
        return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
    }
}
