package com.Uber;

import com.Google.SumOfContinuousElementInArray;

import java.util.Arrays;

public class SumOfTwoSortedArrays
{

    public static void main(String args[])
    {
      int[] nums1 = {1,2};
      int[] nums2 = {3,4};

      SumOfTwoSortedArrays sumOfTwoSortedArrays =  new SumOfTwoSortedArrays();
      System.out.println( sumOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    protected double findMedianSortedArrays(int[] nums1, int[] nums2)
    {

        int[] merged = new int[nums1.length+nums2.length];
        double median = 0.0;
        for(int i = 0; i< nums1.length; i++)
        {
            // merge the nums1 first
            merged[i]= nums1[i];

        }

        for(int j =0; j< nums2.length; j++)
        {
            merged[j+nums1.length]=nums2[j];

        }

        Arrays.sort(merged);

        if(merged.length%2==0)
            return median = (double)(merged[merged.length/2] + merged[(merged.length/2)-1])/2;
        else
            return median = merged[((int)merged.length/2)];

    }
}
