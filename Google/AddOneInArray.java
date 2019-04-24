package com.Google;

import java.util.Arrays;

public class AddOneInArray
{

    public static void main(String args[])
    {

        int[] test = {1,2,3};

        int afterconversion1 = 0;
        int afterconversion2 = 0;
        String afterInteger = "";
        String[] stringArray = new String[test.length];
        String toStringFormat = "";

        for(int i= 0; i<stringArray.length ; i++)
        {
            stringArray[i] = String.valueOf(test[i]);
            toStringFormat+=stringArray[i];
        }

        afterconversion1 = Integer.valueOf(toStringFormat);
        afterInteger = String.valueOf(afterconversion1+1);

        char[] toInteger = afterInteger.toCharArray();
        System.out.println(" This is the conversion:" + Arrays.toString(toInteger));

    }
}
