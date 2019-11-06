package com.Amazon;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        if(nums.length ==0)
            return 0;
        else if(nums.length==1 && nums[0]==1)
            return 0;
        else if (nums.length ==1 && nums[0]==0)
            return 1;
        else if (nums.length>1 && nums[0]!=0)
            return 0;
        else
        {

            Arrays.sort(nums);
            int missing = 0;
            int flag = 0;
            for(int p = 0; p<nums.length-1; p++)
            {

                if(nums[p+1]-nums[p] >1)
                {
                    missing = nums[p]+1;
                    flag++;
                    break;
                }
            }

            if(flag ==0)

                return nums[nums.length-1];
            else
                return missing;
        }
    }

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(nums));
    }
}
