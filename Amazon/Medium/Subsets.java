package com.Amazon.Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets  // not yet DONE!!!!
{

    public List<List<String>> subsets(int[] nums)
    {
        List<List<String>> arrayList = new ArrayList<>();
        int n =  nums.length;
        String finalStr = "";
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                {
                    if(k==j)
                        finalStr+= String.valueOf(nums[k]);
                    else
                        finalStr+=String.valueOf(nums[k])+',';
                }

               // arrayList.add("["+finalStr+ "]");
                finalStr="";
            }
        }

        return arrayList;



    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        Subsets s= new Subsets();
        System.out.print(s.subsets(nums));

    }
}

/*
 // Pick starting point
        ArrayList<String> arrayList =  new ArrayList<>();
        int n =  arr.length;
        String finalStr = "";
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                {
                    if(k==j)
                        finalStr+= String.valueOf(arr[k]);
                    else
                        finalStr+=String.valueOf(arr[k])+',';
                }
                arrayList.add("["+finalStr+ "]");
                finalStr="";
            }
        }

      return arrayList.toString();
 */