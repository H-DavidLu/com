package com.Zillow;

import java.util.Arrays;

public class MediaOfTwoSortedArrays
{
    public static void main(String args[])
    {
        int[] t1 = {2,4,6};
        int[] t2 = {1,9,10};
        int median = 0;

        int[] after = new int[t1.length+t2.length];

       after = Arrays.copyOf(t1,6);
       // after[3] = 5;


        for(int i = 0;i<t2.length;i++)
        {
            after[i+3] = t2[i];

        }
        // sorting the new array
        Arrays.sort(after);

        // next: tell if this is odd-number array or even number array
        if(after.length %2 ==0)
        {

            int m1 = after.length/2;
            int m2 = m1-1;
            median = (after[m1]+after[m2])/2;
        }
        else
        {
            int m3 = ((int)after.length/2 );
            median = after[m3];
        }

        System.out.println("this is the after copy of t1 and t2: " + Arrays.toString(after));
        System.out.println("this is median: "+ median);





    }


}
