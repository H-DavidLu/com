package com.Amazon.Amazon.OA;

import java.util.*;

/*
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.
The answer is guaranteed to be unique (except for the order that it is in.)



Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
 */
public class KCloese
{

    ArrayList<Integer> arrayList =  new ArrayList<>();

    public int[][] kClosest(int[][] points, int K) {
        int[][] returnValues = new int[K][2];
        int result = 0;
        HashMap<int[], Integer> disMap = new HashMap<>();

        for (int i = 0; i < points.length ; i++) {
            result=calculate(points[i]);
            disMap.put(points[i], result);
        }

        int[] disArray = new int[arrayList.size()];
        for (int i = 0; i < disArray.length; i++) {
            disArray[i] = arrayList.get(i);
        }

        Arrays.sort(disArray);
        System.out.println(disMap);
        System.out.println(Arrays.toString(disArray));

        Set<Map.Entry<int[], Integer>> disSet = disMap.entrySet();
        for (int i = 0; i < K; i++)
        {
            for (Map.Entry entry : disSet) {
                if (entry.getValue().equals((int)disArray[i]))
                    returnValues[i] = (int[]) entry.getKey();  // entry.getKey();
            }

        }

        return returnValues ;
    }
    int calculate(int[] a)
    {
        int dis1 = a[0]*a[0] + a[1]*a[1];
        arrayList.add(dis1);
        return dis1;
    }


    public static void main(String[] args) {
        int[][] points = {{1,0},{0,1}};
        int K = 2;

        KCloese kCloese = new KCloese();
        int[][] test = kCloese.kClosest(points, K);
        for(int i= 0; i<test.length ; i++)
        {
            System.out.println(Arrays.toString(test[i]));
        }

    }
}
