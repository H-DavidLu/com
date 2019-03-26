package com.CommonMethods;

public class DivideStringToCharacter
{

    public static void main(String args[])
    {
        String test= "abcdef";
        int length = test.length();

        int numberOfGroups = 0;
        if(length%3 == 0)
            numberOfGroups = length/3;
        else
            numberOfGroups=((length/3) +1);


        for(int i = 1; i<= numberOfGroups;i++)
        {
            int pivot = length-1;

            for(int groupElemement = pivot; groupElemement>=pivot-3; groupElemement--)
            {


            }

        }


        System.out.println("The number of grouping is: " + numberOfGroups);

    }
}
