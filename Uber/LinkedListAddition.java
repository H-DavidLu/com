package com.Uber;
/*
You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import java.util.LinkedList;

public class LinkedListAddition
{

    public static void main(String args[])
    {
        LinkedList<Integer> list1= new LinkedList<>();
        LinkedList<Integer> list2= new LinkedList<>();
        int finalSum = 0;
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);

        String listStr1 = "";
        int stringToInteger1 = 0;
        for(int i= 0; i<list1.size() ; i++)
        {
            listStr1+=String.valueOf(list1.get(i));
        }

        stringToInteger1= Integer.valueOf(listStr1);

        String listStr2 = "";
        int stringToInteger2 = 0;

        for(int i= 0; i<list2.size() ; i++)
        {
            listStr2+=String.valueOf(list2.get(i));
        }

        stringToInteger2= Integer.valueOf(listStr2);
        finalSum=stringToInteger1+stringToInteger2;

        System.out.println( "the list1 is: " + list1);
        System.out.println( "the list2 is: " + list2);
        System.out.println( "the lists after conversion to string is: " + listStr1);
        System.out.println( "the lists after conversion to string is: " + listStr2);

    }


}
