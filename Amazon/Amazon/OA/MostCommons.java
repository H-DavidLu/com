package com.Amazon.Amazon.OA;
/*
passed!

https://leetcode.com/problems/most-common-word/submissions/
Given a paragraph and a list of banned words, return the most frequent word
 that is not in the list of banned words.  It is guaranteed there is at least
 one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.
 Words in the paragraph are not case sensitive.  The answer is in lowercase.



Example:

Input:
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"),
and that "hit" isn't the answer even though it occurs more because it is banned.
 */

import java.util.*;

public class MostCommons {

    String string="";

    public String mostCommonWord(String paragraph, String[] banned)
    {
        String pa = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]", " "); // remove all specific signs
        String[] wordStrings = pa.trim().split("[\\s]+");

        String bannedStringTogether = "";
        for(int i= 0; i<banned.length ; i++)
        {
            bannedStringTogether+=banned[i];
        }

        ArrayList<String> nonBanned = new ArrayList<String>();
        HashMap<String, Integer> nonBanndedMap =  new HashMap<>();

        for(int p=0; p<wordStrings.length; p++  )
        {
            if(!bannedStringTogether.contains(wordStrings[p]))
            {
                nonBanned.add(wordStrings[p]);  // add to the arraylist
                if(nonBanndedMap.size() ==0)
                {
                    nonBanndedMap.put(wordStrings[p], 1);

                }
                else if(nonBanndedMap.size() !=0 && !nonBanndedMap.containsKey(wordStrings[p]))
                {
                    nonBanndedMap.put(wordStrings[p], 1);
                }
                else
                {
                    nonBanndedMap.put(wordStrings[p], nonBanndedMap.get(wordStrings[p])+1);
                }
            }
        }

        ArrayList<Integer> arrayList =  new ArrayList<>();
        Set<Map.Entry<String, Integer>> nonSet = nonBanndedMap.entrySet();
        for(Map.Entry entry:nonSet)
        {
            arrayList.add((Integer) entry.getValue());
        }

        int[] afterArray = new int[arrayList.size()];

        for(int i= 0; i<arrayList.size(); i++)
        {
            afterArray[i]= arrayList.get(i);
        }
        Arrays.sort(afterArray);

        for(Map.Entry entry:nonSet)
        {
            if(entry.getValue().equals(afterArray[afterArray.length-1]))
            {
                string=(String)entry.getKey();

            }
        }
        return string;
    }

    public static void main(String args[])
    {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        MostCommons m= new MostCommons();
        System.out.println(m.mostCommonWord(paragraph,banned));

    }
}
