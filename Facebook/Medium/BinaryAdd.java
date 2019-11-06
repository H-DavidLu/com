package com.Facebook.Medium;

import java.math.BigInteger;

public class BinaryAdd {

    public String addBinary(String a, String b)
    {
        try {
            String string = "";
            long one = Long.parseLong(a, 2);
            long two = Long.parseLong(b, 2);
            long total = one + two;
            long remainers = 0L;
            String appended = "";

            if (total==0) {

                return "0";

            }
            else if(total==1)
            {
                return "1";

            }
            else {
                while (total / 2 > 0) {
                    remainers = total % 2;
                    total = total / 2;
                    appended = remainers + appended;
                    if (total < 2) {
                        appended = total + appended;
                        string = appended;
                        break;
                    }
                }

                return string;
            }
        }
        catch(NumberFormatException e) {
            System.out.print("Type a Number, Not String");
        }

        return "false";
    }


    public static void main(String[] args) {

        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        /*
        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
         */
        BinaryAdd B = new BinaryAdd();
        System.out.println(B.addBinary(a,b));
    }
}
