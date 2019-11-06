package com.Google;

public class StroProgrammic
{

    public static void main(String args[])
    {

        String test = "6699";
        StroProgrammic stroProgrammic =  new StroProgrammic();
        System.out.println(stroProgrammic.isStrobogrammatic(test));

    }

    public boolean isStrobogrammatic(String num) {
        int length = num.length();
        int match = 0;

        if (num.isEmpty() || num.length() == 0 || num.length() == 1) {
            return false;

        } else if (num.length() == 2) {
            if (
                    (String.valueOf(num.charAt(0)).equals("0") ||
                            String.valueOf(num.charAt(0)).equals("1") ||
                           /// String.valueOf(num.charAt(0)).equals("6") ||
                          //  String.valueOf(num.charAt(0)).equals("9") ||
                            String.valueOf(num.charAt(0)).equals("8")) &&
                            (
                                    String.valueOf(num.charAt(1)).equals("0") ||
                                            String.valueOf(num.charAt(1)).equals("1") ||
                                         //   String.valueOf(num.charAt(1)).equals("6") ||
                                         //   String.valueOf(num.charAt(1)).equals("8") ||
                                            String.valueOf(num.charAt(1)).equals("9")
                            )
            ) {
                return true;
            } else
                return false;

          } else if (length % 2 == 0)  // even number length
        {
            //69 69 69
            for (int i = 0; i < length / 2; i++)
            {
                if ((
                        String.valueOf(num.charAt(i)).equals("0") ||
                                String.valueOf(num.charAt(i)).equals("1") ||
                                String.valueOf(num.charAt(i)).equals("6") ||
                                String.valueOf(num.charAt(i)).equals("9") ||
                                String.valueOf(num.charAt(i)).equals("8")) &&
                        (
                                String.valueOf(num.charAt(num.length()- 1 - i)).equals("0") ||
                                        String.valueOf(num.charAt(num.length()- 1 - i)).equals("1") ||
                                        String.valueOf(num.charAt(num.length()- 1 - i)).equals("6") ||
                                        String.valueOf(num.charAt(num.length()- 1 - i)).equals("8") ||
                                        String.valueOf(num.charAt(num.length()- 1 - i)).equals("9"))
                ) {
                    continue;
                }

                else
                    return false;
            }


        } else if (length % 2 != 0) // odd number length
        {
            int lengthAfter = length / 2;

            for (int i = 0; i < lengthAfter; i++) {
                if ((
                        Integer.valueOf(num.charAt(i)).equals(0) ||
                                Integer.valueOf(num.charAt(i)).equals(1) ||
                                Integer.valueOf(num.charAt(i)).equals(6) ||
                                Integer.valueOf(num.charAt(i)).equals(9) ||
                                Integer.valueOf(num.charAt(i)).equals(8)) &&
                        (
                                Integer.valueOf(num.charAt((num.length() / 2)) - 1 - i).equals(0) ||
                                        Integer.valueOf(num.charAt((num.length() / 2)) - 1 - i).equals(1) ||
                                        Integer.valueOf(num.charAt((num.length() / 2)) - 1 - i).equals(6) ||
                                        Integer.valueOf(num.charAt((num.length() / 2)) - 1 - i).equals(8) ||
                                        Integer.valueOf(num.charAt((num.length() / 2)) - 1 - i).equals(9)) &&
                        (Integer.valueOf(num.charAt((int) lengthAfter)).equals(0) ||
                                Integer.valueOf(num.charAt((int) lengthAfter)).equals(1) ||
                                Integer.valueOf(num.charAt((int) lengthAfter)).equals(8)
                        )

                ) {
                    return true;
                } else
                    return false;
            }
        }

        return false;
    }
}
