package com.Amazon.Medium;

import java.lang.reflect.Array;
import java.util.*;

/*
Given an non-empty integer array with k value. return k most frequent element

 */
public class MostFrequentElements
{

    public static void main(String[] args) {
        int[] test ={1,1,1,2,2,2,3,3,3};
        MostFrequentElements M = new MostFrequentElements();
        System.out.println(M.mostFrequent(test, 3));
    }

    private List<Integer> mostFrequent(int[] test, int k) {
        if (test.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < test.length; i++) {
            if (hashMap.size() == 0) {
                hashMap.put(test[i], 1);
            } else if (hashMap.size() != 0 && !hashMap.containsKey(test[i])) {
                hashMap.put(test[i], 1);
            } else if (hashMap.size() != 0 && hashMap.containsKey(test[i])) {
                hashMap.put(test[i], hashMap.get(test[i]) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> finalSet : set) {
            arrayList.add(finalSet.getValue());
        }

        Collections.sort(arrayList, Collections.reverseOrder());
        int[] elementReorder = new int[arrayList.size()];
        for (int i = 0; i < elementReorder.length; i++) {
            elementReorder[i] = arrayList.get(i);
        }

        // test if equals
        int flag = 1;
        for (int i = 0; i < elementReorder.length - 1; i++) {
            if (elementReorder[i] == elementReorder[i + 1])
                flag++;
        }

        if (flag==k)
        {

            ArrayList<Integer> arrayList1 =  new ArrayList<>();
            arrayList1.add(-100000000);
            return arrayList1;
        }
        else {
            // for latter work
            ArrayList<Integer> elementHere = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                elementHere.add(elementReorder[i]);
            }

            ArrayList<Integer> finalList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> finalSet : set) {

                if (elementHere.contains(finalSet.getValue()))
                    finalList.add(finalSet.getKey());
            }
            return finalList;
        }
    }
}
