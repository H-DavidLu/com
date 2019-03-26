package com.Zuily;

import java.util.Arrays;
import java.util.Collections;

public class MedianTwoArrays
{
    public static void main(String args[])
    {
        int[] a = {2,4,6,8,10};
        int[] b = {1,3,5,7};

        int[] conbimedArray = new int[10];
        int[] afterSorted = new int[a.length+a.length];
        
        System.out.println(Arrays.toString(conbimedArray));

        conbimedArray = Arrays.copyOf(a, 10)         ;
        for(int i = 0; i<b.length  ;i++)
        {
           conbimedArray[a.length+i]=b[i];
        }

        Arrays.sort(conbimedArray);

        for(int i =0; i<afterSorted.length;i++)
        {
            afterSorted[i]=conbimedArray[i];
        }

        if(afterSorted.length%2 == 0)
        {
            double media = 0;
            double m1= afterSorted[(afterSorted.length/2)-1 ] ;
            double m2 = afterSorted[afterSorted.length/2];
            media = (m1+m2)/2 ;
            System.out.println(media);
        }
        else
        {
            double median = afterSorted[(int)(afterSorted.length/2) +1];
            System.out.println(median);
        }
       System.out.println(Arrays.toString(afterSorted));
    }

}
