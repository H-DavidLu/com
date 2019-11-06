package com.Amazon;
/*
The i-th person has weight people[i], and each boat can carry a maximum weight of limit.

Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)



Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 */


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BoatsToSave {

    ArrayList arrayList = new ArrayList();
    int totalBoats = 0;


    public int numRescueBoats(@NotNull int[] people, int limit)
    {
       // ArrayList arrayList = new ArrayList();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int length= people.length;
        //int[] people = {3,5,3,4};
        //int[] people = {3,2,2,1}; limit = 3
        int flag = 0;
        for(int i= 0; i<length-1 ; i++)
        {
            for(int p= i+1; p<length ; p++)
            {
                flag=checkNums(i, p, length, people, limit); // the pivot case
                if(flag ==1)
                {

                }
                else if(flag==2) // pivot and startIndex together csae
                {

                }
            }
        }

        return hashMap.size();
    }

    int checkNums( int pivotIndex, int startIndex, int endIndex, int[] people, int limit)
    {
        //case 1: if two elements are equal to the limit
        if(people[pivotIndex] + people[startIndex]== limit )
        {
            arrayList.add("( "+ people[pivotIndex]+ ", " + people[startIndex]+ ")");
            totalBoats++;
            return 1;
        }
        else if(people[pivotIndex] + people[startIndex] > limit &&
                people[pivotIndex] < limit &&
                people[startIndex] < limit   )
        {
            arrayList.add(people[pivotIndex]);
            arrayList.add(people[startIndex]);
            totalBoats += 2;
            return 2;
        }

   return 0;
    }


    public static void main(String[] args) {

        int[] people = {3,5,3,4};
        int limit = 5;

        BoatsToSave b = new BoatsToSave();
        System.out.println(b.numRescueBoats(people,limit));

    }
}

/*
 if(p==length-1 && people[p]<limit)
                    hashMap.put(String.valueOf(people[p])+ ":" + p, 1);

                if(people[i]==limit)
                    hashMap.put(String.valueOf(people[i])+":"+i, 1);
                if(people[i]+people[p]== limit)
                {

                    hashMap.put(String.valueOf(people[i])+ ":" + i+ ", "  +String.valueOf(people[p])+": " +p, 1);
                }

                if(people[i]+people[p]> limit)
                {
                    hashMap.put(String.valueOf(people[i])+":" + i, 1);
                }

                if(people[i]+people[p]< limit)
                {
                    hashMap.put(String.valueOf(people[i])+":" + i, 1);
                }
 */
