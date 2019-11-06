package com.Amazon.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {

    ArrayList<Integer> addArray =  new ArrayList<>();

    public MedianFinder() {

    }

    public void addNum(int num) {

        if(addArray.size()==0)
        {
            addArray.add(num);
        }
        else if(addArray.size()==1)
        {
            addArray.add(num);
            findMedian();


        }
        else if(addArray.size()>1)
        {
            addArray.add(num);
            findMedian();

        }

    }

    public double findMedian()
    {
        int[] test = new int[addArray.size()];

        for(int i= 0; i<test.length ; i++)
        {
            test[i]= (Integer)addArray.get(i);
        }

        Arrays.sort(test);
        if(test.length%2==0)
        {
            int evenLengthHalf = test.length/2;

            if(test.length==2)
            {
                return (test[0]+test[1])/2 ;
            }
            else if(test.length>2)
            {
                return (test[evenLengthHalf] + test[evenLengthHalf-1])/2 ;
            }

        }
        else
        {
            int oddLengthHalf = (int)test.length/2;
            return test[oddLengthHalf];
        }

        return 0.0;

    }

    public static void main(String[] args) {

       MedianFinder M= new MedianFinder();
       M.addNum(3);
       //M.addNum(6);

       System.out.println(M.findMedian());


    }
}
