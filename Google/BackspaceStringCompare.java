package com.Google;
/*
Given two strings S and T, return if they are equal when both are typed into empty text editors.
# means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */

public class BackspaceStringCompare
{

    String string1 = "";
    String string2="";
    String finalString = "";


    public static void main(String args[])
    {
       String str1 = "ab#c", str2="a##c";
       BackspaceStringCompare b = new BackspaceStringCompare();


       System.out.println( "The final string : " + b.checkSpaces(str2));

       /*
       S = "ab#c", T = "ad#c"
        */


    }

    String checkSpaces(String string)
    {
        String copy = string;
        String test = "";
        int length = copy.length();

        if(!copy.contains("#")) // if the string does not contain any # signs
        {
            finalString=copy;
            //return finalString;
        }
        else if(String.valueOf(copy.charAt(0)).equals("#")) // if the first zero contains #
        {
            copy = copy.substring(1,length);
            checkSpaces(copy);
        }
        else if(!String.valueOf(copy.charAt(0)).equals("#")) //  # starts instead of first position
        {
           for(int i= 0; i<length; i++)
           {

               if(!copy.contains("#"))
               {
                   finalString=copy;
                   break;
               }
               else if(copy.length()==1 && (!copy.contains("#")))
               {
                   finalString=copy;
                   break;
               }

               else if(String.valueOf(copy.charAt(i)).equals("#"))
               {

                   // example:  S = "ab#c", T = "ad#c"
                   copy = copy.substring(0,i-1)+ copy.substring(i+1, length);
                   checkSpaces(copy);
               }
           }
        }
        return finalString;

    }
}
