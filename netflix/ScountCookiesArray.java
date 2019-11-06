package com.netflix;
/*
https://www.interviewcake.com/question/java/merge-sorted-arrays

Each order is represented by an "order id" (an integer).

We have our lists of orders sorted numerically already, in arrays. Write a method to merge our arrays of orders into one sorted array.

For example:

  int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
// prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class ScountCookiesArray
{

    public static String mergeArrays(int[] myArray, int[] alicesArray)
    {

        int[] newArray1 = new int[myArray.length+alicesArray.length];

        for(int i= 0; i<myArray.length ; i++)
        {
            newArray1[i] = myArray[i];
        }

        for(int i= 0; i<alicesArray.length ; i++)
        {
            newArray1[myArray.length+i] = alicesArray[i];
        }

        Arrays.sort(newArray1);
        return Arrays.toString(newArray1);

    }


    public static void main(String[] args) {

        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        System.out.println(mergeArrays(myArray,alicesArray));

    }
}
