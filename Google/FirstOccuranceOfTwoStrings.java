package com.Google;

public class FirstOccuranceOfTwoStrings
{

    public int strStr(String haystack, String needle)
    {
        int lengthH = haystack.length();
        int lengthN = needle.length();

        for(int i= 0; i< lengthH; i++)
        {
           String substring =  haystack.substring(i, i+lengthN);

            if(haystack.substring(i, i+lengthN).equals(needle))
            {

               return i;

            }

        }


    return 0;
    }

    public static void main(String args[])
    {
        String st1 = "mississippi" ;

        String str2 = "issip";

        FirstOccuranceOfTwoStrings f  = new FirstOccuranceOfTwoStrings();
        f.strStr(st1,str2);

    }




}