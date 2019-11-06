package com.DailyCoding.Twitter;
/*

NOT YET DONE!
Good morning! Here's your coding interview problem for today.

This problem was asked by Twitter.

A permutation can be specified by an array P,
where P[i] represents the location of the element
at i in the permutation. For example, [2, 1, 0] represents the permutation where elements
at the index 0 and 2 are swapped.

Given an array and a permutation, apply the permutation to the array. For example,
given the array ["a", "b", "c"] and the permutation [2, 1, 0], return ["c", "b", "a"].
 */

import java.util.Arrays;

public class Twitter_Permutation {

    private String[] toCheckArray(String[] test, int[] positions)
    {
        String testString = test.toString();
        String[] afterStrings = new String[positions.length];

        for(int i= 0; i<positions.length; i++)
        {
            if(positions[i] == 1)
            {

            }
        }

        return afterStrings;

    }

    public static void main(String[] args) {

        String[] test = {"a", "b", "c"};
        int[] positions = {2, 1, 0};
        Twitter_Permutation T =  new Twitter_Permutation();

        System.out.println(Arrays.toString(T.toCheckArray(test, positions)));
    }
}
