package com.Facebook;
/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreeUniqueElementSums
{

    public static void main(String args[])
    {
      int[] numberArray = {-1, 0, 1, 2, -1, -4};
      int target = 0;
      ThreeUniqueElementSums threeUniqueElementSums = new ThreeUniqueElementSums();


        for(int i= 0; i<numberArray.length-1 ; i++)
      {
          for(int j= i+1; j<numberArray.length ; j++)
          {
              threeUniqueElementSums.getTripleElements(i, j, numberArray, target  );
          }
      }

        System.out.println( "This is the final list: "+ threeUniqueElementSums.arrayList);
    }

    ArrayList<String> arrayList = new ArrayList<>();
    void getTripleElements(int firstPosition, int secondPosition, int[] numberArray, int target)  // we have updated the positions of j and i to zero!
    {

        // to have the two elements to be deleted
        String[] afterDeleted = new String[numberArray.length];

        for(int i= 0;i<afterDeleted.length ; i++)
        {
            afterDeleted[i]= String.valueOf(numberArray[i]);
        }

        afterDeleted[firstPosition]="#";
        afterDeleted[secondPosition]="#";
        String nextMerge = "";
        ArrayList<String> afterTwo =  new ArrayList<>();
        for(int i= 0; i<afterDeleted.length ; i++)
        {
             if(afterDeleted[i].contains("#"))
                 continue;
             else
                 afterTwo.add(afterDeleted[i]);
        }

        int[] afterFinalTwoDeleted = new int[afterTwo.size()];

        for(int i= 0;i<afterTwo.size() ; i++)
        {
            afterFinalTwoDeleted[i] = Integer.valueOf(afterTwo.get(i));
        }

        int sumOfTwo = numberArray[firstPosition]+numberArray[secondPosition];
        for(int i= 0; i<afterFinalTwoDeleted.length; i++)
        {
            if(sumOfTwo+afterFinalTwoDeleted[i]==target)
                arrayList.add("( " + String.valueOf(firstPosition)+","+ String.valueOf(secondPosition)+","+ afterFinalTwoDeleted[i]+" )");
        }

    }
}
