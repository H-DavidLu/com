package com.Google;

/*
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
 */

import java.util.LinkedList;

public class SwapLinkedList
{

    public static void main(String args[])
    {

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> afterLinkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        for(int i= 0; i<linkedList.size()-1; i++)
        {
            int first = 0,second =0;
            first = linkedList.get(i);
            second = linkedList.get(i+1);
            afterLinkedList.add(i, second);
            afterLinkedList.add(i+1, first);
            i++;
        }


        for(int i= 0; i<linkedList.size() ; i++)
        {
            System.out.println("Linked in list:" + afterLinkedList.get(i));
        }

        afterLinkedList.add(0, 100);
        System.out.println( afterLinkedList);
    }
}
