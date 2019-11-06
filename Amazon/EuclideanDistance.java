package com.Amazon;
/*
We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)



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

/*
public class EuclideanDistance
{

    public int[][] kClosest(int[][] points, int K)
    {
        LinkedHashMap<String, Double> distance = new LinkedHashMap<String, Double>();
        int[][] finalOnes = new int[K][2];

        for(int i=0;  i < points.length; i++)
        {
            distance.put(Arrays.toString(points[i]), ( Math.sqrt((points[i][0]* points[i][0]) + (points[i][1]*points[i][1]))));
        }

        Set<Map.Entry<String, Double>> disMap = distance.entrySet();
        ArrayList<Double> arrayList = new ArrayList<>();
        for(Map.Entry entry: disMap)
        {
            arrayList.add((Double) entry.getValue());
        }

        double[] integrArrayDis = new double[arrayList.size()];
        for(int i= 0; i<integrArrayDis.length ; i++)
        {
            integrArrayDis[i]=arrayList.get(i);

        }

        Arrays.sort(integrArrayDis);

        for(int i= 0; i<integrArrayDis.length ; i++)
        {
         while(K>0)
         {

          //  finalOnes[K-1][]=add2DArray(integrArrayDis[i], points, );

             K--;
         }
        }

        return
    }

    public static int[][] add2DArray(double distance, int[][] points,)
    {


        return points;
    }

    public static void main(String[] args)
    {
        int[][] points = {{1,3},{-2,2}};
        int K = 1;

        EuclideanDistance e =  new EuclideanDistance();
        System.out.println(e.kClosest(points,K));

    }

    }

*/