package com.Zuily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianTwoArrays
{

    double median = 0.0;

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> after = new ArrayList<>();

        if(nums1.length==0 && nums2.length!=0)
            median= returnMedian(nums2);
        else if (nums2.length==0 && nums1.length!=0)
            median=returnMedian(nums1);
        else if (nums2.length==0 && nums1.length==0)
            return -1.00;
        else {

            for(int u=0; u<nums1.length;u++)
            {
                after.add(nums1[u]);
            }
            for(int u=0; u<nums2.length;u++)
            {
                after.add(nums2[u]);

            }

            int[] afterList = new int[after.size()];

            for(int u=0; u<afterList.length;u++)
            {
                afterList[u] = after.get(u);
            }

            Arrays.sort(afterList);

            returnMedian(afterList);

        }

        return median;
    }

    public double returnMedian(int[] afterSorted)
    {
        if(afterSorted.length==1)
            return afterSorted[0];
        else {
            if (afterSorted.length % 2 == 0) {
                double m1 = afterSorted[(afterSorted.length / 2) - 1];
                double m2 = afterSorted[afterSorted.length / 2];
                median = (m1 + m2) / 2;
            } else {
                median = afterSorted[(int) (afterSorted.length / 2) ];
            }

            return median;
        }

    }

    public static void main(String args[])
    {
        int[] a = {};
        int[] b = {1};
        MedianTwoArrays m =  new MedianTwoArrays();
        System.out.println(m.findMedianSortedArrays(a, b));

    }

}
