package com.Facebook.Easy;
/*
Done? : Not yet
Link:
https://leetcode.com/problems/island-perimeter/

You are given a map in form of a two-dimensional integer grid where
 1 represents land and 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally).
The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes" (water inside that isn't connected to
the water around the island). One cell is a square with side length 1. The grid is rectangular,
 width and height don't exceed 100. Determine the perimeter of the island.

Example:

Input:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Output: 16

Explanation: The perimeter is the 16 yellow stripes in the image below:
 */

public class IslandParameters {

    int four=0, three=0, two=0, one =0;

    public int islandPerimeter(int[][] grid)
    {
        int totalPerimeter = 0;
        for(int i= 0; i<grid.length; i++)
        {
            for(int p= 0; p<grid[0].length; p++)
            {
                if(grid[i][p]==1)
                {
                       checkParameterNumber(i, p, grid.length, grid[0].length  , grid);
                }
            }
        }

        totalPerimeter = four*4+three*3+two*2+one*1;

        return totalPerimeter;

    }

    void checkParameterNumber(int i, int p, int rowLength, int columnLength,  int[][] grid) {

        if (columnLength == 1)
        {
            if(rowLength==1)
                four++;
            else if(rowLength>1)
            {
                if(i==0)
                {
                    if (p == 0)
                    {
                        if (grid[i + 1][p] == 1)
                            three++;
                        else
                            four++;
                    }
                }
                else if(i>0 && i<rowLength-1)
                {
                    if(grid[i-1][p]==1 && grid[i+1][p]==1)
                    {
                        two++;
                    }
                    else if(grid[i-1][p]==1 && grid[i+1][p]==0)
                    {
                        three++;
                    }
                    else if(grid[i-1][p]==0 && grid[i+1][p]==1)
                    {
                        three++;
                    }
                }
                else if(i==rowLength-1)
                {
                    if(grid[i-1][p]==0)
                        four++;
                    else if(grid[i-1][p]==1)
                        three++;
                }
            }

        }
        else {
            if (i == 0) // the first row
            {
                if (p == 0) {
                    if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1) {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1) {
                        two++;
                    }
                } else if (p == columnLength - 1) {

                    if (grid[i][p - 1] == 0 && grid[i + 1][p] == 0) // no ones
                    {
                        four++;
                    } else if (grid[i][p - 1] == 1 && grid[i + 1][p] == 0) {
                        three++;
                    } else if (grid[i][p - 1] == 0 && grid[i + 1][p] == 1) {
                        three++;
                    } else if (grid[i][p - 1] == 1 && grid[i + 1][p] == 1) {
                        two++;
                    }
                } else if (p > 0 && p < columnLength) {
                    if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i][p - 1] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i][p - 1] == 0) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i][p - 1] == 0) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i][p - 1] == 1) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i][p - 1] == 0) // two connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i][p - 1] == 1) // three connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i][p - 1] == 1) // three connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i][p - 1] == 1) // three connection
                    {
                        one++;
                    }
                }
            } else if (i > 0 && i < rowLength - 1) {
                if (p == 0) {
                    if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1) {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0) // right, down, up
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 1) // right, down, up
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1) // right, down, up
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i - 1][p] == 1) // right, down, up
                    {
                        one++;
                    }

                } else if (p > 0 && p < rowLength) // regular
                {

                    if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1) {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) // 1
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0)//2
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1)//3
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0)//4
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1)//5
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1)//6
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0)// only one
                    {
                        one++;
                    } else if (grid[i][p + 1] == 0 && grid[i + 1][p] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1)// only one
                    {
                        one++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1)// only one
                    {
                        one++;
                    } else if (grid[i][p + 1] == 1 && grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1)// only one
                    {
                        one++;
                    }
                } else if (p == columnLength - 1) {
                    if (grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0)  // an island without connections
                    {
                        four++;
                    } else if (grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0)  // one connection
                    {
                        three++;

                    } else if (grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0)  // one connection
                    {
                        three++;
                    } else if (grid[i + 1][p] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1)  // one connection
                    {
                        three++;
                    } else if (grid[i + 1][p] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0) {
                        two++;
                    } else if (grid[i + 1][p] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1) {
                        two++;
                    } else if (grid[i + 1][p] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1) {
                        two++;
                    }

                }
            } else if (i == rowLength - 1) {
                if (p == 0) {
                    if (grid[i][p + 1] == 0 && grid[i - 1][p] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 0) {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i - 1][p] == 1) {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 1) {
                        two++;
                    }
                } else if (p == columnLength - 1) // last one
                {

                    if (grid[i][p - 1] == 0 && grid[i - 1][p] == 0) // no ones
                    {
                        four++;
                    } else if (grid[i][p - 1] == 1 && grid[i - 1][p] == 0) {
                        three++;
                    } else if (grid[i][p - 1] == 0 && grid[i - 1][p] == 1) {
                        three++;
                    } else if (grid[i][p - 1] == 1 && grid[i - 1][p] == 1) {
                        two++;
                    }
                } else if (p > 0 && p < columnLength) {
                    if (grid[i][p + 1] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) {
                        four++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 0) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 0 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1) // three connection
                    {
                        three++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 0) // two connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 0 && grid[i][p - 1] == 1) // three connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 0 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1) // three connection
                    {
                        two++;
                    } else if (grid[i][p + 1] == 1 && grid[i - 1][p] == 1 && grid[i][p - 1] == 1) // three connection
                    {
                        one++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0}};
        IslandParameters I= new IslandParameters();
        System.out.println(I.islandPerimeter(grid));
    }
}
