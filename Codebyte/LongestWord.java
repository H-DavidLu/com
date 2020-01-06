package com.Codebyte;

import java.util.Arrays;

public class LongestWord
{
    public static String LongestWord(String sen)
    {

        String afterSplited = sen.replaceAll("[^a-zA-Z0-9]", " "); // remove all specific signs
        String[] words = afterSplited.split("[^\\w]+"); //
        int[] wordsLength = new int[words.length];
        String finalWorld = "";

        for(int p=0; p<wordsLength.length;p++)
        {
            wordsLength[p] = words[p].length();

        }

        Arrays.sort(wordsLength);

        for(int i=0; i<words.length; i++)
        {
            if(words[i].length()== wordsLength[words.length-1]) {
                finalWorld = words[i];
                break;
            }


        }

        return finalWorld;


    }

    public static void main(String[] args) {
        String test = "I love you#$#%";
      //  LongestWord longestWord = new LongestWord();
        System.out.println(LongestWord(test));

    }

}
