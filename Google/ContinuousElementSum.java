package com.Google;

import java.util.HashSet;

public class ContinuousElementSum
{
    HashSet<String> tartgetContainer2 = new HashSet<>();

    public static void main(String args[])
    {
      int[] test = {1,2,3,4,5,6};
      int target = 9;

      ContinuousElementSum continuousElementSum =  new ContinuousElementSum();
      continuousElementSum.getSumsUp(target,test);

    }

    void getSumsUp(int target, int[] test)
    {

        // starting the index 0:
        for (int startIndex = 0; startIndex < test.length; startIndex++) {
            calculateElementsSum(test, startIndex,target); // call the startinded =0
        }

        System.out.println("The list of contigent elements are: as" + tartgetContainer2);
    }

    void calculateElementsSum(int[] test, int startIndex, int target) //  startIndex = 0
    {
        int addUp = 0;
        String stringKey = "";

        for(int i=startIndex; i<(test.length); i++)
        {
            addUp+=test[i];
            stringKey+= String.valueOf(test[i])+ " " ;
            if(addUp == target) {
                tartgetContainer2.add("( "+stringKey+ ")");
                break;
            }
        }

        stringKey="";
        addUp=0;
    }
}
