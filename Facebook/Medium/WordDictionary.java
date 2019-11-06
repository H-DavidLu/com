package com.Facebook.Medium;
/*
https://leetcode.com/problems/add-and-search-word-data-structure-design/
Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a literal word or a
regular expression string containing only letters a-z or .. A . means it can represent any one letter.

Example:

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
 */

import java.util.ArrayList;

public class WordDictionary
{
    /** Initialize your data structure here. */
    ArrayList<String> arrayList =  new ArrayList<>();

    public WordDictionary() {

    }

    /** Adds a word into the data structure. */
    public void addWord(String word)
    {
        arrayList.add(word);
    }

    /** Returns if the word is in the data structure.
     *  A word could contain the dot character '.'
     *  to represent any one letter. */
    public boolean search(String word)
    {
        String wordOnly = word.replaceAll("[^a-zA-Z0-9]", ""); // remove all specific signs
        String signOnly = word.replaceAll("[a-zA-Z0-9]", " ");// remove all numeric numbers and signs
        int wordLength = wordOnly.length();
        int signLengt = signOnly.length();
        int wordAllLength = word.length();
        if(signLengt==wordAllLength)
        {
            return true;
        }
        else if(arrayList.contains(word))
        {
            return true;
        }
        else
        {

            for(int i= 0; i< arrayList.size() ; i++)
            {

                if(arrayList.get(i).contains(wordOnly))
                    return true;

            }

        }

        return false;
    }
    public static void main(String[] args) {

    }
}

/*
static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
        num = new StringBuffer(), special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
 */
/*
String number = s.replaceAll("[^a-zA-Z0-9]", ""); // remove all specific signs
String sign = s.replaceAll("[a-zA-Z0-9]", " ");// remove all numeric numbers and signs only
String[] numberStrings = number.split("[^\\w]+");
String[] signString = sign.trim().split("[\\s]+");
String[] part = str.split("(?<=\\D)(?=\\d)"); // split into characters and numbers
 */