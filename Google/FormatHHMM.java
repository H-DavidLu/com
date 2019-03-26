package com.Google;

/*
Given a time represented in the format "HH:MM",
form the next closest time by reusing the current digits.
There is no limit on how many times a digit can be reused.

You may assume the given input string is always valid. For example,
 "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.

Example 1:

Input: "19:34"
Output: "19:39"
Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39,

which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.
Example 2:

Input: "23:59"
Output: "22:22"
Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22.
It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
 */

import java.util.Arrays;
import java.util.Formatter;

public class FormatHHMM {

    public static void main(String args[])
    {
      String initialHHMM = "19:34";
      String[]  splited = initialHHMM.split(":");
      String initilNOSign = initialHHMM.replaceAll(":", "");

      System.out.println("The string without common sigh is:  " + initilNOSign);

      System.out.println(Arrays.toString(splited));
      FormatHHMM formatHHMM =  new FormatHHMM();
      System.out.println(" The next close time is: "+ formatHHMM.checkMinutesPart(splited, initilNOSign));
    }

    String checkMinutesPart(String[] splited, String initial)
    {
        String hh= splited[0];
        String mm = splited[1]; // minutes part
        int minuteInteger = Integer.valueOf(mm) ;
        int hourInter = Integer.valueOf(hh);
        String firstDigitMinute = String.valueOf(mm.charAt(1)); // get the first digital
        String firstDigitHour = String.valueOf(hh.charAt(1));
        System.out.println("The first digital in string type : " + firstDigitMinute);
        String nextClose= "";

        // check the first digit of minute
        for(int start = minuteInteger+1; start<=59; start++)
        {

            String converToString = String.valueOf(start);

            if(initial.contains(String.valueOf(converToString.charAt(1))) &&
                    initial.contains( String.valueOf(converToString.charAt(0))))
            {
                nextClose = mm+":"+String.valueOf(start);
                //System.out.println("The most close next time is:" +nextClose);

               break;
            }

            return nextClose;
        }

        // case 2: if the numbers from mm to 59th minute are not matched ,then there will be an other loop to check
        // from 00 to 59-1 if possible
        for(int u=0; u<=59; u++)
        {
            String converToString = String.valueOf(u);

            if(u<10)
            {
                if(initial.contains(String.valueOf(converToString.charAt(1))))
                {
                    nextClose = mm+":"+String.valueOf(u);
                    //System.out.println("The most close next time is:" +nextClose);

                    break;


                }
            }
            else
            {
                if(initial.contains(String.valueOf(converToString.charAt(1))) &&
                        initial.contains( String.valueOf(converToString.charAt(0))))
                {
                    nextClose = mm+":"+String.valueOf(u);
                    //System.out.println("The most close next time is:" +nextClose);

                    break;


                }

            }






            /*

            String converToString = String.valueOf(u);

            if(initial.contains(String.valueOf(converToString.charAt(1))) &&
                    initial.contains( String.valueOf(converToString.charAt(0))))
            {
                nextClose = mm+":"+String.valueOf(start);
                //System.out.println("The most close next time is:" +nextClose);

                break;
            }

            return nextClose;
            */

        }
     return "";
        // case 2-2: hour part: need to also have a loop to handle the hour digit to meet the criteria
    }
}
