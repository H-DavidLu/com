package com.netflix;
/*
https://www.interviewcake.com/question/python/product-of-other-numbers
Write a function get_products_of_all_ints_except_at_index() that takes a list of integers and returns a list of the products.

For example, given:

  [1, 7, 3, 4]

your function would return:

  [84, 12, 28, 21]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProduction
{

    public static ArrayList getProduction(int[] nums)
    {
        ArrayList<Integer> container = new ArrayList<>();
        int length = nums.length;
        int total = 1;
        for(int i= 0; i<length ; i++)
        {
           total*= nums[i];
        }

        for(int i= 0; i<length ; i++)
        {
          container.add(total/nums[i]);
        }

        return container ;

    }


    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 4};
        System.out.println(getProduction(nums) );
    }
}
