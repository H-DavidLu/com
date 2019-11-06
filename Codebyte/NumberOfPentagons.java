package com.Codebyte;
/*
https://www.coderbyte.com/editor/guest:Pentagonal%20Number:Java
Challenge
Have the function PentagonalNumber(num) read num which will be a positive integer and determine
how many dots exist in a pentagonal shape around a center dot on the Nth iteration. For example,
in the image below you can see that on the first iteration there is only a single dot,
on the second iteration there are 6 dots, on the third there are 16 dots, and on the fourth there are 31 dots.



Your program should return the number of dots that exist in the whole pentagon on the Nth iteration.

Hard challenges are worth 15 points and you are not timed for them.
Sample Test Cases
Input:2

Output:6


Input:5

Output:51  //

1 +   5 + 3*5-5 + 4*5-5+ 5*5-5

 */
public class NumberOfPentagons {


    public static int PentagonalNumber(int num)
    {

        if(num ==0)
            return 0 ;
         else if(num ==1)
            return 1;
        else if(num == 2)
            return 6;
        else if(num>=3)
        {
            return (5*(num-1)) +PentagonalNumber(num-1);
        }

        return 0;
    }

    public static void main(String[] args) {

        int num = 8;
        System.out.println( PentagonalNumber(num));

    }
}
