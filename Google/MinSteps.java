package com.Google;

/*
You are in an infinite 2D grid where you can move in any of the 8 directions:

 (x,y) to
    (x+1, y),
    (x - 1, y),
    (x, y+1),
    (x, y-1),
    (x-1, y-1),
    (x+1,y+1),
    (x-1,y+1),
    (x+1,y-1)
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example:

Input: [(0, 0), (1, 1), (1, 2)]
Output: 2
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 */

import java.util.ArrayList;

public class MinSteps
{

    ArrayList<Integer> arrayList =  new ArrayList<>();

    public static void main(String args[])
    {
      int[][] test = {{-3,2}, {4,5}, {-6,-7}};

      MinSteps minSteps = new MinSteps();
      minSteps.checkSteps(test);
    }

    void checkSteps(int[][] test)
    {
        for(int i=0;i<test.length-1;i++)
        {
            getNumberOfSteps(test[i], test[i+1]);

        }

        System.out.println(arrayList);
    }

    void getNumberOfSteps(int[] first, int[] second)
    {
          int xFirst = Math.abs(first[0]);
          int yFirst = Math.abs(first[1]);
          int xSecond = Math.abs(second[0]);
          int ySecond = Math.abs(second[1]);


          int xSum = Math.abs(xSecond-xFirst);
          int ySum = Math.abs(ySecond-yFirst);
          int secondSum = 0;
          int pivot = 0;
          if(xSum>ySum) {
              pivot = ySum;
              secondSum= xSum-ySum;
          }
          else if(xSum<ySum) {
              pivot = xSum;
              secondSum=ySum-xSum;
          }
          else
          {
              pivot = xSum;
              secondSum = 0;
          }

          arrayList.add(pivot+secondSum);
          pivot=0;
          secondSum=0;

    }
}
