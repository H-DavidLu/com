package com.Uber;

/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Microsoft.

Let's represent an integer in a linked list format by having each node represent
a digit in the number. The nodes make up the number in reversed order.

For example, the following linked list:

1 -> 2 -> 3 -> 4 -> 5
is the number 54321.

Given two linked lists in this format, return their sum in the same linked list format.

For example, given

9 -> 9
5 -> 2
return 124 (99 + 25) as:

4 -> 2 -> 1
 */


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse
{

    public static void main(String args[])
    {

        String[] haha = {"9", "9"};
        String[] haha2 = {"2", "5"};
        LinkedListReverse linkedListReverse =  new LinkedListReverse();

        System.out.println( " This is the sum of reversed strings: "+ linkedListReverse.check(haha, haha2));

    }

    int check(String[] test, String[] test2)
    {
        //String 1
        LinkedList<String> linkedList1 = new LinkedList<>();
        for(int i= 0; i< test.length; i++)
        {
            linkedList1.add(test[i]);
        }

        String str = "";
        int strConvertToString =0;  // convert to integer from String type
        Collections.reverse(linkedList1);

        for(int i=0; i<linkedList1.size(); i++)
        {
            str+=linkedList1.get(i);
        }

        strConvertToString = Integer.valueOf(str);


        System.out.println("This is the linked list after the addition 1:"  + linkedList1);
        System.out.println("This is the conversion to integer 1: "  + strConvertToString);

        // String 2
        LinkedList<String> linkedList2 = new LinkedList<>();
        for(int i= 0; i< test2.length; i++)
        {
            linkedList2.add(test2[i]);
        }

        String str2 = "";
        int strConvertToString2 =0;  // convert to integer from String type
        Collections.reverse(linkedList2);

        for(int i=0; i<linkedList2.size(); i++)
        {
            str2+=linkedList2.get(i);
        }

        strConvertToString2 = Integer.valueOf(str2);

        System.out.println("This is the linked list after the addition 2:"  + linkedList2);
        System.out.println("This is the conversion to integer 2: "  + strConvertToString2);

        return strConvertToString+strConvertToString2;

    }
}
