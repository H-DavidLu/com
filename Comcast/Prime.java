package com.Comcast;

import java.util.ArrayList;
import java.util.TreeSet;

public class Prime {
    public static void main(String args[])
    {
        Prime prime = new Prime();
        int target = 100000;
        ArrayList<Integer> arrayList =  new ArrayList<>();
        ArrayList<String> after2 = new ArrayList<>();
        ArrayList<String> finalList =  new ArrayList<>();

        for(int i=2; i<target; i++) {
            if (checkPrime(i) == true)
                arrayList.add(i);
        }

        for(int j=0; j<arrayList.size()-1;j++)
        {

            if( Integer.valueOf( arrayList.get(j)*2 ).equals(target))
                after2.add(String.valueOf(arrayList.get(j)));
        }

        for(int i=0;i<arrayList.size()-1; i++)
        {
            for(int j= i+1; j< arrayList.size(); j++)
            {
                if( Integer.valueOf(arrayList.get(i) + arrayList.get(j)).equals(target))
                    finalList.add("(" + arrayList.get(i) + ", " + arrayList.get(j)+ ")");
            }
        }

        if(finalList.isEmpty() && after2.isEmpty())
            System.out.println("This is the list of the prime numbers to combine the target number : no any prime numbers can be conposed of this target" );
        else if(!finalList.isEmpty() && after2.isEmpty())
            System.out.println("This is the list of the prime numbers to combine the target number : " + finalList);
        else if(!finalList.isEmpty() && !after2.isEmpty())
            System.out.println("This is the list of the prime numbers to combine the target number : " + finalList + " " + after2);
        else
            System.out.println("This is the list of the prime numbers to combine the target number : " + after2);
    }

   static boolean checkPrime(int target)
   /**** this is the main function for chacking and then returning boolean  **/
    {
        int pivotPrime = 0;

        for (int i = 2; i < target / 2; i++)
        {
            if (target % i == 0) {
                pivotPrime++;
                break;
            } else
                continue;
        }

        if (pivotPrime > 0)
            return false;
        else
            return true;
    }
}