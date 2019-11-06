package com.Amazon.Medium;
/*

https://leetcode.com/interview/1/


Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

 */


public class ValidateBracets
{
    public boolean isValid(String s)
    {
        char[] signs = s.toCharArray();
        int flag=0;

        if(s.length()==1)
            return false;
        else {
            for (int i = 0; i < signs.length - 1; i++) {
                if (signs[i] == '(') {
                    if (signs[i + 1] == ')')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '{')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '[')
                    {
                        i++;
                        continue;
                    }
                    else {

                        flag++;
                        return false;
                    }
                } else if (signs[i] == '{') {
                    if (signs[i + 1] == '}')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '(')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '[')
                    {
                        i++;
                        continue;
                    }
                    else {
                        flag++;
                        return false;

                    }
                }
                else if (signs[i] == '[')
                {
                    if (signs[i + 1] == ']')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '{')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '(')
                    {
                        i++;
                        continue;
                    }
                    else {
                        flag++;
                        return false;

                    }
                }
                else if (signs[i] == ')')
                {
                    if (signs[i + 1] == ']')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == '}')
                    {
                        i++;
                        continue;
                    }
                    else {
                        flag++;
                        return false;

                    }
                }
                else if (signs[i] == '}')
                {
                    if (signs[i + 1] == ']')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == ')')
                    {
                        i++;
                        continue;
                    }
                    else {
                        flag++;
                        return false;

                    }
                }
                else if (signs[i] == ']')
                {
                    if (signs[i + 1] == '}')
                    {
                        i++;
                        continue;
                    }
                    else if (signs[i + 1] == ')')
                    {
                        i++;
                        continue;
                    }
                    else {
                        flag++;
                        return false;

                    }
                }
            }
            if (flag == 0)
                return true;
            else return false;
        }

    }

    public static void main(String[] args) {
        String s = "([)]";
        ValidateBracets V =  new ValidateBracets();
        System.out.println(V.isValid(s));
    }
}
