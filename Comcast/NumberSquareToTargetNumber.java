package com.Comcast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class NumberSquareToTargetNumber
{
    LinkedHashMap<Integer, Integer> linkedHashMaphashMap =  new LinkedHashMap<>();

    public static void main(String args[])
    {
        int initialTarget = 1000000;
        int afterTarget = (int) Math.sqrt(initialTarget);
        NumberSquareToTargetNumber numberSquareToTargetNumber = new NumberSquareToTargetNumber();
        System.out.println(" the temp list is: " + numberSquareToTargetNumber.passTargetNumber(afterTarget,initialTarget));

    }

    ArrayList passTargetNumber(int testTarget, int targetNumber)
    {
        ArrayList<Integer> arrayList =  new ArrayList<>();
        for(int i= 2 ; i<=testTarget; i++)
        {
            if(checkIfPrime(i) == true)
            {
                arrayList.add(i);
            }
        }

        for(int i = 0;  i<arrayList.size();i++)
        {
            getNumbersToTarget(Integer.valueOf(arrayList.get(i)), targetNumber);
        }

        System.out.println(linkedHashMaphashMap);

       Set<Map.Entry<Integer,Integer>> container = linkedHashMaphashMap.entrySet();
       int sumOfPrimeNumber = 0;
       for(Map.Entry<Integer,Integer> trueContainer:container)
       {
           sumOfPrimeNumber += trueContainer.getValue();
       }

       System.out.println("The sum of prime number of squares: " + sumOfPrimeNumber);
        System.out.println("The number of non-sqaure integer " + ( targetNumber-sumOfPrimeNumber));


        return arrayList;
    }


    void getNumbersToTarget(int toNumber, int targetNumber)
    {
         int fianlToNumber = 1;
         int afterMultiply = toNumber*toNumber;
         int counter =0;
         while(targetNumber>afterMultiply)
         {
              afterMultiply*=toNumber;

             counter++;
         }

         linkedHashMaphashMap.put(toNumber, counter);
         counter=0;

    }

    boolean checkIfPrime(int number)   // this is for returning boolean
    {
        int pivotPrime = 0;

        for (int i = 2; i <= number / 2; i++)
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
