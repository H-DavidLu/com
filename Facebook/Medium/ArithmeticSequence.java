package com.Facebook.Medium;

import java.util.*;

/*
Done: not yet

https://leetcode.com/problems/longest-arithmetic-sequence/
Given an array A of integers, return the length of the longest arithmetic subsequence in A.

Recall that a subsequence of A is a list A[i_1], A[i_2], ..., A[i_k]
 with 0 <= i_1 < i_2 < ... < i_k <= A.length - 1, and that a sequence B is arithmetic if B[i+1] - B[i]
 are all the same value (for 0 <= i < B.length - 1).



Example 1:

Input: [3,6,9,12]
Output: 4
Explanation:
The whole array is an arithmetic sequence with steps of length = 3.
Example 2:

Input: [9,4,7,2,10]
Output: 3
Explanation:
The longest arithmetic subsequence is [4,7,10].
Example 3:

Input: [20,1,15,3,10,5,8]
Output: 4
Explanation:
The longest arithmetic subsequence is [20,15,10,5].
 */
public class ArithmeticSequence
{

    public static void main(String[] args) {

        int[] A={20,1,15,3,10,5,8};
        ArithmeticSequence Ar = new ArithmeticSequence();
        System.out.println(Ar.longestArithSeqLength(A));
    }

    public int longestArithSeqLength(int[] A)
    {
        int length = A.length;
        Arrays.sort(A);
        int[] sequenceSum =new int[length-1];
        ArrayList<Integer> arrayList =  new ArrayList<>();
        HashMap<Integer, Integer> seq =  new HashMap<>();
        for(int i= 0; i<length-1 ; i++)
        {
           if(seq==null || seq.isEmpty())
           {
               seq.put(A[i+1]-A[i], 1);

           }
           else if(seq.containsKey(A[i+1]-A[i]))
           {
               seq.put(A[i+1]-A[i], seq.get((A[i+1]-A[i]))+1);
           }
           else if(seq!=null && !seq.containsKey(A[i+1]-A[i]))
           {
               seq.put(A[i+1]-A[i], 1);
           }
        }

        System.out.println(seq);

        Set<Map.Entry<Integer,Integer>> set = seq.entrySet();
        ArrayList<Integer> seqSumArray = new ArrayList<>();
        for(Map.Entry<Integer, Integer> sum:set )
        {
            seqSumArray.add(sum.getKey());
        }

        int[] toArray = new int[seqSumArray.size()];
        for(int i= 0; i<toArray.length ; i++)
        {
            toArray[i]= seqSumArray.get(i);
        }

        Arrays.sort(toArray);
        int toArraylength = toArray.length;
        return toArray[toArraylength-1];
    }
}
