package com.YouTube;
/*
Given a 01 matrix M, find the longest line of consecutive one in the matrix. The line could be horizontal, vertical, diagonal or anti-diagonal.
Example:
Input:
[[0,1,1,0],
 [0,1,1,0],
 [0,0,0,1]]
Output: 3
 */

import java.util.ArrayList;

public class Matrix0s
{

    ArrayList<String> onesContainer = new ArrayList<>();

    int rightAndLeft=0,upAndDown=0,dignonalAndDignonal=0;
    public static void main(String args[])
    {

        int[][] test = {{0,1,1,0},{0,1,1,0},{0,0,0,1}};
        int rowLength = test.length;
        int columnLength = test[0].length;
        int intialIsOne = 0;
        Matrix0s matrix0s =  new Matrix0s();
        for(int i= 0; i<rowLength ; i++)
        {
            for(int j= 0; j<columnLength ; j++)
            {
                if(test[i][j] ==1) {
                    matrix0s.calculate(i, j, columnLength, rowLength, test);
                }
            }
        }


    }

    void calculate(int row, int column, int  columnLength, int rowLength, int[][] test)
    {
/*
[[0,1,1,0],
 [0,1,1,0],
 [0,0,0,1]]
 */


        int initail=1,  right=0, left=0, up=0, down=0, diggonalUp=0, diggonalDown=0,  antidignonalUp=0, antidignonalDown=0;
        //start to calculate the max

        //1: to right
        for(int i =column; i< columnLength; i++)
        {
            if(test[row][i+1] ==1)
                right++;
        }

        //2: to left
        for(int i= column; i>=0 ; i--)
        {
              if(test[row][i-1]==1)
                  left++;
        }

        // 3:  to down
        for(int i= row ; i<rowLength ; i++)
        {
            if(test[i+1][column]==1)
                down++;
        }

        // 4:  to up
        for(int i= row; i>=0 ; i--)
        {
            if(test[i-1][column]==1)
                up++;
        }

        /*========================================================================================================  */
        // 5: for diaganal and antidiagol

        if(rowLength<columnLength)  // based on rowLength
        {
            for (int i = row; i<rowLength ; i++)
            {
               if(test[row-1][column-1] ==1)
                   diggonalUp++;
            }
        }
        else
        {
            for (int i = column; i<columnLength ; i++)
            {
               // if(test[column+1][colum+1] ==1)
                    diggonalUp++;
            }
        }













    }
}
