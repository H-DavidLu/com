package com.Zillow;

import java.lang.reflect.Array;
import java.util.*;

/*
 **How many ways can you represent an amount of money using $1,$5,$10, or $25.

 */
public class MoneySum
{
    public static void main(String args[])
    {
      int a=1, b=5,c=10, d=25;
      int[] test = {1,5,10,25};
      int sum = 0;

      LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();

      // four 4 elements
      linkedHashMap.put("[ " + a+" , "+ b+" , "+ c+ " , "+ d+" ]", a+b+c+d) ;
      sum=0;

      //for 2 elements
        for(int i =0; i<test.length-1; i++)
        {
            for (int j = i + 1; j < test.length; j++) {
                linkedHashMap.put("[ " + test[i] + ", " + test[j] + " ]", test[i] + test[j]);
            }
        }

        // for 3
        for(int i =0; i<test.length-2; i++)
        {
            for (int j = i + 1; j < test.length-1; j++)
            {
               // linkedHashMap.put("[ " + test[i] + ", " + test[j] + " ]", test[i] + test[j]);
                for(int k = j+1; k< test.length; k++)
                {
                    linkedHashMap.put("[ " + test[i] + ", " + test[j] + " , " + test[k] + " ]", test[i] + test[j] +test[k]);

                }
            }
        }

        ArrayList<Integer> arrayList =  new ArrayList<>();

        Set<Map.Entry<String, Integer>> enter = linkedHashMap.entrySet();

        for(Map.Entry<String, Integer> haha:enter)
        {
            arrayList.add(haha.getValue());

        }


        //sorting
       // System.out.println("The final list of the all combination: " + arrayList);

       // for each element
        for(int i = 0; i<test.length; i++)
        {
            linkedHashMap.put("[ "+String.valueOf(test[i])+ " ]", test[i] );
        }

        System.out.println("This is the hashmap list: " + linkedHashMap);
    }

}
