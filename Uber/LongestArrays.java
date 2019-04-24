package com.Uber;

/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,

Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4].
Return its length: 4.

Your algorithm should run in O(n) complexity.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class LongestArrays {

    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] test = {100, 4, 200, 1, 3, 2};
        int[] newTest = new int[test.length];

        Arrays.sort(test);
        newTest = test.clone();

        for (int i = 0; i < newTest.length - 1; i++) {
            if (newTest[i + 1] - newTest[i] == 1) {
                arrayList.add(newTest[i]);
                arrayList.add(newTest[i + 1]);
            } else
                break;
        }

        TreeSet<Integer> finalSet = new TreeSet<>();
        for(int i= 0; i<arrayList.size() ; i++)
        {
            finalSet.add(arrayList.get(i));
        }

        System.out.println("this is the container: " + finalSet);
    }
}