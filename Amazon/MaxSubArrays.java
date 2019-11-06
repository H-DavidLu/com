package com.Amazon;
/*
Given an integer array nums, find the contiguous subarray
 (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArrays
{
    ArrayList<Integer> arrayList = new ArrayList<>();
    public int maxSubArray(int[] nums)
    {

        for(int i= 0; i<nums.length-1 ; i++)
        {
            for(int p= i+1; p<nums.length ; p++)
            {
                addUp(i,p, nums);
            }
        }

        for(int i= 0; i<nums.length ; i++)
        {
            arrayList.add(nums[i]);
        }

        int[] finalArrayContainer = new int[arrayList.size()];
        for(int i= 0; i<finalArrayContainer.length ; i++)
        {
             finalArrayContainer[i] = arrayList.get(i);
        }

        Arrays.sort(finalArrayContainer);

        return finalArrayContainer[finalArrayContainer.length-1];

    }

    void addUp(int startIndex, int endIndex, int[] nums)
    {
        int total = 0;

        for(int i= startIndex; i<=endIndex ; i++)
        {
            total+= nums[i];
        }

        if(!arrayList.contains(total))
            arrayList.add(total);

    }
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        MaxSubArrays m = new MaxSubArrays();

        System.out.println(m.maxSubArray(nums));
        System.out.println(m.arrayList);

    }

}
