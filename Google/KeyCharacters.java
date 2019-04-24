package com.Google;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given a license key represented as a string S which consists only alphanumeric character and dashes.
The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains
exactly K characters, except for the first group which could be shorter than K,
but still must contain at least one character. Furthermore,
there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.

Example 1:
Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
Example 2:
Input: S = "2-5g-3-J", K = 2

Output: "2-5G-3J"

Explanation: The string S has been split into three parts, each part has 2 characters except the first part
as it could be shorter as mentioned above.
 */
public class KeyCharacters
{

    public static void main(String args[]) {
        int k = 4;
        String original = "5F3Z-2e-9-wertrt-yuhfdf-rfred-oi";
        String[] splitedString = original.split("-");
        System.out.println(Arrays.toString(splitedString));
        KeyCharacters keyCharacters =  new KeyCharacters();
        keyCharacters.mergegKyesCharacters(k,original,splitedString);

    }

    String firstElement = "";
    void mergegKyesCharacters(int k ,String original,String[] splitedString)
    {
        ArrayList<String> arraysList  = new ArrayList();

        if(splitedString[0].equals(" ") || splitedString[0].isEmpty())
        //
        {
             //if the first section element contains spaces only or no any characters,
              // we need to move at least one character of the second element ahead

           // String[] afterStringArray = afterString.split("-");


        }
        else
        {
             // since the first section of key is valid ,we will need to start the rest of string
             String afterString = original.substring(String.valueOf(splitedString[0]).length());
             // save the first valid element of string for later use
             String firstStringElement = splitedString[0];
             firstElement=firstStringElement;
             // this is the first element after we split the original string saved in string array

             String[] afterStringArray = afterString.split("-");
             String finalMerge = afterString.replaceAll("[^a-zA-Z0-9]", "");
             System.out.println("This is after removal of the - character: "  + finalMerge);
             //int k ,String original,String[] splitedString)
             int derarriive=0;
             int counter = 0;
             int lengthOfFinalString = finalMerge.length();
             int pivot = lengthOfFinalString;
             for(int i = 0; i<(pivot-k+1);i++)
             {
                 arraysList.add(finalMerge.substring(i, i+4));
                 counter++;
                 lengthOfFinalString= lengthOfFinalString-k;

                 if(lengthOfFinalString>=k) {
                     i = i + k-1;
                    // counter++;
                 }
                 else
                 {
                     arraysList.add(finalMerge.substring(k*counter));
                     break;
                 }
             }
        }

        String afterAll="";

        for(int p = 0; p<arraysList.size();p++)
        {

            if(p<arraysList.size()-1)
                afterAll+=String.valueOf(arraysList.get(p))+"-";
            else
                afterAll+=String.valueOf(arraysList.get(p));
        }

        String finalString =  firstElement+"-"+afterAll;
        String upperCase = new String(finalString.toUpperCase());

        System.out.println("This is the final string after we did the conversion of the keys to : " +upperCase);
    }
}


