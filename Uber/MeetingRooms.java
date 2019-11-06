
/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
find the minimum number of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1
NOTE: input types have been changed on April 15, 2019. Please reset to default
 code definition to get new method signature.
 */

package com.Uber;

import java.lang.reflect.Array;
import java.util.*;

public class MeetingRooms
{
     TreeSet<String> intercetion =  new TreeSet<>();
     TreeSet<String> nonIntersection = new TreeSet<>();
     HashMap<String, Integer> interceptionMap = new HashMap<>();
    public static void main(String args[])
    {
        int[][] intervals = {{0, 30},{5, 10},{15, 20}, {16, 26}};
        MeetingRooms meetingRooms =  new MeetingRooms();
        meetingRooms.minMeetingRooms(intervals);
    }

    void minMeetingRooms(int[][] intervals)
    {
         int length = intervals.length;
         for(int i= 0; i<length-1 ; i++)
         {
             for(int j= i+1; j<length ; j++)
             {
                 //        int[][] intervals = {{0, 30},{5, 10},{15, 20}};
                 if((intervals[i][1] < intervals[j][0])
                 )
                 {
                     nonIntersection.add( "["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]");
                     nonIntersection.add( "["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]");
                     interceptionMap.put( "["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]" , 0);
                     interceptionMap.put( "["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]" , 0);

                 }
                 // the second one includes the first one
                 else if((intervals[i][0] > intervals[j][1]))
                 {
                     nonIntersection.add("["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]");
                     nonIntersection.add("["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]");
                     interceptionMap.put( "["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]" , 0);
                     interceptionMap.put( "["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]" , 0);

                 }
                 else
                 {
                     intercetion.add("["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]");
                     intercetion.add("["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]");

                     interceptionMap.put( "["+ String.valueOf(intervals[i][0])+ "," + String.valueOf(intervals[i][1])+"]" , 1);
                     interceptionMap.put( "["+ String.valueOf(intervals[j][0])+ "," + String.valueOf(intervals[j][1])+"]" , 1);
                 }
             }
         }
            System.out.println("The non intersection list: " + nonIntersection );
            System.out.println("The  intersection list: " + intercetion );
           // System.out.println("The  intersection map is : " + interceptionMap );
    }
}
