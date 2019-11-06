package com.Amazon.Easy;
/*
Given a non-empty integer unsorted array and find the nth smallest element

1 6 3 9 8 5
 */

import java.util.Arrays;

public class NSmallestElement {

    public static void main(String[] args) {

        int[] test = {1, 6, 3, 9, 8, 5};
        int n = 1;
        NSmallestElement N = new NSmallestElement();
        System.out.println(N.checkNth(test,n) );
    }

    private int checkNth(int[] test, int n)
    {
        Arrays.sort(test);


        return test[n-1];
    }
}
