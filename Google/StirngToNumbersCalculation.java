package com.Google;

/*
Convert string expression to number calculation
"6+9-8"  ==>  7
*/

import java.util.ArrayList;
import java.util.Arrays;

public class StirngToNumbersCalculation
{

    public static void main(String args[])
    {
      String expression = "6+9-8-9-8-999+2000-990";
        StirngToNumbersCalculation stirngToNumbersCalculation = new StirngToNumbersCalculation();
        System.out.println("The result of calculation is: " +stirngToNumbersCalculation.calculateExpressiontoNumber(expression));

    }

    int calculateExpressiontoNumber(String expression)
    {
        //===============================================================================================================
        StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

        for (int i=0; i<expression.length(); i++)
        {
            if (Character.isDigit(expression.charAt(i)))
                num.append(expression.charAt(i));
            else if(Character.isAlphabetic(expression.charAt(i)))
                alpha.append(expression.charAt(i));
            else
                special.append(expression.charAt(i));
        }

        // save integer part: need to pay attention the conversion from character to string or direct to the Integer
        String integerelement = expression.replaceAll("[^a-zA-Z0-9]", ",");
        String[] string =integerelement.split(",");
        System.out.println("This is the string after convertion to string arrays: " + Arrays.toString(string));


        ArrayList<Integer> integerElementArray = new ArrayList<>();
        //String[] integerElementArray = new
        for(int i= 0; i<string.length ; i++)
        {
            if(string[i].equals(","))
                continue;
            else
                integerElementArray.add(Integer.valueOf(string[i]));
        }

        // save sign part: approach one
        String signelement = expression.replaceAll(" ", "");
        String[] signArray = new String[signelement.length()];
        for(int i= 0; i<signArray.length ; i++)
        {
            signArray[i] = String.valueOf(signelement.charAt(i));
        }

        // save sign part: approach two

        String[] signArray2 = new String[special.length()];
        for(int i= 0; i<special.length() ; i++)
        {
            signArray2[i] = String.valueOf(special.charAt(i));
        }

        //
        int sum = Integer.valueOf(integerElementArray.get(0));
        for(int i= 0; i<signArray2.length ; i++)
        {
            if(signArray2[i].equals("+"))
                sum+= Integer.valueOf(integerElementArray.get(i+1));
            else
                sum-= Integer.valueOf(integerElementArray.get(i+1));
        }

        System.out.println("This is the integer string:" + integerelement);

        System.out.println("This is the integer container:" + integerElementArray);

        return sum;
    }


}
