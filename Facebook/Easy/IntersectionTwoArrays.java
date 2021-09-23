package com.Facebook.Easy;
/*
Done: Done!

https://leetcode.com/problems/intersection-of-two-arrays/
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
 */

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionTwoArrays
{
    public static void main(String[] args) {
        Integer[] nums1={4,9,5, 1,7,9,10,12,13};
        Integer[] nums2 = {9,4,9,8,4, 5,6,7,8,12,13};

        IntersectionTwoArrays I= new IntersectionTwoArrays();
        System.out.println(Arrays.toString(I.intersection2(nums1,nums2)));

    }

    public int[] intersection2(Integer[] num1, Integer[] num2)
    {
        return null;

    }

    /*
    // this is the first approach to do so
    // but thi is not optimise
    public int[] intersection(int[] nums1, int[] nums2)
    {
       int length1 = nums1.length;
       int length2= nums2.length;
       ArrayList<Integer> arrayList = new ArrayList<>();
       HashSet<Integer> hashSet =  new HashSet<>();
       if(length1>length2)
       {
           for(int i= 0; i<length1 ; i++)
           {
                for(int p= 0; p<length2 ; p++)
                {
                    if(nums1[i]==nums2[p])
                    {
                        arrayList.add(nums1[i]);
                    }

                }
           }
       }
       else
       {
           for(int i= 0; i<length2 ; i++)
           {
               for(int p= 0; p<length1 ; p++)
               {
                   if(nums2[i]==nums1[p])
                   {
                       arrayList.add(nums2[i]);
                   }
               }
           }
       }

       for(int i= 0; i<arrayList.size() ; i++)
       {
          hashSet.add(arrayList.get(i));
       }

       int[] finalArrays = hashSet.stream().mapToInt(Number::intValue).toArray();

       return finalArrays;
    }

     */
}

