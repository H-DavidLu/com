package com.Google;
/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process:
 Starting with any positive integer, replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1



1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86,
 91, 94, 97, 100, 103, 109, 129, 130, 133, 139, 167, 176, 188,
 190, 192, 193, 203, 208, 219, 226, 230, 236, 239, 262, 263, 280,
  291, 293, 301, 302, 310, 313, 319, 320, 326, 329, 331, 338, 356,
  362, 365, 367, 368, 376, 379, 383, 386, 391, 392, 397, 404, 409, 440,
  446, 464, 469, 478, 487, 490, 496, 536, 556, 563, 565, 566, 608, 617, 622, 623, 632, 635,
  637, 638, 644, 649, 653, 655, 656, 665, 671, 673, 680, 683, 694, 700, 709, 716, 736, 739,
  748, 761, 763, 784, 790, 793, 802, 806, 818, 820, 833, 836, 847, 860, 863, 874, 881, 888, 899,
  901, 904, 907, 910, 912, 913, 921, 923, 931, 932, 937, 940, 946, 964, 970, 973, 989, 998, 1000

 ex:  4 --> 16 --> 37 --> 58 --> 89-->145-->42-->20-->4




 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {


    Set<Integer> sum = new HashSet<>();

    boolean checkHappyNums(int test)
    {
        if(test==1 || test==100)
            return true;

                int[] intTab = String.valueOf(test).chars().map(Character::getNumericValue).toArray();
                int total = 0;
                for (int i = 0; i < intTab.length; i++) {
                    total += intTab[i] * intTab[i];
                }

                if (total == 1 || total==100)
                    return true;
                else if (sum.size()==0){
                    sum.add(total);
                    return checkHappyNums(total);
                }
                else if(sum.contains(total))
                    return  false;
                else if(sum.size()!=0 || !sum.contains(total))
                {

                    return checkHappyNums(total);
                }
                return true;

    }

    public static void main(String[] args)
    {
        int test = 3;
        HappyNumbers h =  new HappyNumbers();
         System.out.println( "Is this a Happy Number: "+ h.checkHappyNums(test));
    }
}
