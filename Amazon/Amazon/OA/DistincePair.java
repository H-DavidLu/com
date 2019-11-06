package com.Amazon.Amazon.OA;

import java.util.ArrayList;
/*
3,2 is the same as 2,3
 */

public class DistincePair
{
    ArrayList<String> arrayList = new ArrayList<>();
    protected int pairs(int[] test, int target )
    {
        int length= test.length;
        int flag =0;
        for(int i= 0; i<test.length-1 ; i++)
        {
          for(int p=i+1; p<test.length ; p++)
          {
             if(arrayList.size()==0 && test[i] + test[p] == target)
             {
                 arrayList.add(test[i]+","+test[p]);
                 flag++;
             }
             else if(arrayList.size()!=0 && test[i] + test[p] == target)
                 {
                 if( checkDuplicated(arrayList, target, test[i], test[p]) == true)
                 {
                     continue;
                 }
                 else
                 {
                     arrayList.add(test[i]+","+test[p]);
                     flag++;
                 }
                }
             }
        }
        return arrayList.size();
    }

    boolean checkDuplicated(ArrayList<String> arrayList, int target, int a, int b)
    {
        for(int i= 0; i<arrayList.size() ; i++)
        {
            String[] container = arrayList.get(i).split(",");
            for(int p= 0;p<container.length ; p++)
            {
                if((Integer.valueOf(container[0]) ==a  && Integer.valueOf(container[1])==b )||
                        (Integer.valueOf(container[0])== b && Integer.valueOf(container[1])==a ))

                    return true;
                else
                    return false;
            }
            container=null;
        }

      return false;
    }

    public static void main(String[] args) {
        int[] test= {1, 5, 7, -1, 5};
        int target = 6;

        DistincePair d =  new DistincePair();
        System.out.println(d.pairs(test, target));
    }
}
