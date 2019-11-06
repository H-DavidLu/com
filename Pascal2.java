package com;

public class Pascal2
{
    public static void main(String args[])
    {
        int x = 5;
    int[][] test = new int[x][x];

        for(int m=0; m<x;m++)
    {
        for(int n=0; n<=m;n++)
        {
            if(n==0||n==m)
            {
                test[m][n]=1;
            }
            else
            {
                test[m][n] = test[m - 1][n] + test[m - 1][n - 1];

            }

            if(n==m)
                System.out.print(test[m][n]+" ");
            else
                System.out.print(test[m][n]+",");
        }

        System.out.println(" ");
    }

}

}
