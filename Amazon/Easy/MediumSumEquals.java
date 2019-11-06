package com.Amazon.Easy;
// MathCount: AMC 10
// from 100 to 999. The first and third digits is twice of the second digit
public class MediumSumEquals
{

    public static void main(String[] args)
    {
        int sum = 0;
        for(int i= 100; i<= 999; i++)
        {
            if(toCheck(i) == true)
            {

               sum++;
            }
        }

        System.out.print(sum);
    }

    private static boolean toCheck(int test)
    {
        int[] intTab = String.valueOf(test).chars().map(Character::getNumericValue).toArray();

        if(intTab[0]+intTab[2]== 2*intTab[1])
            return true;
        else
            return false;
    }



}
