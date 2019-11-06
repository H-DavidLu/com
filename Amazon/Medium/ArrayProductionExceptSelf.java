package com.Amazon.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProductionExceptSelf
{

    public int[] productExceptSelf(int[] nums)
    {
        int[] results = new int[nums.length];
        int[] cloned = nums.clone();
        int pivot =1;
        int sum = 1;
        for(int i= 0; i<nums.length ; i++)
        {
                 for(int p= 0; p<cloned.length ; p++)
                 {
                     if(p==i)
                     {
                         /*
                         cloned[p]=1;
                         sum*=cloned[i];
                         cloned[p]=nums[p];
                         */

                         continue;
                     }

                     else {
                         sum *= cloned[p];
                     }
                 }
                 results[i]=sum;
                 sum=1;
        }
        return  results;
    }

    public static void main(String[] args)
    {

        int[] nums = {1,2,3,4};
        ArrayProductionExceptSelf A = new ArrayProductionExceptSelf();
        System.out.println(Arrays.toString(A.productExceptSelf(nums)));

    }
}
