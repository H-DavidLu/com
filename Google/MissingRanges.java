package com.Google;

import java.util.ArrayList;

/*
Given a sorted integer array nums, where the range of elements are in
the inclusive range [lower, upper], return its missing ranges.

Example:

Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
Output: ["2", "4->49", "51->74", "76->99"]
 */
public class MissingRanges {

    ArrayList<Integer> newList =  new ArrayList<>();

    public static void main(String args[])
    {
        int[] nums = {0, 1, 3, 50, 75};
        int low =2, upper = 99;

        MissingRanges missingRanges =  new MissingRanges();
        missingRanges.getRanges(nums, low,upper);

    }

    void getRanges(int[] nums, int low, int upper)
    {


        int lowerFlag = 0;
        int upperFlag=0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] < low)
                newList.add(nums[i]);
            else if (nums[i] > low  && lowerFlag==0) {
                newList.add(low);
                newList.add(nums[i]);
                lowerFlag++;
            }
            else
            {
                newList.add(nums[i]);
            }

        }


        // for upper
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] < upper)
                newList.add(nums[i]);
            else if (nums[i] > upper  && upperFlag==0) {
                newList.add(upper);
                newList.add(nums[i]);
                lowerFlag++;
            }
            else
            {
                newList.add(nums[i]);
            }

        }

        System.out.println(newList);
    }
}

