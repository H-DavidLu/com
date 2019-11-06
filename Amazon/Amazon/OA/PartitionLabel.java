package com.Amazon.Amazon.OA;
/*
A string S of lowercase letters is given.
We want to partition this string into as many parts as possible so that each letter appears in at most one part,
 and return a list of integers representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabel
{

    public HashMap partitionLabels(String S)
    {
       // String S = "ababcbacadefegdehijhklij";
       // The partition is "ababcbaca", "defegde", "hijhklij".
        HashMap<Character, List> startAndEnd = new HashMap<>();
        ArrayList<Integer> positions =  new ArrayList<>();
        int start = 0,end = 0, temp=0;

        for(int i=0; i<S.length()-1;i++)
        {
               if(i!=0 && startAndEnd.containsKey(S.charAt(i)))
               {
                   continue;
               }
               else {
                   for (int p = i + 1; p < S.length(); p++) {
                       start=i;
                       if (S.charAt(i) == S.charAt(p)) {
                           end = p;
                       }

                   }
                   positions.add(start);
                   positions.add(end);
                   startAndEnd.put(S.charAt(i), positions);
               }
            }

       return startAndEnd;
    }

    public static void main(String[] args) {

        String S = "ababcbacadefegdehijhklij";
        PartitionLabel p =  new PartitionLabel();
        System.out.println(p.partitionLabels(S));



    }

}
