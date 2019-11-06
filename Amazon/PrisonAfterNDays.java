package com.Amazon;

import java.util.Arrays;

public class PrisonAfterNDays
{

    public int[] prisonAfterNDays(int[] cells, int N)
    {
        int[] temp= new int[8];
        int[][] rotates = new int[N+1][8];

        for(int p = 0; p<=N;p++)
        {
            if (p == 0)
            {
                rotates[0] = cells;
            }
            else
                {
                    rotates[p][0] = 0;
                    rotates[p][7] = 0;
                    for (int y = 1; y < cells.length-1; y++)
                    {

                        if (    (rotates[p-1][y-1] == 1 && rotates[p-1][y+1] == 1) ||
                            (rotates[p-1][y-1] == 0 && rotates[p-1][y+1] == 0))
                            //[0,1,0,1,1,0,0,1]
                            rotates[p][y] = 1;
                        else
                            rotates[p][y] = 0;
                    }

                }
        }

        return rotates[N];
        }


    public static void main(String[] args) {

        int[] rotates = {0,1,0,1,1,0,0,1};
        int N = 80000000;
        PrisonAfterNDays p = new PrisonAfterNDays();
        System.out.println("The cells are:" + Arrays. toString(p.prisonAfterNDays(rotates, N) ));
    }

    }
