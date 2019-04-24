package com.Uber;

/*
Given an input string and ordering string, need to return true if the ordering string is present in Input string.

input = "hello world!"
ordering = "hlo!"
result = FALSE (all Ls are not before all Os)

input = "hello world!"
ordering = "!od"
result = FALSE (the input has '!' coming after 'o' and after 'd', but the pattern needs it to come before 'o' and 'd')

input = "hello world!"
ordering = "he!"
result = TRUE

input = "aaaabbbcccc"
ordering = "ac"
result = TRUE
 */

import java.util.HashMap;

public class StringOrders {

    HashMap<String, Integer> container = new HashMap<>();

    public static void main(String args[])
    {

        String input = "hello world!";

        String order = "!od";
        int lengthInput = input.length(), lengthOrder = order.length();
        StringOrders stringOrders =  new StringOrders();
        for(int index= 0; index<lengthInput ; index++)
        {
            stringOrders.positionNumbers(String.valueOf(input.charAt(index)),input, index );
        }

        System.out.println("this is the container: " + stringOrders.container );
        int isSmaller=0, isGreater=0;

        for(int indexOrder = 0; indexOrder< lengthOrder-1; indexOrder++ )
        {
            if (stringOrders.container.get(String.valueOf(order.charAt(indexOrder))) <
                    stringOrders.container.get(String.valueOf(order.charAt(indexOrder+1))))
            {
               // isSmaller=0;
                continue;
            }
            else
            {
                isGreater++;
                break;

            }
        }

        if(isGreater==0)
            System.out.println("the string is ture ");
        else
            System.out.println("the string is false ");

    }

    void positionNumbers(String inputCharacter, String input, int index)
    {
        if(container.size() ==0)
        {
            container.put(String.valueOf(inputCharacter), index );
        }
        else if(container.size() !=0 && container.containsKey(String.valueOf(inputCharacter)))
        {
            container.put(String.valueOf(inputCharacter), index);
        }
        else if (container.size() !=0 && !container.containsKey(String.valueOf(inputCharacter)))

            container.put(String.valueOf(inputCharacter), index);
    }
}
