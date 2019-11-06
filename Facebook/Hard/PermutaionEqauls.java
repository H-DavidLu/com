package com.Facebook.Hard;
/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.



Example 1:

Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input:s1= "ab" s2 = "eidboaoo"
Output: False

 */

import java.util.*;

public class PermutaionEqauls
{
    public boolean checkInclusion(String s1, String s2) {

        Set<String> s = permutate(s1);
        int n = s.size();
        String[] arr = new String[n];
        arr =s.toArray(arr);
        System.out.println(Arrays.toString(arr));


        for(int i= 0; i<arr.length ; i++)
        {
            if(s2.contains(arr[i]))
                return true;
        }

        return false;

    }


    public Set<String> permutate(String s){
        Queue<String> permutations = new LinkedList<String>();
        Set<String> v = new HashSet<String>();
        permutations.add(s);

        while(permutations.size()!=0){
            String str = permutations.poll();
            if(!v.contains(str)){
                v.add(str);
                for(int i = 0;i<str.length();i++){
                    String c = String.valueOf(str.charAt(i));
                    permutations.add(str.substring(i+1) + c +  str.substring(0,i));
                }
            }
        }
        return v;
    }



    public static void main(String[] args) {

        PermutaionEqauls P = new PermutaionEqauls();
        String s1 = "ab",  s2 = "eidbaooo";
        System.out.println(P.checkInclusion(s1,s2));
    }

}
