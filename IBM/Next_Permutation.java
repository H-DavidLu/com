package com.IBM;
/*
Good morning! Here's your coding interview problem for today.

This problem was asked by IBM.

Given an integer, find the next permutation of it in absolute order.
 For example, given 48975, the next permutation would be 49578.
 */
import java.net.NetPermission;
import java.util.*;

public class Next_Permutation
{

    public int checkInclusion(int i1)
    {

        String s1 = String.valueOf(i1);
        Set<String> s = permutate(s1);
        int n = s.size();
        String[] arr = new String[n];
        int[] arrInteger = new int[arr.length];
        arr =s.toArray(arr);

        for(int i= 0; i<arrInteger.length; i++)
        {
            arrInteger[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(arrInteger);

        return 1;

    }

    public Set<String> permutate(String s)
    {
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

    public static void main(String[] args)
    {
        int il = 213;
        Next_Permutation N = new Next_Permutation();
        System.out.println(N.checkInclusion(il));
    }

}
