package com.Apple;
/*
Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers
{
    static ArrayList<Integer> prime = new ArrayList<>();
    static ArrayList<Integer> notPrime = new ArrayList<>();

    public static void main(String args[])
    {
      int target = 10;
      int sumNumber = 0;

      PrimeNumbers primeNumbers = new PrimeNumbers();

      for(int i = 2; i<= target; i++ )
      {
          primeNumbers.checkPrime(i);
      }

      System.out.println("The number of prime number under "+target+ " is " + prime.size());
        System.out.println("The prime numbers under "+target+ " are " + prime);

    }

    void checkPrime(int test)
    {
        int notPrimeNumber = 0;

        for(int i=2; i<= (int)(test/2); i++)
        {
            if(test%i==0)
            {
                notPrimeNumber++;
                break;
            }

        }

        if(notPrimeNumber ==0)
            prime.add(test);
        else
            notPrime.add(test);

    }
}
