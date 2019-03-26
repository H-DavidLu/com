package com.Zillow;

import java.util.LinkedHashMap;

public class NumberToWords
{
    int test = 123456;
    //xxx,xxx,xxx,xxx

    static LinkedHashMap<Integer, String>  initialSection_numbers_Hash = new LinkedHashMap<>();
    static LinkedHashMap<Integer,String> set_UnderTwenty_Hash = new LinkedHashMap<>();
    static LinkedHashMap<Integer, String> set_Tenth_Hash = new LinkedHashMap<>();
    static LinkedHashMap<Integer, String> set_FirstSection_Hundred_Hash = new LinkedHashMap<>();
    static LinkedHashMap<Integer, String> set_SecondSection_Thousand_Hash = new LinkedHashMap<>();
    static LinkedHashMap<Integer, String> set_ThirdSection_Million_Hash =  new LinkedHashMap<>();
    static LinkedHashMap<Integer, String> set_FourSection_Billion_Hash = new LinkedHashMap<>();

    public static void main(String args[])
    {
        int test = 123456;  // there will be two sections, 123 and 456
        int test2 = 23456; // there will be two sections too
        int test3 = 1234567; // there will be three sections
        int  test4 =  123; // these is only one section only

        String testString = String.valueOf(test);
        int length = testString.length();

        NumberToWords numberToWords = new NumberToWords();

        //100, 100,000
    }

    void initiateNumberHash()
    {
        initialSection_numbers_Hash.put(1,"One");
        initialSection_numbers_Hash.put(2,"Two");
        initialSection_numbers_Hash.put(3,"Three");
        initialSection_numbers_Hash.put(4,"Four");
        initialSection_numbers_Hash.put(5,"Five");
        initialSection_numbers_Hash.put(6,"six");
        initialSection_numbers_Hash.put(7,"Seven");
        initialSection_numbers_Hash.put(8,"Eight");
        initialSection_numbers_Hash.put(9,"Nine");
        initialSection_numbers_Hash.put(10,"Ten");
        initialSection_numbers_Hash.put(11,"Eleven");
        initialSection_numbers_Hash.put(12,"Twelf");
        initialSection_numbers_Hash.put(13,"Thirteen");
        initialSection_numbers_Hash.put(14,"Fourteen");
        initialSection_numbers_Hash.put(15,"Fourteen");
        initialSection_numbers_Hash.put(16, "Sixteen");
        initialSection_numbers_Hash.put(17, "Seventeen");
        initialSection_numbers_Hash.put(18,"Eighteen");
        initialSection_numbers_Hash.put(19, "Nineteen");
        initialSection_numbers_Hash.put(20,"Twenty");
        initialSection_numbers_Hash.put(30,"Thirty");
        initialSection_numbers_Hash.put(40, "Forty");
        initialSection_numbers_Hash.put(50, "Fifty");
        initialSection_numbers_Hash.put(60, "Sixty");
        initialSection_numbers_Hash.put(70, "Seventy");
        initialSection_numbers_Hash.put(80,"Eighty");
        initialSection_numbers_Hash.put(90,"Ninety");
    }

    void setSet_UnderTwenty_Hash()
    {
      //  set_UnderTwenty_Hash.put(11,);

    }


    void setSet_Tenth_Hash()
    {
        set_Tenth_Hash.put(10,"Ten");
        set_Tenth_Hash.put(20,"Twenty");
        set_Tenth_Hash.put(30,"Thirty");
        set_Tenth_Hash.put(40,"Forty");
        set_Tenth_Hash.put(50,"Fifty");
        set_Tenth_Hash.put(60,"Sixty");
        set_Tenth_Hash.put(70,"Seventy");
        set_Tenth_Hash.put(80,"Eighty");
        set_Tenth_Hash.put(90,"Ninty");
    }

    void setFirstSection_Hndred_Hash()
    {

    }

    void convertToString(int test)
    {



    }

}
