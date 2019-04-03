package com.AirBnB;
/*
You are given a 2-d matrix where each cell represents number of coins in that cell.
Assuming we start at matrix[0][0], and can only move right or down, find the maximum number of coins
you can collect by the bottom right corner.

For example, in this matrix

0  3   1 1
2 100  0 4
1  5   3 1
The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.
 */

import com.Google.MaxNumberOfPoints;

public class MaxNumberOfCoinsIn2D
{

    public static void main(String args[])
    {

        int[][] matrix = {{0, 3, 1, 1}, {2, 0 ,0 ,4}, {1, 5 ,3 ,1}};
        //{{0, 3, 1, 1},
        // {2, 0 ,0 ,4},
        // {1, 5 ,3 ,1}}
        /*
                           1
                          1 1
                         1 2 1
                        1 3 3 1
                       1 4 6 4 1
         */
        int lenght = matrix.length;
        int numberOfColumn = matrix[0].length;
        System.out.println( "this is the length: " +  lenght);
        MaxNumberOfCoinsIn2D maxNumberOfCoinsIn2D =  new MaxNumberOfCoinsIn2D();
        maxNumberOfCoinsIn2D.getCoins(matrix, lenght, numberOfColumn );

    }

    int getCoins(int[][] matrix, int lengthRows,int lengthColumn) {

        int sumOfCoins = 0;
        int startFromColumn = 0;
        int startFromRow = 0;

        while (startFromColumn < lengthColumn || startFromRow < lengthRows) {

            if (matrix[startFromRow + 1][startFromColumn] > matrix[startFromRow][startFromColumn + 1]) {
                sumOfCoins += matrix[startFromRow + 1][startFromColumn];
                startFromRow++;
            }
            else {
                sumOfCoins += matrix[startFromRow][startFromColumn + 1];
                startFromColumn++;
            }

        }

        //{{0, 3, 1, 1},
        // {2, 0 ,0 ,4},
        // {1, 5 ,3 ,1}}
        return sumOfCoins;
    }
}
