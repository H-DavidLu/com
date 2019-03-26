package com.Alibaba;

public class SumWithTwoPrimeNumbers
{

    public static void main(String args[])
    {
       int target = 10;

    }


    boolean checkPrime(int number)   // this is for returning boolean
    {
        int pivotPrime = 0;

        for (int i = 2; i < number / 2; i++)
        {
            if (number % i == 0) {
                pivotPrime++;
                break;
            } else
                continue;
        }

        if (pivotPrime > 0)
            return false;
        else
            return true;
    }

}
