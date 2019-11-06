package com.Amazon.Medium;

import java.util.ArrayList;
import java.util.List;

public class ExcellColumnsRows
{
    private List<String> getList(String string)
    {
        String[] signString = string.trim().split("[\\:]+");
        String[] part1 = signString[0].split("(?<=\\D)(?=\\d)");
        char startChar = part1[0].charAt(0);
        int starIndex =Integer.valueOf(part1[1]);

        String[] part2 = signString[1].split("(?<=\\D)(?=\\d)");
        char endChar = part2[0].charAt(0);
        int endIndex = Integer.valueOf(part2[1]);
        ArrayList<String> arrayList =  new ArrayList<>();

        for(char i= startChar; i<=endChar ; i++)
        {
            for(int p=starIndex ; p<=endIndex ; p++)
            {
               arrayList.add(i+String.valueOf(p));
            }
        }
       return arrayList;
    }

    public static void main(String[] args) {
        for (char c = 'a'; c <= 'd'; c++)
        {
            System.out.println(c);
        }

        ExcellColumnsRows E = new ExcellColumnsRows();
        System.out.println( E.getList("A3:D8"));
    }
}
