package com.Uber;
/*
Given a paragraph and a list of banned words,
return the most frequent word that is not in the list of banned words.
 It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

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

import java.util.Arrays;
import java.util.HashMap;

public class BannedWords
{

    public static void main(String args[])
    {
            String test ="Bob hit a ball, the hit BALL flew far after it was hit.";
            String firstTest = test.replaceAll("[^a-zA-Z0-9]", " "); // remove all special signs
            String[] afterIgnoreCapitals = firstTest.toLowerCase().split(" ");
            //text.replaceAll("[^a-zA-Z0-9]", ""
            HashMap<String, Integer> containers = new HashMap<>();
            for(int i= 0; i<afterIgnoreCapitals.length ; i++)
            {
                if(containers.size()==0 )
                {
                   containers.put(afterIgnoreCapitals[i], 1);
                }
                else if( containers.size()!=0  &&
                        (!afterIgnoreCapitals[i].equals(containers.containsKey(afterIgnoreCapitals[i])))
                        )
                {
                    containers.put(afterIgnoreCapitals[i], 1);
                }
                else if( (containers.size()!=0) && afterIgnoreCapitals[i].equals(containers.containsKey(afterIgnoreCapitals[i]))) // stream
                {
                    containers.put(afterIgnoreCapitals[i], containers.get(afterIgnoreCapitals[i])+1);
                }
            }

        System.out.println(Arrays.toString(afterIgnoreCapitals));
        System.out.println(containers);
    }
}
