package com.Facebook;
/*

 */
public class ConvertToBits
{

    public static void main(String args[])
    {

        String test = "000000001100000111111";
        String convertedString = "";

        for(int i= 0; i<test.length() ; i++)
        {
            if(String.valueOf(test.charAt(i)).contains("0"))
            {
                convertedString+= "1";
            }
            else
                {
                    convertedString+= "0";
                }
        }

        System.out.println( convertedString);
    }
}
