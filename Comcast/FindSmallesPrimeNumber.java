package com.Comcast;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSmallesPrimeNumber
{
    public static void main(String args[])
    {
      int[] test = {8,6,4,7,25,5,12,10,14,32,19,11};
      Arrays.sort(test);
      for(int i=0;i<test.length-1;i++)
      {
          int big = 0, small = 0;

          if(test[i]>test[i+1])
          {
              big = test[i];
              small= test[i+1];
              test[i+1] = big;
              test[i]= small;
          }

      }

      System.out.println(Arrays.toString(test));
      FindSmallesPrimeNumber findSmallesPrimeNumber = new FindSmallesPrimeNumber();
      findSmallesPrimeNumber.getMinPrimeNumber(test);

    }

    int countPrime = 0;
    ArrayList<Integer> arrayList =new ArrayList();

    void getMinPrimeNumber(int[] test)
    {
        for(int i=0; i<test.length;i++)
        {
            if(checkPrime(test[i])== true) {
                System.out.println("This is the min prime number: " + test[i]);
              //  break;
            }
        }

        System.out.println("List of prime numbers is:" + arrayList);


    }

    boolean checkPrime(int number)   // this is for returning boolean
    {
        int pivotPrime = 0;

        for(int i=2;i<=number/2;i++)
        {
            if(number%i == 0)
                pivotPrime++;
            countPrime=pivotPrime;
        }

        if(pivotPrime>0)
            return false;
        else

        {
            arrayList.add(number);
            return true;
        }

    }
}
