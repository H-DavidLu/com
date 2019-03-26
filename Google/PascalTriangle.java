package com.Google;
/*
this is:
1. Pascal triangle
2. input a layer and column and show the value:
 */
import java.util.HashMap;

import java.util.Scanner;

public class PascalTriangle
{
    /*
    public static void main(String args[])
    {
        int x=10;//输入几层是几层
        int num[][] = new int[x][x];//这个数组有几层
        for(int m=0;m<x;m++)//主要是对数组进行赋值
        {
            for(int n=0;n<=m;n++)
                //每一层的个数都是小于等于层数的，m代表层数，n代表着第几个数:
                // m: number of the th layer;
                // n: number of the th number at the layer
            {
                if(n==0||m==n)//每一层的开头都是1，m==n的时候也是1,必须要这个，凡事都得有个开头
                {
                    num[m][n]=1;
                }
                else
                    num[m][n]=num[m-1][n-1]+num[m-1][n];//这个就是递推的方法了，例如3=1+2，3的坐标就是3[3,1]=1[2,0]+2[2,1];
                System.out.print(num[m][n]+" ");
            }
            System.out.println();
        }
    }

    /*
    public List<List<Integer>> generate(int numRows)
     {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }

        // Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
    */

    static HashMap<Integer, String> pascal = new HashMap<>();
    static String pascalStr = "";

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plesae input a positive inter for the Pascal Triangle: ");

        int input = scanner.nextInt();
        int x = 0;
        if(input <= 0  || input> 30)
            System.out.println("This is invalid number to create a Pascal Triangle.");
        else {
            System.out.println("Here is the triangle: ");
            x = input;
        }
        int[][] test = new int[x][x];
        /*
         //每一层的个数都是小于等于层数的，m代表层数，n代表着第几个数:
                // m: number of the th layer;
                // n: number of the th number at the layer
         */

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
                  //例如3=1+2，3的坐标就是3[3,1]=1[2,0]+2[2,1];

              }
            //  pascal.put(m,getPascalTriangleNumber(test[m][n], n));

              if(n==m)
                  System.out.print(test[m][n]+" ");
              else
                  System.out.print(test[m][n]+",");

          }
          // pascalStr="";
          System.out.println(" ");
      }

    }

    static String getPascalTriangleNumber(int pascal, int head)
    {
        //String pascalStr = "";
        if((pascal==1 && head!=0))
            pascalStr += Integer.toString(pascal);
        else
            pascalStr += Integer.toString(pascal)+" ";


        return pascalStr;
    }



}
