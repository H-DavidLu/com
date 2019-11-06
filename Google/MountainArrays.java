package com.Google;
/*
public boolean validMountainArray(int[] A) {

    }

    Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[B.length - 1]


Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [,3,2,10]
Output: true
 */

import java.util.Arrays;

public class MountainArrays
{

    public static void main(String args[])
    {

        int[] test = {0,1,2,3,4,5,6,7,8,5};
        MountainArrays mountainArrays = new MountainArrays();
        System.out.println(mountainArrays.validMountainArray(test));
    }
    public boolean validMountainArray(int[] A)
    {
        int length = A.length;
        int[] copyA = A.clone();

        if(length<3)
        {
            return false;
        }
        else // length >=3
        {
            Arrays.sort(copyA);
            int maxValue = copyA[copyA.length-1];
            int max = 0;
            int maxValueIndex = 0;
            for(int i= 0; i< A.length ; i++)
            {
                if(A[i]== maxValue)

                {
                    max= A[i];
                    maxValueIndex=i;
                    break;
                }

            }

            // check if there is only a max number in this array
            for(int p= 0; p<copyA.length  ; p++)
            {
                if(copyA[length-1] == copyA[length-2]) {
                    return false;
                }
            }


            if(max == A[0]) //position 0 is the max
            {
                for(int i=0; i<A.length-1; i++) // length = 4
                {
                    if(A[i]>A[i+1] && i < A.length-1 )
                        return false;
                    else if( A[i]>A[i+1] &&  i==A.length-2)
                        return false;
                    else if( A[i]<A[i+1])
                    {
                        return false;
                        //break;
                    }
                }
            }
            else if (max == A[length-1]) // the max is at the last position
            {
                return false;

            }
            else // position is NOT at 0
            {
                int rightSide = 0;
                int leftSigde = 0;

                for(int j=maxValueIndex; j<A.length-1; j++)  // calculate the right side elements
                {
                    if(A[j]>A[j+1] && j < A.length-1 )
                        continue;
                    else if(A[j]>A[j+1] && j==A.length-1)
                        return true;
                    else {
                        rightSide++;
                        return false;
                       // break;
                    }
                }

                for(int k=maxValueIndex ; k>0 ; k--)
                {
                    if(A[k-1]<A[k] && k >0 )
                        continue;
                    else if(k==0)
                        return true;
                    else {
                        rightSide++;
                        return false;
                     //   break;
                    }
                }

               if(rightSide>0 && leftSigde>0)
                   return false;
               else if(rightSide ==0 && leftSigde == 0)
                   return true;
               else
                   return  false;
            }
        }
        return false;
    }
}
