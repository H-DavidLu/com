package com.Microsoft;

import java.util.ArrayList;

/*
Given a 2D matrix of characters and a target word,
write a function that returns whether the word can
be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
and the target word 'FOAM',
 you should return true, since it's the leftmost column. Similarly, given the target word 'MASS',
  you should return true, since it's the last row.
 */

public class WordsFinding
{
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String args[])
    {
      char[][] charLists = {{'F', 'A', 'C', 'I'},
                            {'O', 'B', 'Q', 'P'},
                            {'A', 'N', 'O', 'B'},
                            {'M', 'A', 'S', 'S'}};

      WordsFinding wordsFinding = new WordsFinding();
      wordsFinding.formLists(charLists);
      wordsFinding.doTheComparison(arrayList, "APPLE");

    }

    void doTheComparison(ArrayList arrayList, String string)
    {
        for(int i=0; i<arrayList.size();i++)
        {
            if(string.equals(arrayList.get(i)))
            {
                System.out.println("This is the stirng:" + string);
                break;
            }
                else
                    {
                System.out.println("NO.!");
                break;
            }
        }

    }

    void formLists(char[][] charLists)
    {
        int length = charLists.length;
        String wordForm = "";

        //1 .top to down list forms
        for(int k = 0;k<length;k++)
        {
            for (int i = 0; i < length; i++)
            {
                wordForm += String.valueOf(charLists[i][k]);
            }

            arrayList.add(wordForm);
            wordForm = "";
        }

        // 2: left to right
        for(int i=0; i<length;i++)
        {
            formList2(charLists[i]); // call the method to handle the left to right

        }

        System.out.println("This is the arraylist: " + arrayList);
    }

    void formList2(char[] test)
    {
        String leftToright = "";
        for(int i=0;i<test.length;i++)
        {
          leftToright+=String.valueOf(test[i]);

        }

        arrayList.add(leftToright);
        //leftToright;

    }
}
