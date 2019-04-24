package com.Uber;
/*
In a N x N grid representing a field of cherries, each cell is one of three possible integers.

0 means the cell is empty, so you can pass through;
1 means the cell contains a cherry, that you can pick up and pass through;
-1 means the cell contains a thorn that blocks your way.

Your task is to collect maximum number of cherries possible by following the rules below:


Starting at the position (0, 0) and reaching (N-1, N-1) by moving right or down through valid path cells (cells with value 0 or 1);
After reaching (N-1, N-1), returning to (0, 0) by moving left or up through valid path cells;
When passing through a path cell containing a cherry, you pick it up and the cell becomes an empty cell (0);
If there is no valid path between (0, 0) and (N-1, N-1), then no cherries can be collected.


Example 1:

Input: grid =
[[0, 1, -1],
 [1, 0, -1],
 [1, 1,  1]]

Output: 5
Explanation:
The player started at (0, 0) and went down, down, right right to reach (2, 2).
4 cherries were picked up during this single trip, and the matrix becomes [[0,1,-1],[0,0,-1],[0,0,0]].
Then, the player went left, up, up, left to return home, picking up one more cherry.
The total number of cherries picked up is 5, and this is the maximum possible.


Note:

grid is an N by N 2D array, with 1 <= N <= 50.
Each grid[i][j] is an integer in the set {-1, 0, 1}.
It is guaranteed that grid[0][0] and grid[N-1][N-1] are not -1.
 */
public class CherryPicks
{

    public static void main(String args[])
    {

    }

    public int cherryPickup(int[][] grid)
    {


        if(grid.length==0 || grid == null)
        {
            return 0;

        }


        int cherries = 0;

        for(int i= 0; i< grid.length ; i++)
        {
            for(int j=0; j< grid[i].length; j++)
            {

                if (grid[i][j]== 1)
                {
                    cherries+= dfs(grid, i,j);
                }
            }

        }
        return cherries;
    }


    int dfs(int[][] grid, int i, int j)
    {
          int picks = 0;

           if(grid[i][j+1]==1 && grid[i+1][j]==1 && i<grid.length)  //there is still next rows
          {



          }
          else if(j== grid[i].length && i== grid.length) // if this is the last row without next rows
          {


          }

          else if(grid[i][j+1]==1 && grid[i+1][j]==0 && i<grid.length) // go to the next row element
          {


          }
          else if(grid[i][j+1]==0 && grid[i+1][j]==1 && i< grid.length) // go to the next right column element
          {

          }
       return 1;
        }
    }

