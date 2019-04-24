package com.Google;
/*
0, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986, 1001, 1111, 1691,
1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008, 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966, ...
(sequence A000787 in the OEIS)

 A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

Example 1:

Input:  "69"
Output: true
Example 2:

Input:  "88"
Output: true
Example 3:

Input:  "962"
Output: false


1, 6,9, 0

 */




public class StrobogrammaticNumbers
{

    public static void main(String args[])
    {

        String test = "1111111111";
        int[] integerArray = new int[test.length()];
        for(int i= 0;i<test.length() ; i++)
        {
            integerArray[i] = Integer.valueOf(String.valueOf(test.charAt(i)));
        }

        String newString = "";

        StrobogrammaticNumbers strobogrammaticNumbers = new StrobogrammaticNumbers();
        int length = test.length();

        if(length%2 ==0)
        {
           for(int i= 0; i<= (length/2)-1 ; i++)
           {
               if(strobogrammaticNumbers.checkStrobogrammatic(integerArray[i], integerArray[length-1-i]) == false)
               {
                   System.out.println("This is not a stogprogrammic:" + test);
                   break;
               }
               else {
                   continue;
               }
            //   System.out.println("This is a stogprogrammic:" + test);

           }
          //  System.out.println("This is a stogprogrammic:" + test);


        }
        else
        {
            for(int i= 0; i<= (length/2)-1 ; i++)
            {
                if(strobogrammaticNumbers.checkStrobogrammatic(integerArray[i], integerArray[length-1-i]) == false)
                {
                    System.out.println("This is not a stogprogrammic:" + test);
                    break;
                }
                    else
                    continue;
            }
            System.out.println("This is a stogprogrammic:" + test);

        }
    }

    boolean checkStrobogrammatic(int a, int b)
    {

        if(a==1 && b==1)
            return true;
        else if( a==0 && b==0 )
            return true;
        else if (a==6 && b==9)
            return true;
        else if(a==9 && b==6)
            return true;
        else if(a==8 && b== 8)
            return true;
        else if(a==0 && b==0)
            return true;
        else
            return false;
    }
}
