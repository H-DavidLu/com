package com.Microsoft;
/*
Given an input string, reverse the string word by word.

Example 1:

Input: "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: "  hello world!  "
Output: "world! hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

/* Question 2
Given an input string , reverse the string word by word.

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
Note:

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
 */

public class StringInSplitSpaces
{
    public static void main(String args[])
    {
      //String test = "  I really      wanna stay here USA and make money";

        String test = "a good   example";
        String[] afterSplit = test.split("\\s+");

        String combineAfter = "";
        String combineAfter2 = "";



        // this is the question 2
        String[] charcterString = {"t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"};

        // to process the string[] with each character like the above issue: Q2
        for(int i =0; i<charcterString.length;i++)
        {
          combineAfter2+= charcterString[i];
        }

        System.out.println("after combine: "+combineAfter2);

        String[] afterSplit2 = combineAfter2.split("\\s+");
        combineAfter2="";


        // for Q2
        for(int i=afterSplit2.length-1; i>=0; i--)
        {
            if(i!=0)
                combineAfter2 +=afterSplit2[i]+" ";
            else
                combineAfter2+=afterSplit2[i];
        }

        System.out.println(combineAfter2);

        /*
        //***************** this is for split method**********************************
        for(String after:afterSplit)
        {
          System.out.println(after);

        }

        // using the split method to split
        for(int i=afterSplit.length-1; i>=0; i--)
        {
           if(i!=0)
               combineAfter+=afterSplit[i]+" ";
           else
               combineAfter+=afterSplit[i];

        }
        System.out.println(combineAfter);
        */
    }
}
