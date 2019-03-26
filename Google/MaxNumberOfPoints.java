package com.Google;
/*
Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.

Example 1:

Input: [[1,1],[2,2],[3,3]]
Output: 3
Explanation:
^
|
|        o
|     o
|  o
+------------->
0  1  2  3  4
Example 2:

Input: [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4
Explanation:
^
|
|  o
|     o        o
|        o
|  o        o
+------------------->
0  1  2  3  4  5  6
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfPoints
{
    ArrayList<Integer> slope = new ArrayList<>();


    public static void main(String args[])
    {
       // int[][] test = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[][] test = {{1,4},{2,3},{3,2},{4,1}};


        MaxNumberOfPoints maxNumberOfPoints =  new MaxNumberOfPoints();
        System.out.println(maxNumberOfPoints.getPair(test));

    }

    HashMap getPair(int[][] test)
    {
        for(int i =0;i<test.length-1;i++)
        {
            for(int j=i+1; j<test.length;j++)
            {
                getSlope(test[i], test[j], test);
            }

        }
         return slopeHashMap;
    }

    HashMap<String, String> slopeHashMap = new HashMap<>();

    void getSlope(int[] first, int[]second, int[][]test)
    {
        int x1 = first[0];
        int x2 = second[0];
        int y1 = first[1];
        int y2 = second[1];
        int ySum = y2-y1;
        int xSum = x2-x1;

        int xCounter = 0;
        int yCounter = 0;
        int nonXCounter = 0;
        int nonYCounter = 0;
        int nonZeroSlope = 0;

        if(xSum ==0 || ySum ==0)
        {

            if(xSum ==0 && ySum!= 0) // this is to consider the cases of slope 0s:
            {
                slopeHashMap.put(String.valueOf(0)+" :ZeroSlope:" + xCounter, String.valueOf("Slope: 0 in X-xile: " + Arrays.toString(first) +
                        " :" + String.valueOf(Arrays.toString(second))));

                xCounter++;
            }
            else
            {
                slopeHashMap.put(String.valueOf(0)+" :ZeroSlope:" + yCounter, String.valueOf("Slope: 0 in Y-xile: " + Arrays.toString(first) +
                        " :" + String.valueOf(Arrays.toString(second))));
                yCounter++;
            }
        }
        else {
            double slope = (double) ySum / xSum;
            double b = (double) (first[1] - slope * first[0]);

            // start to test if the points are in the line we calculate
            for (int i = 0; i < test.length - 1; i++)
            {
                int[] temp = test[i];
                if( (temp[0] == x1 && temp[1]== y1) || (temp[0] == x2 && temp[1]== y2) )
                    continue;

                else if (temp[1] == (slope * temp[0] + b))
                {
                    slopeHashMap.put(String.valueOf(slope)+ " # " + nonZeroSlope , "Non-zero Slope as: "+String.valueOf(Arrays.toString(test[i])+ ":"
                            + String.valueOf(Arrays.toString(first)) + " : " + String.valueOf(Arrays.toString(second))));
                }
            }
        }
    }
}
