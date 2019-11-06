package com.Google;

import java.util.Arrays;

/*
 1 6  3 9 8 5

 1st smallest number  = 1
 2nd smallest number = 3
 */
public class NthSmallestNumber
{


    public static void main(String[] args) {

        int[] test = {1 ,6 , 3, 9, 8, 5};

        Arrays.sort(test);
        for(int i= 0;  i<test.length; i++)
        {
          if(i==0)
              System.out.println("1st smallest number is: " + test[i]);
              else if(i==1)
              System.out.println("2nd smallest number is: " + test[i]);
              else if(i==2)
              System.out.println(i+1+"rd smallest number is: " + test[i]);
              else
              System.out.println(i+1+"th smallest number is: " + test[i]);
        }
    }
}
