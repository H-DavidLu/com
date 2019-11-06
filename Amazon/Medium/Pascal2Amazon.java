package com.Amazon.Medium;

import java.util.ArrayList;
import java.util.List;

public class Pascal2Amazon
{

    public List<Integer> getRow(int rowIndex) {


        int x = rowIndex;
        ArrayList<Integer>  arrayListPascalRows =  new ArrayList<>();
        int[][] test = new int[x][x];

        for (int m = 0; m < x; m++)
        {
            for (int n = 0; n <= m; n++)
            {
                if (n == 0 || n == m)
                {
                    test[m][n] = 1;
                }
                else {
                    test[m][n] = test[m - 1][n] + test[m - 1][n - 1];

                }

                if (n == m) {
                    System.out.print(test[m][n] + " ");
                    arrayListPascalRows.add(test[m][n]);
                }
                else {
                    System.out.print(test[m][n] + ",");
                    arrayListPascalRows.add(test[m][n]);

                }
            }
            System.out.println(" ");
        }
        return arrayListPascalRows;
    }

    public static void main(String[] args) {

        int row = 3;
        Pascal2Amazon P = new Pascal2Amazon();
        System.out.println( P.getRow(row));

    }
}
