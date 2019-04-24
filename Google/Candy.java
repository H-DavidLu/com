package com.Google;
/*
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:
1,
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

Example 1:

Input: [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
             The third child gets 1 candy because it satisfies the above two conditions.
 */

public class Candy
{

    public static void main(String args[])
    {

        int[] kids=  { 1,2,1,2,1,2};
        int[] candyNumberInitial = new int[kids.length];

        for(int i= 0; i<kids.length; i++)
        {
            candyNumberInitial[i]=1;
        }

        Candy candy = new Candy();
       System.out.println( candy.calculateCandies(kids,candyNumberInitial));
       // candy.calculateCandies(kids,candyNumberInitial);
    }

    int calculateCandies(int[] kids, int[] candiesNumber)
    {

        for(int i= 0;i<kids.length-1 ; i++)
        {

            if(i==0)
            {
                if(kids[i+1]>kids[i])  // the current position level is higher than the after one
                {

                    candiesNumber[i+1] = candiesNumber[i]+1;
                }
                else if(kids[i]>kids[i+1])
                    candiesNumber[i] = candiesNumber[i]+1;
                else
                    continue;

            }
            else
            {
                if(kids[i]>kids[i+1])  // the current position level is higher than the after one
                {//3,2
                    if(candiesNumber[i]==candiesNumber[i+1]) //
                        candiesNumber[i] = candiesNumber[i]+1;
                    else if (candiesNumber[i]>candiesNumber[i+1])
                        continue;
                }
                else if(kids[i]<kids[i+1])// like : level---  2,3
                {
                    if(candiesNumber[i]==candiesNumber[i+1]) //
                        candiesNumber[i+1] = candiesNumber[i+1]+1;
                    else if(candiesNumber[i]<candiesNumber[i+1])
                        continue;
                    else
                        candiesNumber[i+1] = (candiesNumber[i]- candiesNumber[i+1])+1;
                }
            }
        }
        int min =0;
        for(int i= 0; i<candiesNumber.length ; i++)
        {
            min+=candiesNumber[i];
        }

        return min;
    }
}
