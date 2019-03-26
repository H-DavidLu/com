package com.davidlu.interview;

import java.util.TreeMap;


public class Calendar
{

        TreeMap<Integer, Integer> calendar;

        Calendar() {
            calendar = new TreeMap();
        }

        public static void main(String args[])
        {
            Calendar cal = new Calendar();
            cal.book(23,29);
            cal.book(25,26);
            cal.book(32,68);
            cal.book(10,32);
            cal.book(45,56);
        }

    int counter=0;
        public int book(int start, int end)
        {


            Integer prev = calendar.floorKey(start),
                    next = calendar.ceilingKey(start);
            if ((prev == null || calendar.get(prev) <= start) && (next == null || end <= next))
            {
                ++counter;
                calendar.put(start, end);
                System.out.println("This is total :" + counter);

                System.out.println("This is true or not to schedule :" +true);

                //return true;
            }
            else {
               // ++counter;
                System.out.println("This is total  :" +counter);

                System.out.println("This is true or not to schedule : " + false);
            }
            //return false;
            return counter;
        }
}

