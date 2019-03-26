package com.Comcast;

import java.util.HashMap;

public class FirstNonDuplicateCharacter
{
    public static void main(String args[])
    {
        String test = "aabbcde";
        HashMap<String, Integer> linkedHashMap =  new HashMap<>();

        for(int i =0; i<test.length();i++)
        {
            if(linkedHashMap.size()==0 || linkedHashMap.get(String.valueOf(test.charAt(i))).equals(null))
                linkedHashMap.put(String.valueOf(test.charAt(i)), 1);
            else
                linkedHashMap.put(String.valueOf(test.charAt(i)), linkedHashMap.get(test.charAt(i))+1);
        }

        System.out.println(linkedHashMap);
    }
}
