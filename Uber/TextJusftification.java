package com.Uber;

/*
Given an array of words and a width maxWidth, format the text such that each line has exactly
maxWidth characters and is fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. P
ad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.

Extra spaces between words should be distributed as evenly as possible. I
f the number of spaces on a line do not divide evenly between words,
 the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left justified and no extra space is inserted between words.

Note:

A word is defined as a character sequence consisting of non-space characters only.
Each word's length is guaranteed to be greater tha
n 0 and not exceed maxWidth.
The input array words contains at least one word.
Example 1:

Input:
words = ["This", "is", "an", "example", "of", "text", "justification."]
maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
Example 2:

Input:
words = ["What","must","be","acknowledgment","shall","be"]
maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be",
             because the last line must be left-justified instead of fully-justified.
             Note that the second line is also left-justified becase it contains only one word.
Example 3:

Input:
words = ["Science","is","what","we","understand","well","enough","to","explain",
         "to","a","computer.","Art","is","everything","else","we","do"]
maxWidth = 20
Output:
[
  "Science  is  what we",
  "understand      well",
  "enough to explain to",
  "a  computer.  Art is",
  "everything  else  we",
  "do                  "
]


 */


import java.util.ArrayList;
import java.util.HashMap;

public class TextJusftification
{

    public static void main(String args[])
    {
        // test case 1:
        //String[] test = {"What","must","be","acknowledgment","shall","be"};
        //int maxLength = 16;

        // test case 2:
        String[] test = {"Science","is","what","we","understand","well","enough","to","explain",
            "to","a","computer.","Art","is","everything","else","we","do"};
        int maxLength = 20;

        TextJusftification textJusftification = new TextJusftification();
        textJusftification.getEachLine(test, maxLength);
    }

    ArrayList<String> arrayList = new ArrayList<>();

    void getEachLine (String[] test, int maxLength)
    {
        int initialLength = test.length;
        //String[][] stringContainer = new String[][];
        String newTextElement = "";
        int afterMaxLength = maxLength;
        HashMap<String, Integer> newStringContainer = new HashMap<>();

        for(int i =0; i<initialLength; i++ )
        {
            if(test[i].length()  <afterMaxLength)  // how about == 16?
            {
                afterMaxLength=afterMaxLength-test[i].length()-1;

                if(i== initialLength-1)
                {
                    newTextElement += test[i];
                    arrayList.add(newTextElement);

                }
                else if(test[i+1].length()< afterMaxLength)
                    newTextElement+= test[i]+" ";
                else
                    newTextElement+= test[i];
            }
            else
            {
                arrayList.add(newTextElement);
                newTextElement="";
                initialLength=test.length;
                afterMaxLength = maxLength;
            }
        }

        for(int i = 0; i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i) + ": length as: " + arrayList.get(i).length());

        }

        for(int j = 0; j< arrayList.size();j++)
        {
            adJustText(arrayList.get(j), maxLength);

        }
    }

    ArrayList<String> afterAdJusted = new ArrayList<>();

    void adJustText(String afterPassing, int maxLength)
    {
      // case 1:  if only one string  then left adjusting
      if(!afterPassing.contains(" ") && afterPassing.length()< maxLength)
      {
          int numberOfSpace = maxLength-afterPassing.length();
          int lengthOfString = afterPassing.length();
          for(int i =lengthOfString;i<= numberOfSpace ; i++ )// if there are spaces then appending the spaces after the string
          {
                afterPassing+=afterPassing+" ";
          }

          afterAdJusted.add(afterPassing);
      }
      else if(afterPassing.contains(" "))  //  if there are two or more strings in one line then try to add spaces evenly
      {


      }


    }
}
