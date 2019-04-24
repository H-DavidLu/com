package com.Uber;
/*
A move consists of taking a point (x, y) and transforming it to either (x, x+y) or (x+y, y).

Given a starting point (sx, sy) and a target point (tx, ty), return True if and only
 if a sequence of moves exists to transform the point (sx, sy) to (tx, ty). Otherwise, return False.

Examples:
Input: sx = 1, sy = 1, tx = 3, ty = 5
Output: True
Explanation:
One series of moves that transforms the starting point to the target is:
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)

Input: sx = 1, sy = 1, tx = 2, ty = 2
Output: False

Input: sx = 1, sy = 1, tx = 1, ty = 1
Output: True
 */

import java.util.ArrayList;
import java.util.HashMap;

public class ReachingPoints {

    ArrayList<String> tracks = new ArrayList();
    String trackStr = "";

    public static void main(String args[]) {
        int xStart = 1, yStart = 1, xTarget = 3, yTarget = 5;
        ReachingPoints reachingPoints = new ReachingPoints();


        System.out.println( "This is: " + reachingPoints.checkPoints(xStart, yStart, xTarget, yTarget));
        //System.out.println( "This is: " + reachingPoints.checkPoints(xStart, yStart, xTarget, yTarget));

    }

    String checkPoints(int xStart, int yStart, int xTarget, int yTarget)
    {

        if (xTarget == yTarget)
            System.out.println( "false");

        else if (xStart == xTarget || yStart == yTarget)  // if meet the criteria with each side in x or y
        {
           if((yTarget-xTarget)==xStart || (xTarget-yTarget)==yTarget )
           {
               trackStr+= "[ "+ String.valueOf(xStart) +", " + String.valueOf(yStart)+" ]";
           }

        } else if (xStart != xTarget || yStart != yTarget) //  not yet meet the criteria
        {
            if(xTarget>yTarget)  // if the xTarget is greater than yTarget
            {
                trackStr+= "[ "+ String.valueOf(xTarget-yTarget) +", " + String.valueOf(yTarget)+" ]";
                checkPoints(xStart,yStart,xTarget-yTarget,yTarget);

            }
            else if(xTarget<yTarget)  //if the xTarget is less then yTarget
            {
                trackStr+= "[ "+ String.valueOf(xTarget) +", " + String.valueOf(yTarget-xTarget)+" ]";
                checkPoints(xStart,yStart,xTarget,yTarget-xTarget);
            }
            else if(xStart==xTarget && yStart==yTarget)
            {
                trackStr+= "[ "+ String.valueOf(xTarget) +", " + String.valueOf(yTarget-xTarget)+" ]";
            }
        }

      return trackStr;
    }

}