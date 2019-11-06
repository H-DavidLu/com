package com.Google;

public class PathIslands
{

    public String pathIslands(int[][] grid)
    {
        if(grid == null || grid.length ==0)
        {

            return "the grid is null or lenght is 0.";

        }

        String path = "";
        for(int i=0; i<grid.length; i++)
        {
            for(int j= 0; j<grid[i].length ; j++)
            {
                if(grid[i][j]==0)
                {

                    path+= dfs(grid, i, j);

                }
            }

        }

        return path;
    }

    public String dfs(int[][] grid, int i, int j)
    {
        if(i<0 ||i>= grid.length || j<0 || j>= grid[i].length || grid[i][j] == 1)
        {

            return null;
        }

       // grid[i][j] = 0;
        if (dfs(grid,i,j+1) !=null)
        {
            return "[ "+ i+ ", " + j+ "]"+ " :  go right";

        }
        else if (dfs(grid,i+1, j) != null)
        {
            return "[ "+ i+ ", " + j+ "]"+ " : down";
        }

        return "[ "+ i+ ", " + j+ "]";
    }


    public static void main(String args[])
    {
        int[][] test = {{0, 0, 1}, {0,0,1}, {1,0,0}};
        PathIslands n = new PathIslands();
        System.out.println(n.pathIslands(test));

        /*
        [[0, 0, 1],
 [0, 0, 1],
 [1, 0, 0]]
         */
    }

}
