package com.Nordstrom;
/*

 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KthNonRepeatingCharacter
{

    public static void main(String args[])
    {

        String test  = "abcddefggh";
        int k = 3;
        KthNonRepeatingCharacter kthNonRepeatingCharacter =  new KthNonRepeatingCharacter();
        System.out.println("The non repeating characters in the string after the conversion: " +
                kthNonRepeatingCharacter.removeDuplicates(test, k) );
    }


    String removeDuplicates(String test, int kthNonDuplicated)
    {
        LinkedHashMap<String, Integer> container = new LinkedHashMap<>();
        String unplicatedString = "";

        for(int i =0; i<test.length();i++)
        {
            if(container.size()==0 ||  !container.containsKey(String.valueOf(test.charAt(i))))   //get(String.valueOf(test.charAt(i))))
                container.put(String.valueOf(test.charAt(i)), 1);
            else
                container.put(String.valueOf(test.charAt(i)), container.get(String.valueOf(test.charAt(i)))+1);
        }

        Set<Map.Entry<String,Integer>> unduplicated = container.entrySet();
        String fetchUnduplicated ="";
        for(Map.Entry<String, Integer> entry: unduplicated ) {
            if(entry.getValue().equals( (Integer)(1)))
                fetchUnduplicated+= entry.getKey();

        }

        System.out.println("The undupicated character as a new string: " + fetchUnduplicated );
        return String.valueOf(fetchUnduplicated.charAt(kthNonDuplicated-1));
    }

}


