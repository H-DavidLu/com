package com.YouTube;
/*
Given a string s and a list of strings dict,
you need to add a closed pair of bold tag <b> and </b> to wrap the substrings in s that exist in dict.
If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag. Also,
 if two substrings wrapped by bold tags are consecutive, you need to combine them.
Example 1:
Input:
s = "abcxyz123"
dict = ["abc","123"]
Output:
"<b>abc</b>xyz<b>123</b>"
Example 2:
Input:
s = "aaabbcc"
dict = ["aaa","aab","bc"]
Output:
"<b>aaabbc</b>c"
 */

import java.util.ArrayList;

public class AddBoldStrings
{

    ArrayList<String> finalStrings = new ArrayList<>();

    public static void main(String args[])
    {

        String str = "aaabbcc";
        String[] dict = {"aaa","aab","bc"};
        AddBoldStrings addBoldStrings = new AddBoldStrings();

        for(int i= 0; i<dict.length-1 ; i++)
        {
          if(addBoldStrings.comparedTwoStrings(dict[i], dict[i+1])== false) // meaning that overlap
              addBoldStrings.getMerged(dict[i], dict[i+1]);
          else
              continue;
        }
    }

    // get merger if the two string elements are overlapped with some characters
    String getMerged(String first, String second)
    {
        /*
         String str = "aaabbcc";
        String[] dict = {"aaa","aab","bc"};
         */
        String newStringToMerge = "";
        for(int i= 0; i<second.length() ; i++)
        {
            if(!first.contains(String.valueOf(second.charAt(i))))
                newStringToMerge+=String.valueOf(second.charAt(i));

        }

        newStringToMerge = first+newStringToMerge;
        finalStrings.add(newStringToMerge);
        return  newStringToMerge;


    }

    // check if the two element strings are overlapped with some characters
    boolean comparedTwoStrings(String a, String b)
    {

        int counter =0;

        for(int i= 0; i<a.length() ; i++)
        {
            for(int j= 0; j<b.length(); i++)
            {
                if(String.valueOf(a.charAt(i)).equals(String.valueOf(b.charAt(j)))) {
                    counter++;
                    break;
                }
                else continue;
            }
        }

        if(counter>0)
            return false;
        else
            return true;
    }
}
