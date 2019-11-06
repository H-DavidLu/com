package com.Amazon;

import java.util.ArrayList;

public class CheckPermuationISPalindrome
{

    static ArrayList<String> combinationList =  new ArrayList<>();
    static boolean toSwaps(char str[], int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (str[i] == str[curr]) {
                return false;
            }
        }
        return true;
    }

    // to print all possible distinct permutations in str[0. to.n-1]
    static void findAllPermutations(char str[], int index, int n) {
        if (index >= n) {
            //Permutation p =  new Permutation();
            CheckPermuationISPalindrome.combinationList.add(String.valueOf(str));
            System.out.println(str);

            return;
        }

        for (int i = index; i < n; i++)
        {
            boolean check = toSwaps(str, index, i);
            if (check) {
                swap(str, index, i);
                findAllPermutations(str, index + 1, n);
                swap(str, index, i);
            }
        }
    }

    static void swap(char[] str, int i, int j) {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }

    public static boolean checkPalindrome(String str) // string check
    {
        if(str.length()==1)
            return true;
        else if(str.length()==2)
        {
            if (str.charAt(0) == str.charAt(1))
                return true;
            else
                return false;
        }
        else if(str.length()%2==0)
        {
            if(checkEven(str) == true)
                return true;
            else
                return false;
        }
        else if(str.length()%2!=0)
        {
            if(checkOdd(str)== true)
                return true;
            else
                return false;
        }

        return false;
    }

    public static boolean checkOdd(String oddString)
    {
        int p=0;
        int counter=0;

        for(int i=0;i<oddString.length()/2;i++)
        {
            String a = String.valueOf(oddString.charAt(i));
            String t2 = String .valueOf(oddString.charAt(oddString.length()-1-p));

            if(a.equals(t2))
                p++;
            else {
                counter++;
                break;
            }
        }

        if(counter>0)
            return false;
        else {
            System.out.println("this is a palindrome.");
            return true;
        }
    }

    private static boolean checkEven(String evenString)
    {
        int p=0;
        int counter=0;

        for(int i=0;i<evenString.length()/2;i++)
        {
            String a = String.valueOf(evenString.charAt(i));
            String t2 = String .valueOf(evenString.charAt(evenString.length()-1-p));

            if(a.equals(t2))
                p++;
            else {
                counter++;
                break;
            }
        }

        if(counter>0)

            return false;
        else
            return true;
    }

    public static void main(String args[])
    {
        char[] str =  new String("carrace").toCharArray();
        int n = str.length;
        findAllPermutations(str, 0, n);

        for(int i= 0; i<combinationList.size() ; i++)
        {
            if( checkPalindrome(combinationList.get(i)) == true)
            {
                System.out.println(combinationList.get(i));
            }
        }
    }

}
