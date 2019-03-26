package com.Google;

import java.util.HashSet;

public class SumOfContinuousElementInArray
{
    HashSet<String> tartgetContainer = new HashSet<>();

    public static void main(String args[])
    {
       int[] test = {1, 2, 3, 4, 5};
       int target = 9;
       SumOfContinuousElementInArray sumOfContinuousElementInArray =  new SumOfContinuousElementInArray();

       sumOfContinuousElementInArray.getSum(test, 9);
    }

    void getSum(int[] test, int target)
    {
        int requestLength = test.length;
        //
        for(int length =2 ; length<=requestLength; length++)
        {
            getSumsUp(length, target, test);
        }
    }

    void getSumsUp(int elementLength, int target, int[] test) {
        int f1 = test[0];
        int f2 = test[2 - 1] + f1;
        int addSum = 0;

        for (int startIndex = 0; startIndex < test.length - 1; startIndex++) {
            // addSum = recursive(test, startIndex, elementLength) + recursive(test ,startIndex+1, elementLength);
               // test: the array, start: the position
               calculateElementsSum(test, startIndex,target);
        }

        System.out.println("The list of contigent elements are: as" + tartgetContainer);
    }


    HashSet calculateElementsSum(int[] test, int startIndex, int target)
    {
       int addUp = 0;
       String stringKey = "";

       for(int i=startIndex; i<(startIndex+target-1); i++)
       {

           addUp+=test[startIndex];
           stringKey+= String.valueOf(test[startIndex])+ ", ";

       }

       if(addUp == target)
           tartgetContainer.add(stringKey);

       return tartgetContainer;
    }
}
