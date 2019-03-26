package com.Zillow;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter
{
    LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

    public static void main(String args[])
    {
      String test = "eetcoodee";

      FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
      firstUniqueCharacter.checkFirstMap(test);

    }

    void checkFirstMap(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            // int counter =1;
            if (linkedHashMap.containsKey(string.charAt(i)))
            {

                linkedHashMap.put(string.charAt(i), linkedHashMap.get(string.charAt(i))+1);
            }
            else
                linkedHashMap.put(string.charAt(i), 1);

        }

        System.out.println("This is the hashmap: " + linkedHashMap);

        Set<Map.Entry<Character,Integer>> enter = linkedHashMap.entrySet();
        char first = ' ';
        for(Map.Entry<Character,Integer> inter: enter)
        {
            if(inter.getValue()==1) {
                first=inter.getKey();
                break;
            }
        }

        for(int u = 0; u< string.length(); u++)
        {
            if(String.valueOf(string.charAt(u)).equals(String.valueOf(first))
            )                System.out.println("The index of the first unique character of this array is: " + u);
        }
    }
}

