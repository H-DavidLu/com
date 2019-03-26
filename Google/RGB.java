package com.Google;

import java.util.Arrays;
import java.util.HashMap;

/*
This problem was asked by com.Google.

        Given an array of strictly the characters 'R', 'G', and 'B',
        segregate the values of the array so that all the Rs come first,
        the Gs come second, and the Bs come last. You can only swap elements of the array.

        Do this in linear time and in-place.

        For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'],
        it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

*/
public class RGB
{


    public static void main(String args[])
    {
         char[] rgbArray = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
         RGB rgb = new RGB();

         rgb.getSorted(rgbArray);
    }

    HashMap<Character, Integer> hashMap = new HashMap<>();
      void getSorted(char[] test)
      {
         // HashMap<Character, Integer> hashMap = new HashMap<>();
          //hashMap.put('R',1);
          //hashMap.put('B',1);
          //hashMap.put('G',1);

          int length = test.length;

          for(int i=0;i<length;i++)
          {
              if(hashMap.size()==0 || hashMap.get(test[i]) == null)
              {
                  hashMap.put(test[i],1);
              }
              else
              {
                  hashMap.put(test[i],hashMap.get(test[i]) +1);
              }


             // hashMap.put(test[i], hashMap.get(test[i])+1 );
          }

          System.out.println("This is the  original array of characters: " + Arrays.toString(test));
          System.out.println("This is the container of character of RBG array: "+hashMap );

          reArrange(hashMap, test.length);
      }

      void reArrange(HashMap sortedHashMap, int a )
      {
             //int length = sortedHashMap.size();
             char[] afterSorted = new char[a];
             int r = (int)sortedHashMap.get('R');
             int b = (int)sortedHashMap.get('B');
             int g = (int)sortedHashMap.get('G');
              // r = 4; b= 3, g= 3

             for(int i = 0; i<r;i++)
             {
                 afterSorted[i] = 'R';

             }

            for(int j = r; j<r+b;j++)
            {
                afterSorted[j] = 'B';
            }

            for(int k = r+g; k<a;k++)
            {
                afterSorted[k] = 'G';

            }

            System.out.println("This is the aftersorted with RBG: " + Arrays.toString(afterSorted) );

      }
}


