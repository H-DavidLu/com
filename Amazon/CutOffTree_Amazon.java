package com.Amazon;
/*
You are asked to cut off trees in a forest for a golf event.
The forest is represented as a non-negative 2D map, in this map:

0 represents the obstacle can't be reached.
1 represents the ground can be walked through.
The place with number bigger than 1 represents a tree can be walked through,
 and this positive number represents the tree's height.


You are asked to cut off all the trees in this forest in the order of tree's height - always cut off the tree
 with lowest height first. And after cutting, the original place has the tree will become a grass (value 1).

You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all
the trees. If you can't cut off all the trees, output -1 in that situation.

You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.

Example 1:

Input:
[
 [1,2,3],
 [0,0,4],
 [7,6,5]
]
Output: 6


Example 2:

Input:
[
 [1,2,3],
 [0,0,0],
 [7,6,5]
]
Output: -1


Example 3:

Input:
[
 [2,3,4],
 [0,0,5],
 [8,7,6]
]
Output: 6
Explanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without walking.
 */

import java.util.ArrayList;
import java.util.List;

public class CutOffTree_Amazon
{
    int numberTreetoCut = 0;

    public int cutOffTree(List<List<Integer>> forest)
    {
       if(forest==null || forest.size()==0)
           return 0;

      // int numberTreetoCut = 0;

       int rowSize =forest.size();
       int column = forest.get(0).size();

        int pathCounts = 0;
        for(int i=0; i<forest.size(); i++)
        {
            for(int j= 0; j<forest.get(0).size() ; j++)
            {
                if(forest.get(i).get(j)>0)
                {
                    pathCounts+= dfsCutTree(forest, i, j, rowSize, column);
                }
            }
        }

        if(numberTreetoCut==pathCounts)
            return pathCounts;
        else
            return -1;

    }

    public int dfsCutTree(List<List<Integer>> forest, int i, int j, int rowSize, int columnL) {
        if (i < 0 || i >= forest.size() || j < 0 || j >= forest.get(i).size() ||
                forest.get(i).get(j) == 0)
        {
            return 0;
        }

        if(i==0) // first row
        {
            if (j == 0) // the first element
            {
                if((forest.get(i).get(j + 1) < forest.get(i+1).get(j)))
                {
                    if( (forest.get(0).get(1)!=0))
                    {
                        numberTreetoCut++;
                        dfsCutTree(forest, i,j+1, rowSize, columnL);
                    }
                    else if((forest.get(1).get(0)!=0))
                    {
                        numberTreetoCut++;
                        dfsCutTree(forest, i+1,j, rowSize, columnL);
                    }



                         /*
                          && (forest.get(0).get(1)!=0)
                && forest.get(i).get(j+1)!=0 )
                          */

                }
                else
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i+1, j, rowSize, columnL);
                }
            }
            else if(j==columnL-1) // the last element of first row
            {
                if((forest.get(i).get(columnL-2) < forest.get(i+1).get(columnL-1)) &&
                        forest.get(i).get(columnL-2)!=0 && forest.get(i).get(j)!=1
                )
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i,columnL-2, rowSize, columnL);
                }
                else
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i+1, columnL-2, rowSize, columnL);
                }
            }
            else  // not in the first element in 0,0 or the last element of first row
            {
                if((forest.get(i).get(j+1) < forest.get(i+1).get(j)) &&
                        (forest.get(i).get(j+1)!=0)  &&
                        forest.get(i).get(j)!=1)
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i,j+1, rowSize, columnL);
                }
                else
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i+1,j, rowSize, columnL);
                }
            }
        }
        else if(i==rowSize-1) // last row
        {
            if(j==0) // the first element of the last row
            {
                if((forest.get(i).get(j+1) < forest.get(i-1).get(j)) &&
                        forest.get(i).get(j+1)!=0 &&
                        forest.get(i).get(j)!=1
                )
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i,j+1, rowSize, columnL);
                    //numberTreetoCut++;
                }
                else
                {
                    numberTreetoCut++;
                    dfsCutTree(forest, i-1,j, rowSize, columnL);
                    //numberTreetoCut++;
                }
            }
            else if(j==columnL-1) // if the last element of the last row
            {
                if((forest.get(i).get(j-1) < forest.get(i-1).get(j)) &&
                        forest.get(i).get(j-1)!=0  && forest.get(i).get(j)!=0)
                {
                    dfsCutTree(forest, i,j-1, rowSize, columnL);
                }
                else
                {
                    dfsCutTree(forest, i-1,j, rowSize, columnL);
                }
            }
            else if((forest.get(i).get(j+1) < forest.get(i-1).get(j)) &&
                    forest.get(i).get(j+1)!=0 && forest.get(i).get(j)!=1 ) // the element of the last row but not the first one
            {
                numberTreetoCut++;
                dfsCutTree(forest, i,j+1, rowSize, columnL);
            }
        }
        return 1;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> forest = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        forest.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(0);
        a2.add(0);
        a2.add(4);
        forest.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(7);
        a3.add(6);
        a3.add(5);
        forest.add(a3);
        CutOffTree_Amazon Cut = new CutOffTree_Amazon();
        System.out.println(Cut.cutOffTree(forest));
    }
}
