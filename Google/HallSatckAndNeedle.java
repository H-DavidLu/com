package com.Google;
/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

 */

public class HallSatckAndNeedle
{

    public int strStr(String haystack, String needle)
    {
        int lengthHaystack = haystack.length();
        int lengthNeedle =  needle.length();

        if((haystack == null) || needle == null)
        {
            return -1;
        }
        else if((lengthHaystack==0 && haystack.contains("")) && lengthNeedle==0 && needle.contains(""))
        {
            return 0;
        }
        else if(lengthHaystack==1 && needle.contains(""))
        {
            return 0;
        }
        else if((lengthHaystack==0 && lengthNeedle!=0) || (lengthHaystack!=0 && lengthNeedle==0) )
        {
            return -1;
        }
        else if( haystack.contains(needle)  &&  (lengthHaystack>=2 && lengthNeedle>=1 ))
            {
                for(int i= 0; i<lengthHaystack ; i++)
                {
                    if(String.valueOf(haystack.charAt(i)).contains(String.valueOf(needle.charAt(0))))
                    {
                        return i;
                    }
                }

            }
            else
                return -1;

            return 0;
    }

    public static void main(String args[])
    {

        String haystack="hello" , needle = "ll";
        HallSatckAndNeedle hallStack = new HallSatckAndNeedle();
        System.out.println("The first occurance of the needle: " +hallStack.strStr(haystack, needle));
    }

}
