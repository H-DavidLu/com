package com.Google;
/*

 */

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubstring
{

    ArrayList<String> subStringSample =  new ArrayList<>();

    public static void main(String args[])
    {
      String test = "aabcdfertyyujiiijklo";
      LongestSubstring longestSubstring =  new LongestSubstring();
      System.out.println(longestSubstring.checkLength(test) );
      System.out.println( longestSubstring.subStringSample);


    }

    int checkLength(String str)
    {
        int length = str.length();
        String substringS = "";
        ArrayList<String> subStringContainer =  new ArrayList<>();
       // ArrayList<String> subStringSample =  new ArrayList<>();

        for(int i= 0; i<length-1 ; i++)
        {
            substringS = String.valueOf(str.charAt(i));

            for(int j= i+1; j<length ; j++)
            {
                if(!substringS.contains(String.valueOf(str.charAt(j))))
                {
                    substringS+=String.valueOf(str.charAt(j));

                }
                else
                {
                  subStringContainer.add(str.substring(i,j));
                  subStringSample.add(str.substring(i,j));
                  break;
                }
            }
        }

        int[] subStringLengths = new int[subStringContainer.size()];
        for(int k= 0; k<subStringLengths.length; k++)
        {
            subStringLengths[k] = subStringContainer.get(k).length();
        }

        Arrays.sort(subStringLengths);
        return subStringLengths[subStringLengths.length-1];

    }
}
