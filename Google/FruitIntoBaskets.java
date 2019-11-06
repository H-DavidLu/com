package com.Google;
/*
In a row of trees,
the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:
Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.

Note that you do not have any choice after the initial choice of starting tree:
you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit,
 but you want each basket to only carry one type of fruit each.


What is the total amount of fruit you can collect with this procedure?



Example 1:

Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].
Example 2:

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].
Example 3:

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].
Example 4:

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FruitIntoBaskets {

    HashMap<String, Integer> totalInformationMap = new HashMap<>();

    public static void main(String args[])
    {
        int[] tree = {3,3,3,1,2,1,1,2,3,3,4};

        // 0,1,2,2
        FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();
        System.out.println(fruitIntoBaskets.totalFruit(tree));
    }

    public int totalFruit(int[] tree)
    {
        ArrayList<Integer> totalFruit = new ArrayList<>();

        int totalTypes = 1;
        for(int i= 0; i<tree.length-1 ; i++)
        {
            String elementString = String.valueOf(tree[i]);
            for(int j= i+1; j<tree.length; j++)
            {
                //int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
                if (elementString.contains(String.valueOf(tree[j])) && totalTypes<=2 )
                {
                   // totalTypes = 1;
                    if(j==tree.length-1)
                    {
                        totalInformationMap.put("( " + i + ", " + (j) + " )", (j)-(i) + 1);
                        totalFruit.add(j-i + 1);
                        totalTypes=1;
                        break;
                    }
                    else {

                        elementString += String.valueOf(tree[j]);
                    }

                }
                else if(totalTypes<=2  && elementString.contains(String.valueOf(tree[j])))
                {
                    totalTypes =2; //int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
                    elementString+=String.valueOf(tree[j]);

                }
                else if( totalTypes<=2  && !elementString.contains(String.valueOf(tree[j])))
                {   //int[] tree = {3,3,3,1,2,1,1,2,3,3,4};

                    if(totalTypes<2)
                    {
                        totalTypes =2;
                        elementString+=String.valueOf(tree[j]);
                    }
                    else
                    {
                        //int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
                        totalInformationMap.put("( " + i + ", " + (j-1) + " )", (j-1)-(i) + 1);
                        totalFruit.add(j-1-i + 1);
                        totalTypes=1;
                       break;
                    }
                }
            }
        }

        int[] sorted = new int[totalFruit.size()];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = (int)totalFruit.get(i);
        }

        Arrays.sort(sorted);
        return sorted[sorted.length - 1];

    }

    /*
    public int totalFruit(int[] tree) {
        int totalPivot = 0;

        int basketFruit = 1;
        ArrayList<Integer> totalFruit = new ArrayList<>();
        for (int i = 0; i < tree.length - 1; i++) {

            //        int[] tree = {0,1,2,2};
            for (int j = i + 1; j < tree.length; j++)
            {
                if (basketFruit <= 2) // if the pivot is less or equal to 2
                {
                    if (tree[i] != tree[j] && basketFruit < 2) {
                        basketFruit++;
                    }
                    else if(tree[i] != tree[j] && basketFruit == 2 && j!=tree.length-1)
                    {
                        totalInformationMap.put("( " + i + ", " + (j-1) + " )", (j-1)-(i) + 1);
                        totalFruit.add(j-1-i + 1);
                        basketFruit=1;
                        break;

                    }
                    else if( tree[i] != tree[j] && basketFruit == 2 && j==tree.length-1)
                    {

                        totalInformationMap.put("( " + i + ", " + (j) + " )", (j)-(i) + 1);
                        totalFruit.add(j-i + 1);
                        basketFruit=1;
                        break;
                    }
                    else if (tree[i] == tree[j] && basketFruit <= 2 && (j!= tree.length-1)) {
                        continue;
                    }
                    else if(tree[i] == tree[j] && basketFruit <= 2 && (j== tree.length-1))
                    {
                        totalInformationMap.put("( " + i + ", " + (j) + " )", (j)-(i) + 1);
                        totalFruit.add(j-i + 1);
                        basketFruit=1;

                    }
                } else {

                    totalInformationMap.put("( " + i + ", " + (j - 1) + " )", (j-1)-(i) + 1);
                    totalFruit.add((j - 1)-i + 1);
                    basketFruit=1;
                }

            }
        }

        int[] sorted = new int[totalFruit.size()];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = (int)totalFruit.get(i);
        }

        Arrays.sort(sorted);

        return sorted[sorted.length - 1];
    }

    */
}


