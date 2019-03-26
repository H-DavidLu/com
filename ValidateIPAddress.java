package com;

/*
Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers,
 each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;

Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.

IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits.
The groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334
is a valid one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters
in the address to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address
(Omit leading zeros and using upper cases).

However, we don't replace a consecutive group of zero value with a single empty group using
 two consecutive colons (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.

Besides, extra leading zeros in the IPv6 is also invalid. For example, the address 02001:0db8:85a3:0000:0000:8a2e:0370:7334
is invalid.

Note: You may assume there is no extra space or special characters in the input string.

Example 1:
Input: "172.16.254.1"

Output: "IPv4"

Explanation: This is a valid IPv4 address, return "IPv4".
Example 2:
Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"

Output: "IPv6"

Explanation: This is a valid IPv6 address, return "IPv6".
Example 3:
Input: "256.256.256.256"

Output: "Neither"

Explanation: This is neither a IPv4 address nor a IPv6 address.
 */

import java.util.Arrays;

public class ValidateIPAddress
{
    //String sting = "151.152.136.1855";

    public static void main(String args[])
    {
        String string = "186.152.035.185";

        int dot=0;
        for(int i =0; i<string.length();i++)
        {
            if(String.valueOf(string.charAt(i)).equals("."))
                dot++;
        }
        System.out.println("The dots are :" +dot);

        String[] str2  =  string.split("\\.");

        System.out.println("This is the new arrays of string with dot: " + Arrays.toString(str2));

        getValid(str2);
    }

    static void getValid(String[] str2)
    {
        int valid = 0;
        int invalid = 0;

        for(int e=0;e<str2.length;e++)
        {
           // toValidate(str2[e]);
            if(toValidate(str2[e])==6)
                valid=0;
            else
            {
                valid++;
               // break;
            }
        }

        if(valid !=0)
            System.out.println("This is a valid IPV4.");
        else
            System.out.println("This is NOT a valid IPV4.");


    }

    static int toValidate(String st3)
    {
        if(Integer.valueOf(st3.charAt(0)).equals("0"))
            return 4;
        else if(Integer.valueOf(st3)> 256 || Integer.valueOf(st3)<1)
            return 4;

        return 6;
    }
}
