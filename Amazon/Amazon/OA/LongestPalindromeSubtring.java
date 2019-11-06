package com.Amazon.Amazon.OA;
/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */


import java.util.*;

public class LongestPalindromeSubtring
{

    public static boolean checkPalindrome(String str) // string check
    {
        if(str.length()==1)
            return true;
        else if(str.length()==2)
        {
            if (str.charAt(0) == str.charAt(1))
                return true;
            else
                return false;
        }
        else if(str.length()%2==0)
        {
            if(checkEven(str) == true)
                return true;
            else
                return false;
        }
        else if(str.length()%2!=0)
        {
            if(checkOdd(str)== true)
                return true;
            else
                return false;
        }

        return false;
    }

    public static boolean checkOdd(String oddString)
    {
        int p=0;
        int counter=0;

        for(int i=0;i<oddString.length()/2;i++)
        {
            String a = String.valueOf(oddString.charAt(i));
            String t2 = String .valueOf(oddString.charAt(oddString.length()-1-p));

            if(a.equals(t2))
                p++;
            else {
                counter++;
                break;
            }
        }

        if(counter>0)
            return false;
        else {
          //  System.out.println("this is a palindrome.");
            return true;
        }
    }

    private static boolean checkEven(String evenString)
    {
        int p=0;
        int counter=0;

        for(int i=0;i<evenString.length()/2;i++)
        {
            String a = String.valueOf(evenString.charAt(i));
            String t2 = String .valueOf(evenString.charAt(evenString.length()-1-p));

            if(a.equals(t2))
                p++;
            else {
                counter++;
                break;
            }
        }

        if(counter>0)

            return false;
        else
            return true;
    }

    public static void main(String[] args)
    {
        String str = "cbbd";
        ArrayList<String> arrayList =  new ArrayList<>();
       // int [] tset = (Integer)arrayList.toArray();
        HashMap<String, Integer> hashMap =  new HashMap<>();
        //System.out.println(checkPalindrome(str));

        for(int i = 0; i<str.length()-1;i++)
        {
            for (int k = i+1; k<str.length();k++)
            {
                if(checkPalindrome(str.substring(i, k+1))== true)
                {

                    arrayList.add(str.substring(i, k+1));
                    hashMap.put(str.substring(i, k+1), str.substring(i, k+1).length());
                }

            }
        }

        int[] lengthArray = new int[hashMap.size()];
        ArrayList<Integer>  u = new ArrayList<>();
        Set<Map.Entry<String, Integer>> container = hashMap.entrySet();
        for(Map.Entry entry:container)
        {
              u.add((Integer) entry.getValue());
        }

        for(int i= 0; i< u.size() ; i++)
        {
            lengthArray[i] = u.get(i);
        }
        Arrays.sort(lengthArray);
        int lengthA = lengthArray.length;

        Set<Map.Entry<String, Integer>> containerFinal = hashMap.entrySet();
        for(Map.Entry entry:containerFinal)
        {
            if(entry.getValue().equals(lengthArray[lengthA-1]))
            {
                System.out.println(entry.getKey());
            }
        }

    }



}
