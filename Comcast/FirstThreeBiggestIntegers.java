package com.Comcast;

import java.util.Arrays;

/*
Write a java program to find out the first three highest numbers of the integer array in descending order.
        Explain the time complexity of your solution (Big O Notation)
*/
public class FirstThreeBiggestIntegers
{
    public static void main(String args[])
    {
      int[] test = {4,6,1,2,8,4,14,9,5,34,6};

      for(int i =0; i<test.length-1;i++)
      {
          int bigger =0, smaller = 0;

          for(int j=i+1; j<test.length;j++) {

              if (test[i] > test[j]) {
                  bigger = test[i];
                  smaller = test[j];
                  test[i] = smaller;
                  test[j] = bigger;
              }
          }
      }

      System.out.println(Arrays.toString(test));
      System.out.println("This is the order:"+ test[test.length-1]+ " , " + test[test.length-2]+ " , "+ test[test.length-3]);




    }
}
