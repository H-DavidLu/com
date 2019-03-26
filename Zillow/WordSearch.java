package com.Zillow;

/*
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */


public class WordSearch
{
    public static void main(String args[])
    {
      char[][] test = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
      int arrayLength = test.length;
      int rowLength = arrayLength;
      int columnLength = test[1].length;

      WordSearch wordSearch = new WordSearch();
      wordSearch.checkSearch(test, "ABCD", rowLength,columnLength);
    }

    void checkSearch(char[][] test, String targetString, int rowLength, int columnLength)
    {
        int p=0;

        for(int k=0; k<targetString.length();k++)
        {
            for (int i = 0; i < rowLength; i++)
            {
                for (int j = 0; j < columnLength; j++)
                {
                    if (test[i][j] == targetString.charAt(k))
                    {
                        gotoNext(i, j, test[i][j]);
                        p++;
                    }
                }
            }
        }
    }

    void gotoNext(int rowNumber, int columnNumber, char ch)
    {

    }
}
