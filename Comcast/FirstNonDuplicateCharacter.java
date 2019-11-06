package com.Comcast;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonDuplicateCharacter
{
    public static void main(String args[])
    {
        String test = "cc";
        LinkedHashMap<String, Integer> linkedHashMap =  new LinkedHashMap<>();

        for(int i =0; i<test.length();i++)
        {
            if(linkedHashMap.isEmpty()) // linkedHashMap.get(String.valueOf(test.charAt(i))).equals(null))
                linkedHashMap.put(String.valueOf(test.charAt(i)), 1);
            else if (!linkedHashMap.containsKey(String.valueOf(test.charAt(i))))
            {
                linkedHashMap.put(String.valueOf(test.charAt(i)), 1);
            }
            else if(linkedHashMap.get(String.valueOf(test.charAt(i)))>=1)
                linkedHashMap.put(String.valueOf(test.charAt(i)), linkedHashMap.get(String.valueOf(test.charAt(i)))+1);
        }

        System.out.println(linkedHashMap);

        Set<Map.Entry<String, Integer>> occurances=linkedHashMap.entrySet();
        String index = "";

        for(Map.Entry entry:occurances ) {
            if(entry.getValue().equals(1))
         //  index = entry.getKey().toString();

            index+= entry.getKey().toString();
            if(!index.isEmpty())
                break;
        }

        System.out.println("The index string:" + index);

        for(int i= 0; i< test.length(); i++)
        {
            if(String.valueOf(test.charAt(i)).equals(index))
            {
                System.out.println(i);

            }
        }
    }
}
