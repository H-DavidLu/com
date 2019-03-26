package com.Google;

import java.util.Arrays;
import java.util.HashMap;

/*
Given two strings S and T, return if they are equal when both are typed into empty text editors.
# means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
 */
import java.util.HashMap;

public class Backspaces
{
    int position = 0;
    int numberOfConsecutiveSigns = 0;
    HashMap<Integer, Integer> signHashMap = new HashMap<>();

    public static void main(String args[]) {
        String t1 = "abc###";
        char[] t1char = t1.toCharArray();
        String aftert1 = "";
        String t2 = "c#d#";
        char[] t2char = t2.toCharArray();
        String aftert2 = "";

        Backspaces backspaces = new Backspaces();

        System.out.println(backspaces.checkConsequetiveSigns(t1));
        //System.out.println(backspaces.checkConsequetiveSigns(t2));
    }

    HashMap checkConsequetiveSigns(String string)
    {
        int length = string.length();
        int signCounter2_Or_More= 1;
        int signCounter1_Only= 1;
        int signStartingPosition_2or_More = 0;

        for(int i=0; i<string.length()-1; i++)
        {
            if((string.charAt(i)=='#' &&string.charAt(i+1)=='#')) //signCounter==0
            {
                signCounter2_Or_More+=1;
                //signStartingPosition=i;
                i++;
            }
            else if(string.charAt(i)=='#' && string.charAt(i+1)!='#' && signCounter2_Or_More==1) //signCounter!=0
            {

                signHashMap.put(i-signCounter2_Or_More , signCounter2_Or_More);
                signCounter2_Or_More=1;
                signHashMap.put(i,signCounter1_Only);
            }
            else
                continue;
        }

        System.out.println("The container of the # with positions: " + signHashMap );
        return signHashMap;
    }

    /*
    boolean checkConsequetiveSigns(String string)
    {
        int length = string.length();
        int signCounter = 1;
        int signStartingPosition = 0;

        for(int i=0; i<string.length()-1; i++)
        {
            if((string.charAt(i)=='#' &&string.charAt(i+1)=='#')) //signCounter==0
            {
                signCounter++;
                signStartingPosition=i;
                i++;
            }
            else if(string.charAt(i)=='#' &&string.charAt(i+1)=='#') //signCounter!=0
            {
                signCounter++;
            }
            else
                continue;
        }

        position=signStartingPosition;
        numberOfConsecutiveSigns=signCounter;

       if(signCounter>=2)
           return true;
       else
           return  false;
    }
    */
}

/*
      if(backspaces.checkConsequetiveSigns(t1)) // check if the string has consecutive signs
      {
        for(int i=backspaces.position-2 ; i<=(backspaces.numberOfConsecutiveSigns)+ (backspaces.position) -1 ; i++)
        {
            t1char[i] = ' ';
        }
        aftert1=String.valueOf(t1char);
        aftert1 = aftert1.replace(" ","");

        if(aftert1.isEmpty()) {
            System.out.println("The after 1 is empty? " + aftert1.isEmpty());
            System.out.println("The after1:" + aftert1);
        }
        else
            System.out.println("The after1:" + aftert1);
      }
      else // if there are no consecutive signs
      {
           for(int p= 0; p<t1char.length ; p++)
          {
                if(t1char[p]=='#')
                    t1char[p]=' ';
          }
          aftert1=String.valueOf(t1char);
          aftert1 = aftert1.replace(" ","");

          if(aftert1.isEmpty()) {
              System.out.println("The after 1 is empty? " + aftert1.isEmpty());
              System.out.println("The after1:" + aftert1);
          }
          else
              System.out.println("The after1:" + aftert1);

      }

      // t2
        if(backspaces.checkConsequetiveSigns(t2)) // check if the string has consecutive signs
        {
            for(int i=backspaces.position-2 ; i<=(backspaces.numberOfConsecutiveSigns)+ (backspaces.position) -1 ; i++)
            {
                t2char[i] = ' ';
            }
            aftert2=String.valueOf(t2char);
            aftert2 = aftert2.replace(" ","");

            if(aftert2.isEmpty()) {
                System.out.println("The after 2 is empty? " + aftert2.isEmpty());
                System.out.println("The after2:" + aftert2);
            }
            else
                System.out.println("The after2:" + aftert2);
        }
        else // if there are no consecutive signs
        {
            for(int p= 0; p<t2char.length ; p++)
            {
                if(t2char[p]=='#')
                {
                    t2char[p] = ' ';
                    t2char[p-1]=' ';
                }
            }
            aftert2=String.valueOf(t2char);
            aftert2 = aftert2.replace(" ","");

            if(aftert2.isEmpty()) {
                System.out.println("The after 2 is empty? " + aftert2.isEmpty());
                System.out.println("The after2:" + aftert2);
            }
            else
                System.out.println("The after2:" + aftert2);

        }
    }
   */
