package com.Google;

/*

pwoer set is the array to set as all subset of elements including {}

[1,2,3] --> {}, {1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}
 */

public class PowerSet
{

    public static void main(String args[])
    {
      int[] test = {1,2,3,4,5};
      PowerSet powerSet = new PowerSet();
      powerSet.getSets(test);

    }

    void getSets(int[] test)
    {
        int length = test.length;
         //empty set
        System.out.println("This is the empty: {} " );

        //starting sorting and looping
        // one-element subarrays
        for(int i=0; i<length;i++)
        {

            System.out.println("This is only one element: " + "{ " +  test[i]+ " }");
        }

        // this is the two elements subarrays
        for(int i=0; i<length-1;i++)
        {
            System.out.println("This is the two elements:"  + "{ " + test[i] + ", "+ test[i+1] +" }");

        }

        // three elements
        for(int i=0; i<length-2;i++)
        {
            System.out.println("This is the two elements:"  + "{ " + test[i] + ", "+ test[i+1] + " , " + test[i+2] +" }");

        }
    }
}
