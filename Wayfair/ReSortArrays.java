package com.Wayfair;
/*
Given an array of integers (positive and negative), sort so all negative numbers are on the left,
and positive are on the right while retaining their original order.

 Example:
 Input: [-2, 4, -19, 4, 0]
 Output: [-2, -19, 0, 4, 4]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class ReSortArrays
{
    static int[] test = {-2, 4, -19, 4, 0};
    static int zeroCounter = 0;
    static int negativeCountr = 0, positiveCounter = 0;
    static int[] newArray = new int[test.length];
    static ArrayList<Integer> positiveArrays = new ArrayList<>();
    static int nextCounter = 0;
    static int counterForPositive=0;

    public static void main(String args[])
    {
        ReSortArrays reSortArrays = new ReSortArrays();
        reSortArrays.toRearrange(zeroCounter,negativeCountr,positiveCounter, test,newArray);
    }

    void toRearrange(int zeroCounter,int negativeCountr,int positiveCounter, int[] test, int[] newArray)
    {
        //calculate the negative elements and store in the new array
        for(int i=0; i<test.length;i++ )
        {
            if(test[i] <0)
            {
                newArray[nextCounter] = test[i];
                nextCounter++;
                negativeCountr++; //
            }
            else if(test[i]==0)
                zeroCounter++; // zero

            else
                {
                positiveCounter++; // positives
                    positiveArrays.add(test[i]);
            }
        }

        counterForPositive = negativeCountr;

        // if there are zeros, we need to add the zeros after negative nubmers
        if (zeroCounter >=1)  // zero = 2, nega = 3  positive : 1 total: 9
        {
            // add the zeros into the new arrays after negative elements
            for(int zeroStart = negativeCountr;zeroStart<zeroCounter+negativeCountr;zeroStart++)
            {
                newArray[zeroStart] = 0;
            }

            // cover the Arraylist to array
            int[] positiveArrayFromList = new int[positiveArrays.size()];
            for(int i =0;i<positiveArrays.size();i++)
            {
                positiveArrayFromList[i]=positiveArrays.get(i);

            }
            //print out the new array
            System.out.println("This is the  new array of positive numbers: " + Arrays.toString(positiveArrayFromList));

            //Copy the array and add to the intial array
          //  newArray = Arrays.copyOf(positiveArrayFromList,positiveArrayFromList.length-1);

            System.out.println("This is the  new array of newly converted numbers: " + Arrays.toString(newArray));

            int positiveNumberCounter=0;

            for(int positiveStart = zeroCounter+negativeCountr ;
                positiveStart<zeroCounter+negativeCountr+positiveCounter;
                positiveStart++)
            {
                newArray[positiveStart] = positiveArrayFromList[0+positiveNumberCounter];
                positiveNumberCounter++;
            }

        }
        else // if not have zeros, then add the positive numbers
        {
            for(int i=0; i<test.length;i++ )
            {
                if(test[i] >0)
                {
                    newArray[counterForPositive] = test[i];
                    counterForPositive++;
                }
            }
        }

        System.out.println("The re-arranged array is: " + Arrays.toString(newArray));
    }
}
