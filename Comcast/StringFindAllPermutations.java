package com.Comcast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class StringFindAllPermutations {

    // this is for the ONE String program
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    // this is for the INTEGER array--> permutation
    public static List<List<Integer>> permutationFinder(int[] nums) {

        List<List<Integer>> perm2 = new ArrayList<>();
        //Handling error scenarios
        if (nums == null || nums.length ==0){
            return perm2;

        }

        dfs(perm2, new ArrayList<>(), 0, nums);

        return perm2;

    }

    private static void dfs(List<List<Integer>> res, List<Integer> list, int pos, int[] nums) {
        res.add(new ArrayList<Integer>(list));
        if(pos==nums.length+1) return;
        for(int i=pos; i<nums.length; i++) {
            list.add(nums[i]);
            dfs(res, list, i+1, nums);
           // list.remove(list.size()-1);
        }
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "AAC";
        String s1 = "ABC";
        int[] s2 = {1, 2, 3};
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }
}