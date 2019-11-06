package com.Amazon.Medium;
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

import java.lang.reflect.Array;
import java.util.*;

public class PartitionLabel
{

    //public List<Integer> partitionLabels(String S) {
        public void partitionLabels(String S) {
        HashMap<Character,  int[]> hashMap =  new HashMap<>();
        ArrayList<Integer> arrayList =  new ArrayList<>();

        if(S.length()>500 || S.length()==0 || S==null) {
            int[] t3 = new int[2];
            t3[0]=0;
            t3[1]=0;
            hashMap.put('A', t3);
           // return hashMap ;
        }
        else //S = "ababcbacadefegdehijhklij"
        {
            char[] test = S.toCharArray();

            for(int i= 0; i< test.length ; i++)
            {

                if(hashMap.size()==0)
                {

                    int[] positions= new int[2];
                    positions[0]=i;
                   // positions[1]=0;
                    hashMap.put(S.charAt(i), positions);

                }
                else if(!hashMap.containsKey(S.charAt(i)) && hashMap.size()!=0 )
                {
                    int[] positions= new int[2];
                    positions[0]=i;
                   // positions[1]=0;
                    hashMap.put(S.charAt(i), positions);

                }
                else if(hashMap.containsKey((S.charAt(i))))
                {
                    int[] positions= hashMap.get(S.charAt(i));
                    positions[1]= i;
                    hashMap.put(S.charAt(i), positions);
                }
            }
        }

     getLists(hashMap);
    }

    private void getLists(HashMap hashMap )
    {
        int[][] partitions = new int[hashMap.size()][2];
        ArrayList<int[]> arrayList = new ArrayList<>();
        Set<Map.Entry<String, int[]>> lableMap = hashMap.entrySet();
        int start = 0, end = 0;
       for(Map.Entry<String, int[]>  entry: lableMap)
       {
           // add each value into the new  arraylist
           arrayList.add(entry.getValue());
           String t1 = String.valueOf(entry.getKey());
           String t2 = Arrays.toString(entry.getValue());
           System.out.println(t1+ " : " + t2);
       }

       for(int i= 0; i<arrayList.size() ; i++)
       {
           partitions[i] = arrayList.get(i);
       }


       // the comparison:
        for(int i= 0; i<arrayList.size()-1 ; i++)
        {
            for(int j= i+1; i<arrayList.size() ; i++)
            {
                //
            }
        }


    }

    public static void main(String[] args) {

        String S = "ababcbacadefegdehijhklij";
        PartitionLabel p =  new PartitionLabel();
        p.partitionLabels(S);



    }

}

/*
a : [0, 8]
b : [1, 5]
c : [4, 7]


d : [9, 14]
e : [10, 15]
f : [11, 0]
g : [13, 0]


h : [16, 19]
i : [17, 22]
j : [18, 23]
k : [20, 0]
l : [21, 0]
 */
