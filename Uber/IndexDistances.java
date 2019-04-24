package com.Uber;

public class IndexDistances
{
    public static void main(String args[])
    {
        int[] test = {6,2,3,10,34,2,3,34,35,37};
        int target = 4;
        IndexDistances indexDistances =  new IndexDistances();
        System.out.println( indexDistances.checkDistance(test,target));
    }

    int checkDistance(int[] test, int target)
    {
        int leftBigIndex =0 ;
        int rightBigIndex=0;
        boolean leftYes =false, rightYes=false;
        int targetValue = test[target];

        if(target==0)
        {
            for(int i= target+1;  i<test.length ; i++)
            {
                if(test[i]> targetValue)
                {
                    rightBigIndex=i;
                    rightYes=true;
                    break;
                }
            }

        }
        else if(target==1)
        {
            //======== right ======================================
            for(int i= target+1;  i<test.length ; i++)
            {
                if(test[i]> targetValue)
                {
                    rightBigIndex=i;
                    break;
                }

            }

            //======== left =======================================
            if(test[0]>test[target])
            {
                leftBigIndex = 0;
            }

            //======== right and left booleans determination
            if(leftBigIndex==0 && rightBigIndex>target )
            {
                leftYes=true;
                rightYes=true;

            }
           // else if()
            {

            }


        }
        else if(target >=2)
        {
            // right
            for(int i= target+1;  i<test.length ; i++)
            {
                if(test[i]> targetValue)
                {
                    rightBigIndex=i;
                    break;
                }
            }

            // left
            for(int j= 0; j<target ; j++)
            {
                if(test[j]> targetValue)
                {
                    leftBigIndex=j;
                    break;
                }
            }
        }

        if(target-leftBigIndex >rightBigIndex-target)
            return rightBigIndex;
        else if(target-leftBigIndex < rightBigIndex-target)
            return leftBigIndex;
        else
            return leftBigIndex;

    }
}
