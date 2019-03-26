package com.Microsoft;

import java.util.Arrays;
import java.util.ArrayList;


public class MissingNumber
{

    public static void main(String args[])
    {
       int[] test = {4,2,1,6,3,7,9,10,12};
       int missing = 0;
       ArrayList missingNumbers = new ArrayList();

      // int[] test2 = new int[5];
       Arrays.sort(test);

       System.out.println("This is prior to Java8: "+Arrays.toString(test));

       //java 8 version:
       // Arrays.stream(test).forEach(System.out::print);
        for(int i=0; i<test.length-1;i++)
        {
            if( test[i+1]- test[i]>1)
            {
                missing = (test[i] + test[i + 1]) / 2;
                missingNumbers.add(missing);

            }

        }
        System.out.println("This is the list of missing numbers: "+ missingNumbers.toString());



    }

    //making the array assending or decending ; each of both is OK
    public void missingInteger(int[] input)
    {
        ArrayList<Integer> missingNumberList  = new ArrayList<>();

      //  System.out.println(myTest);
    }

}
