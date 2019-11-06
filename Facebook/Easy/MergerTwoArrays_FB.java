package com.Facebook.Easy;

import java.util.Arrays;

/*
Done: not yet
https://leetcode.com/problems/merge-sorted-array/

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

 */
public class MergerTwoArrays_FB
{

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n=3;

        MergerTwoArrays_FB F = new MergerTwoArrays_FB();
        F.merge(nums1,m,nums2,n);


    }

    public void merge(int[] nums1, int m, int[] nums2, int n)
    {

        for(int i= 0; i<nums2.length ; i++)
        {
              nums1[m+i]  = nums2[i];
        }

        Arrays.sort(nums1);
         System.out.println(Arrays.toString(nums1));
    }
}
