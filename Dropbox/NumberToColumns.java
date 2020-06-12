package com.Dropbox;

import java.util.HashMap;
/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Dropbox.

Spreadsheets often use this alphabetical encoding for its columns:
 "A", "B", "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....

Given a column number, return its alphabetical column id. For example, given 1, return "A". Given 27, return "AA".
 */

public class NumberToColumns
{
    HashMap<Integer, String> columnMap = new HashMap<>();
    String baseTenToColumns (int input)
    {
        String string="";
        columnMap.put(1, "A");
        columnMap.put(2, "B");
        columnMap.put(3, "C");
        columnMap.put(4, "D");
        columnMap.put(5, "E");
        columnMap.put(6, "F");
        columnMap.put(7, "G");
        columnMap.put(8, "H");
        columnMap.put(9, "I");
        columnMap.put(10, "J");
        columnMap.put(11, "K");
        columnMap.put(12, "L");
        columnMap.put(13, "M");
        columnMap.put(14, "N");
        columnMap.put(15, "O");
        columnMap.put(16, "P");
        columnMap.put(17, "Q");
        columnMap.put(18, "R");
        columnMap.put(19, "S");
        columnMap.put(20, "T");
        columnMap.put(21, "U");
        columnMap.put(22, "V");
        columnMap.put(23, "W");
        columnMap.put(24, "X");
        columnMap.put(25, "Y");
        columnMap.put(26, "Z");
        columnMap.put(0, "");
      //  System.out.println(columnMap);
        if(input<0)
        {
            return "the input is invalid, please input again.";
        }
        else
        {
            // first: from 0 to 11
            if(input<=26 && input>=1 && columnMap.containsKey(input))
            {
                return String.valueOf(columnMap.get(input));
            }
            else // greater than 26
            {
                String columnString ="";
                int remainers = 0;

                while(input/26>0)
                {
                    remainers=input%26;
                    input=input/26;
                    columnString=remainers+ " " +columnString;
                    if(input<26)
                    {
                        columnString=input+ " " +columnString;
                        break;
                    }
                }
                string=columnString;
            }

            String[] eachDigit = string.split("\\s+");
            int[] convertedIntegers = new int[eachDigit.length];
            for(int i= 0; i<convertedIntegers.length; i++)
            {
                convertedIntegers[i] = Integer.valueOf(eachDigit[i]);
            }

            string="";
            String finalString ="";
            for(int i= 0; i< convertedIntegers.length ; i++)
            {
                   finalString+=columnMap.get(Integer.valueOf(convertedIntegers[i]));
            }

            string=finalString;

        }
        return string;
    }

    public static void main(String[] args)
    {
        int input = 895458;
        NumberToColumns N = new NumberToColumns();
        System.out.println(N.baseTenToColumns(input));
    }

}
