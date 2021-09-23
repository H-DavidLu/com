package com.Google;

import java.util.*;

public class FindFrequency {

    public static void main(String[] args) {
        int[] test = {1,2,3,3,3,3,4};
        int[] test2 = {1,2,3};

        FindFrequency findFrequency =  new FindFrequency();
        System.out.println("The most frequent number is: " + findFrequency.findFrequency(test));
    }

    public int findFrequency(int[] test){
        if(test.length==0 || test ==null){
            return 0;
        }

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i= 0; i<test.length ; i++)
        {
            if(i==0){
                frequency.put(test[i], 1);
            }
            if(frequency.containsValue(test[i])){
                frequency.put(test[i], frequency.get(test[i])+1);

            }

            if(!frequency.containsValue(test[i])){
                frequency.put(test[i], 1);
            }

        }

        System.out.println("The frequency list: " + frequency);

        ArrayList<Integer> value = new ArrayList<>();

        Set<Map.Entry<Integer, Integer>> contain = frequency.entrySet();
        for(Map.Entry entry:contain ){
           value.add((int)entry.getValue());
        }

        Arrays.sort(value.toArray());

        return (int)frequency.get((int)value.get(value.size()-2));

    }

}
