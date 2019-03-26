package com.Amazon;

import java.util.*;
/*
The system generated an optimized delivery plan with X destinations.
 The ost optimized  plan would deliver to the closest X destinations from the start among all
  of the possible destination in the plan.

  Given an array of N possible deliver destinations, implement an algorithm to create the delivery
  plan for the closest X destinations.

  Input:
  The input to the function/method consists of three argument: numDestination.
  an integer representing the total number of possible delivery destginations for the truck

  ex:
  3,
  [[1,-3],[1,2],[3,4]],
  1
  ---> 1 2

  ex2:
  6,
  [[3,6],[2,4],[5,3],[2,7],[1,8],[7,9]]
   3

--> 2 4
    3 6
    5 3
 */

public class Delivery
{
    HashMap<String, Integer> allcontainer = new HashMap<>();
    static ArrayList<String> validRoutes = new ArrayList<>();
    List<Integer> distanceArray= new ArrayList<Integer>();
    HashMap<String, Integer> finalRoute = new HashMap<>();

    public static void main(String args[])
    {
        Delivery delivery =  new Delivery();

        int numDesinations = 6;
        int[][] deliveryLocations = {{1, -3},{8,58} , {1, 2}, {3, 4}, {9,54}};  //  [[1,-3],[1,2],[3,4]],
        int numbersDelivery = 3;

        System.out.println("The first shortest delivery distance is: " +delivery.getDistances(deliveryLocations, numDesinations, numbersDelivery));
       // System.out.println("The all of the corordination is: " + delivery.getHashMapKey(delivery.getDistances(deliveryLocations)));
       // System.out.println("The hashsmap of the delivery distance are: " + delivery.allcontainer);
    }

    HashMap getDistances(int[][] test, int deliverDestinations, int deliveryRequest)
    {
        for (int[] row : test)
        {
            // Loop through all columns of current row
            int x1 = 0, y1 = 0;
            for (int x : row) {
                if (x == row[0])
                    x1 = x;
                else
                    y1 = x;
            }
            getRealDistances(x1, y1, row);
            x1 = 0;
            y1 = 0;

        }

        // this is to generate the container of the distaince hashmap:
        System.out.println("This is the container println under the method for the hashmap:" + allcontainer);

        ArrayList<Integer> distainces = new ArrayList<>();
        Set<Map.Entry<String, Integer>> enter = allcontainer.entrySet();
        {
            for(Map.Entry<String, Integer> tests: enter)
            {
                distainces.add(tests.getValue());
            }
        }

        //
        //System.out.println("This is the sorted distance arrays: " + Arrays.sort());
        //.out.println("The container of distances: " + distainces);

       int[] real = new int[distainces.size()];
       for(int i = 0; i<real.length;i++)
       {
           real[i]=distainces.get(i);
       }

       Arrays.sort(real);
       System.out.println("This the converted array of distaince in integer: " + Arrays.toString(real));

        ArrayList<String> arrayList = new ArrayList<>();

       for(int i=0; i<deliveryRequest; i++)
       {
           Set<Map.Entry<String, Integer>> entries = allcontainer.entrySet();
           //ArrayList<String> arrayList = new ArrayList<>();
           int positionValue = distainces.get(i);
           for(Map.Entry<String, Integer> haha: entries)
           {
               int u=0;
               if(positionValue==haha.getValue())
               {
                   arrayList.add(u, haha.getKey());
                   u++;
               }
           }
       }
       //
        System.out.println("This is the final arraylist: " + arrayList);

        fillDistanceArray();

        int[] distanceArrayReal = new int[distanceArray.size()];
        for(int i = 0; i<distanceArray.size()-1; i++)
        {
            int big =0;
            int small = 0;

            for(int k = i+i; k<distanceArray.size();k++)
            {
                if (distanceArray.get(k) > distanceArray.get(i))
                {
                    big = distanceArray.get(i);
                    small = distanceArray.get(k);
                    distanceArray.set(k, big);
                    distanceArray.set(i, small);
                }
            }
        }

        for(int i=0; i<distanceArray.size();i++)
        {
            distanceArrayReal[i] = distanceArray.get(i);
        }

        int MIN = distanceArrayReal[distanceArrayReal.length-1];
        String keytoFetch ="";

        //return MIN;
        return allcontainer;
    }

    String getHashMapKey(int value)
    {
        String keytoFetch="";
        Set<Map.Entry<String, Integer>> theContainer = allcontainer.entrySet();
        for( Map.Entry<String, Integer> tests: theContainer)
        {
            if(tests.getValue() == value)
            {
                keytoFetch = tests.getKey();
                validRoutes.add(keytoFetch);
                break;
            }
        }

        return keytoFetch;
    }

    int counter = 0;
    //Set<Map.Entry<String, Integer>> theContainer = allcontainer.entrySet()

    void getRealDistances(int x, int y, int[] row)
    {
        int distance = (x * x + y * y);
        Long realDistance =  Math.round(Math.sqrt(distance));
        allcontainer.put(String.valueOf(Arrays.toString(row)), Integer.valueOf(realDistance.intValue()));
    }

    void fillDistanceArray()
    {
        Set<Map.Entry<String, Integer>> map = allcontainer.entrySet();
        for (Map.Entry<String, Integer> it : map)
        {
            getDistanceArray(it.getValue(), counter);
            counter++;
        }
    }

    void getDistanceArray(int test, int counter)
    {
        distanceArray.add(test);
    }
}

/*
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
	{
        // WRITE YOUR CODE HERE
    }
    // METHOD SIGNATURE ENDS
}

+
 */
