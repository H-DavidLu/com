package com.Uber;
//easy

public class ReverseInteger
{

    public static void main(String args[])
    {
        int test = 123, reverse = 0;
        while(test!=0)
        {
            reverse=reverse*10+ (test%10);
            test=test/10;
        }
        System.out.println("This is the reverse:"+ reverse );
    }
}
