package com.Google;
/*
Given a sorted integer array nums, where the range of elements are in the inclusive range [lower, upper],
return its missing ranges.

Example: type 1

Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
Output: ["2", "4->49", "51->74", "76->99"]

type 2:  if just give a range and who the missing ranges. The elemnets are not guranteed in the inclusive range of low and
high.

This solution is for the type 1 first. The solution to the type 2 will come later.
 */

import java.util.ArrayList;

public class Ranges
{

    ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String args[])
    {

        int[] test= {0,4,6,11};
        int low = 0, high = 20;
        Ranges ranges = new Ranges();


        for(int i= 0; i<test.length; i++)
        {
            if(i==test.length-1)
                ranges.getRanges(test[i],high);
            else
                ranges.getRanges(test[i], test[i+1], low,high);
        }

        System.out.println(ranges.arrayList);
    }

    void getRanges(int startLow, int startend, int low, int high)
    {
        if(startend-startLow==2)
            arrayList.add("[ " +String.valueOf(startLow+1)+ " ]");
        else
        {
            arrayList.add("[ " +String.valueOf(startLow+1)+ "," + String.valueOf(startend-1)+ " ]");
        }
    }

    void getRanges(int startLow, int startend)
    {
        arrayList.add("[ " +String.valueOf(startLow+1)+ "," + String.valueOf(startend-1)+ " ]");
    }
}
