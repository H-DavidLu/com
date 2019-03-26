package com.Comcast;

/*
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
 */
public class MinCoins
{

    int minNumber = 0;
    static int addHere = 0;
    static int target = 13;
    public static void main(String args[])
    {

      int[]  test = {1,2,5};

     MinCoins minCoins = new MinCoins();

      for(int i=test.length-1;i>=0; i--)
      {
          minCoins.getCalculate(test[i],target);
      }

      System.out.println("The min number of coins is: " + addHere);
    }

    void getCalculate(int toDo, int target2)
    {
        int afterDeletion = 0;

        if(target2-toDo>=0)
        {
            addHere++;
            afterDeletion = target2-toDo ;
            target=afterDeletion;
            getCalculate(toDo, afterDeletion);
        }
    }
}
