package com.Google;
/*
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class DecodeStrings {

    String allStrings = "";
    String pendingStrings = "";

    public static void main(String args[])
    {
      String test = "2[abc]3[cd]ef";
              //"3[a]2[bc]";
        //s = "3[a2[c]]", return "accaccacc";

        DecodeStrings decodeStrings =  new DecodeStrings();
        System.out.println(" This is " + decodeStrings.toDecodeString1(test));

    }

    public String toDecodeString1(String test) // first to split
    {
        String[] dividedStr = test.split("\\]");
        System.out.println("The first level split as : " + Arrays.toString(dividedStr));

        for(int i= 0; i< dividedStr.length ; i++)
        {
           if (!(dividedStr[i].contains("]") || dividedStr[i].contains("[")))
               pendingStrings = dividedStr[i] ;
           else
            toDecodeString2(dividedStr[i]);
        }
        return allStrings+pendingStrings;
    }

    String toDecodeString2(String afterSquareBracket) // split again the each string with "["
    {
        String[] afterSquare  = afterSquareBracket.split("\\[");
        int fistStringConverToInteger = Integer.valueOf(afterSquare[0]);
        for(int i= 1; i<=fistStringConverToInteger ; i++)
        {
            allStrings+= afterSquare[1];
        }

        return allStrings;
    }
}
