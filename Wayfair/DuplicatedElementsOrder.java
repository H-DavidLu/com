package com.Wayfair;
/*
    1. Given an array of duplicate elements, remove duplicates, maintain order of elements.

    Hints: this can be applied with LinkedHashMap intead of HashMap: LinkedHashMap can keep the insertiong order

 */

import java.util.*;

public class DuplicatedElementsOrder
{
    LinkedHashMap<Integer, Integer> frequency = new LinkedHashMap<>();

    public static void main(String args[])
    {
        DuplicatedElementsOrder duplicatedElementsOrder = new DuplicatedElementsOrder();

        int[] test = {5,5,1,3,3,4,4,4};
        int length = test.length;
        for(int i =0; i<length; i++)
        {
            if(duplicatedElementsOrder.frequency.containsKey(test[i]) == false || duplicatedElementsOrder.frequency.size() ==0)
            {
                duplicatedElementsOrder.frequency.put(test[i], 1);
            }
            else
            {
                duplicatedElementsOrder.frequency.put(test[i], (duplicatedElementsOrder.frequency.get(test[i]))+1 );
            }
        }

        System.out.println("The hashmap of frequency for this array is: looking like it is ordered" + duplicatedElementsOrder.frequency);

        Set<Map.Entry<Integer, Integer>> mapSet = duplicatedElementsOrder.frequency.entrySet();
        for(Map.Entry myList: mapSet)
        {
            System.out.print(myList.getKey()+ " ");
        }
    }


}
