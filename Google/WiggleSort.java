package com.Google;

import java.util.Arrays;

/*
Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

Example:

Input: nums = [3,5,2,1,6,4]

// sorted" 1 2 3 4 5 6
1 4  2  5   3   6

 1 1 1 1 1  :
 1 1 1 1 1 1

Output: One possible answer is [3,5,1,6,2,4]
 */
public class WiggleSort
{
    public String wiggleSort(int[] nums) {
        int length = nums.length;
        int[] newNums = new int[nums.length];
        Arrays.sort(nums);
        int countSmallNums = 0;
        int countLargenNums = 0;
        int flagSmallerNumbers = 2;
        int flagLargerNumbers = 2;

        if (length % 2 == 0)
        {
            // small numbers
            for (int i = 0; i < (int) newNums.length / 2; i++) {
                if (i == 0) {
                    newNums[i] = nums[i];
                    countSmallNums++;
                }
                    else {
                        countSmallNums++;
                    newNums[flagSmallerNumbers] = nums[i];
                    flagSmallerNumbers = flagSmallerNumbers + 2;
                }
            }

            flagSmallerNumbers = 0;

            // large numbers
            for (int i = 0; i < (int) newNums.length/2; i++) {
                if (i == 0) {

                    newNums[i+1] = nums[countSmallNums];
                    countLargenNums++;
                }
                    else {

                    newNums[flagLargerNumbers+1] = nums[countSmallNums+i];
                    flagLargerNumbers = flagLargerNumbers + 2;
                    countLargenNums++;
                }
            }
            flagLargerNumbers = 0;
        }
        else
        {
            // small numbers
            for (int i = 0; i <= (int) newNums.length / 2; i++) {
                if (i == 0) {
                    newNums[i] = nums[i];
                    countSmallNums++;
                }
                else {
                    countSmallNums++;
                    newNums[flagSmallerNumbers] = nums[i];
                    flagSmallerNumbers = flagSmallerNumbers + 2;
                }
            }

            // large numbers
            for (int i = 0; i < (int) newNums.length/2; i++) {
                if (i == 0) {

                    newNums[i+1] = nums[countSmallNums];
                    countLargenNums++;
                }
                else {

                    newNums[flagLargerNumbers+1] = nums[countSmallNums+i];
                    flagLargerNumbers = flagLargerNumbers + 2;
                    countLargenNums++;
                }
            }
        }

        return Arrays.toString(newNums);
    }

    public static void main(String[] args)
    {
        int[] nums= {3,5,2,1,6,4};
        WiggleSort w = new WiggleSort();
        System.out.println("This is the output  of list as : " + w.wiggleSort(nums) );
    }
}
