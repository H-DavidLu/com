package com.Google;

import java.util.HashSet;

public class FirstOccuranceCharacter
{
    HashSet<Character> container = new HashSet<>();
    char checkOccurance(String str)
    {
        char[] strChar = str.toCharArray();
        for(int i= 0; ; i++)
        {
           if(container.size()==0)
           {
               container.add(strChar[0]);

           }
           else if(!container.contains(strChar[i]))
               container.add(strChar[i]);
           else if(container.contains(strChar[i]))
           {
               return  strChar[i];

           }
        }
    }

    public static void main(String[] args)
    {
       String str= "ABCDEFGB";
       FirstOccuranceCharacter f = new FirstOccuranceCharacter();

       System.out.println("The first occurance of character for the string: " + str+ "  is: " + f.checkOccurance(str));
    }
}
