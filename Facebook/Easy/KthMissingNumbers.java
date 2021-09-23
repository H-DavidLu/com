package com.Facebook.Easy;
/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 */

public class KthMissingNumbers {

    public static void main(String args[])
    {
        int k = 5;
        int[] test= {2,5,6};
        KthMissingNumbers kthMissingNumbers = new KthMissingNumbers();
        System.out.println(kthMissingNumbers.getKthnumber(k, test));

    }

    public int getKthnumber(int k , int[] test){
        if(test.length==0 || test==null || k==0){
            return 0;

        }

        int[] arrayForK =  new int[k];
        int flag = 0;
        int kthCounter = 0;
        int kthNumber = 0;

        // first. check if the elements are back to back with 1 difference
        for(int i= 0; i<test.length-1 ; i++)
        {
            if(test[i]+1== test[i+1]){
                continue;
            }
            else {
                flag = 1;
                break;
            }
        }

        if(flag ==0){
            return test[test.length-1]+k;

        }
        else{
            if(test[0]!=0){
                kthCounter++;

            }


            for(int i= 0; i<test.length-1 ; i++)
            {
                if(test[i]+1 == test[i+1]){
                    continue;

                }else{
                    if(kthCounter<k){
                        kthCounter++;
                    }
                    else
                        kthNumber=test[i]+1;
                }
            }

        }
       return kthNumber;
    }

}
