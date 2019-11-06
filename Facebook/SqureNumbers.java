package com.Facebook;
/*
This problem was asked by Facebook.

Given a positive integer n, find the smallest number of squared integers which sum to n.

For example, given n = 13, return 2 since 13 = 32 + 22 = 9 + 4.

Given n = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.
 */

import java.util.*;
import java.util.Map.Entry;

public class SqureNumbers
{
    ArrayList<Integer> onlySelfSqaure = new ArrayList<>();
    HashMap<String,Integer> twoNumbers = new HashMap<>();
    HashMap<String,Integer> dividedNumbers = new HashMap<>();
    ArrayList<Integer> divideArrayList = new ArrayList<>();

    void checkSquares(int target)
    {
        // first to locate the numbers of square to target
        int maxPivot = (int)Math.sqrt(target);
        int[] pivotArray  = new int[maxPivot];
        for(int i= 0; i< maxPivot; i++)
        {
            pivotArray[i]=(i+1)*(i+1);
        }

        // the only one time square number is equal to the target number
        for(int i= 0; i<pivotArray.length; i++)
        {
            if(pivotArray[i]==target)
            {
                onlySelfSqaure.add(1);
                break;
            }
        }

        for(int j= 0; j<pivotArray.length-1 ; j++)
        {
            for(int p= j+1; p<pivotArray.length ; p++)
            {
                if(pivotArray[j]+pivotArray[p]==target)
                {
                    twoNumbers.put("["+ pivotArray[j]+ ", " + pivotArray[p] + "]" ,2);
                }

            }
        }

        for(int r= 1; r<pivotArray.length ; r++)
        {
            if(target%pivotArray[r]==0)
                dividedNumbers.put("["+ pivotArray[r]+ ", " + pivotArray[r] + "]" , target/pivotArray[r]);
        }

        // sorting the results of dvide numbers map
        Set<Entry<String, Integer>> test = dividedNumbers.entrySet();
        {
            for(Entry entry:test)
            {
                divideArrayList.add((int)entry.getValue());
            }

            Collections.sort(divideArrayList);
        }
    }


    public static void main(String args[])
    {
        int target = 158788;
        SqureNumbers squreNumbers = new SqureNumbers();
        squreNumbers.checkSquares(target);

        if(squreNumbers.onlySelfSqaure.size() !=0)
            System.out.println("The number of smallest number of square numbers:" + 1);
        else if (squreNumbers.twoNumbers.size() !=0)
            System.out.println("The number of smallest number of square numbers:" + 2);
        else if (squreNumbers.onlySelfSqaure.size()==0 &&
                squreNumbers.twoNumbers.size()==0 &&
                squreNumbers.dividedNumbers.size() !=0
                )
        {
            System.out.println(" 1: There are not such pairs to combine." + (int)squreNumbers.divideArrayList.get(squreNumbers.divideArrayList.size()-1));
            System.out.println(" 1: There are not such pairs to combine." + squreNumbers.dividedNumbers);


        }
        else
            System.out.println("2:  There are not such pairs to combine.");





    }
}
