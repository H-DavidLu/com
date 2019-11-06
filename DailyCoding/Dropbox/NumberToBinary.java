package com.DailyCoding.Dropbox;

import java.util.HashMap;

public class NumberToBinary
{

    String baseTenToColumns (int input)
    {
        String string="";

        if(input<0)
        {
            return "the input is invalid, please input again.";
        }
        else
        {
                String columnString ="";
                int remainers = 0;

                while(input/2>0)
                {
                    remainers=input%2;
                    input=input/2;
                    columnString=remainers+ " " +columnString;
                    if(input<2)
                    {
                        columnString=input+ " " +columnString;
                        break;
                    }
                }
                string=columnString;

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
                finalString+=convertedIntegers[i];
            }

            string=finalString;

        }
        return string;
    }

    public static void main(String[] args)
    {
        int input = 10;
        NumberToBinary B = new NumberToBinary();
        System.out.println(B.baseTenToColumns(input));
    }

}
