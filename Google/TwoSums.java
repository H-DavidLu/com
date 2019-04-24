package com.Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
class Solution {
    public int[] twoSum(int[] nums, int target)
    {



    }
}
 */
class TwoSums
{

    public static void main(String args[])
    {
        int[] test = {1,7,4,2,5,0};
        int target = 6;
        System.out.println("The sets are: " + twoSum(test, target));
    }

    public static HashSet<String> twoSum(int[] nums, int target)
    {

        HashSet<String> results = new HashSet<>();

        for(int i= 0; i<nums.length-1 ; i++)
        {

            for(int j= i+1; j<nums.length ; j++)
            {

                if(target== nums[i]+nums[j])
                    results.add("[ " + i +" , "+ j + " ]");
            }
        }
        return  results;
    }
}
