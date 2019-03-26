package com.Zillow;

public class FizzFuzz
{
    public static void main(String args[])
    {

        int target = 20;

        for(int i =0; i<=20; i++)
        {

            if(i%15==0 && i%5 == 0  &&i%3 ==0 )
                    System.out.println("i: " +i+ " : FizzFuzz");
            else if(i%3==0)
                System.out.println("i: " +i+ " : Fizz");
            else if(i%5==0)
                System.out.println("i: " + +i + " :Fuzz");
            else
                System.out.println("i: " +i);
        }


    }
}
