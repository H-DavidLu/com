package com.Facebook.Hard;
/*
NOt yet done

https://leetcode.com/problems/integer-to-english-words/submissions/
 */

import java.util.HashMap;

class NunbersToWords
{
    String finalWords = "";
    HashMap<Integer, String> onesMap =  new HashMap<>();
    HashMap<Integer, String> tensMap = new HashMap<>();
    HashMap<Integer, String> tenTonintyMap = new HashMap<>();
    int flagZeros = 0;

    public String numberToWords(int num)
    {
        if(num> 2147483647 || num <-2147483648)
            return "out of ranges";

        else {
            onesMap.put(0, "Zero");
            onesMap.put(1, "One");
            onesMap.put(2, "Two");
            onesMap.put(3, "Three");
            onesMap.put(4, "Four");
            onesMap.put(5, "Five");
            onesMap.put(6, "Six");
            onesMap.put(7, "Seven");
            onesMap.put(8, "Eight");
            onesMap.put(9, "Nine");
            tensMap.put(11, "Eleven");
            tensMap.put(12, "Twelve");
            tensMap.put(13, "Thirteen");
            tensMap.put(14, "Fourteen");
            tensMap.put(15, "Fifteen");
            tensMap.put(16, "Sixteen");
            tensMap.put(17, "Seventeen");
            tensMap.put(18, "Eighteen");
            tensMap.put(19, "Nineteen");
            tenTonintyMap.put(1, "Ten");
            tenTonintyMap.put(2, "Twenty");
            tenTonintyMap.put(3, "Thirty");
            tenTonintyMap.put(4, "Forty");
            tenTonintyMap.put(5, "Fifty");
            tenTonintyMap.put(6, "Sixty");
            tenTonintyMap.put(7, "Seventy");
            tenTonintyMap.put(8, "Eighty");
            tenTonintyMap.put(9, "Ninety");

            int[] digits = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
            int length = digits.length;
            int zone = length / 3;
            int remainers = length % 3;
            for(int i= 1; i<digits.length; i++)
            {
                if(digits[i]==0)
                    flagZeros++;
            }

            if(remainers==0)
                getWords(zone, remainers, 0, 2   ,
                        digits[0], digits[1], digits[2], digits);
            else if(remainers==1)
                getWords(zone, remainers, 0,    0,
                        0, 0, digits[0], digits);
            else if(remainers==2)
                getWords(zone, remainers, 0, remainers-1   ,
                        0, digits[0], digits[1], digits);
            //int zoneTh, int remainers,  int left, int middle, int right, int[] current
            return finalWords;
        }
    }

    public void getWords(int zoneTh, int remainers, int startIndex, int endIndex,
                         int left, int middle, int right, int[] current)
    {
        //-2,147,483,648
        if(remainers!=0 && zoneTh>=1)
        {
            zoneTh=zoneTh+1;
        }
        else if(remainers==0)
            zoneTh=zoneTh;
        else if(remainers!=0 && zoneTh==0)
        {
            zoneTh=zoneTh+1;
        }

        if(zoneTh==4) {
            zoneBillion(zoneTh, remainers, startIndex, endIndex, left, middle, right, current);
        }
        else if(zoneTh==3) {
            zoneMillion(zoneTh, remainers, startIndex, endIndex, left, middle, right, current);
        }
        else if(zoneTh==2 ) {
            zoneThousandHundred(zoneTh, remainers, startIndex, endIndex, left, middle, right, current);
        }
        else  if( zoneTh==1) {
            zoneHundred(left, middle, right, current);
        }
    }

    boolean checkAfterZero(int zone, int[] current)
    {
        if(zone==4) //billion
        {
            int numberZero=0;
            for(int i= current.length-1; i>=current.length-9 ; i--)
            {
                if(current[i]==0)
                {
                    numberZero++;
                }
            }
            if(numberZero==9)
                return true;
            else
                return false;
        }
        else if(zone==3)
        {
            int numberZero=0;
            for(int i= current.length-1; i>=current.length-6 ; i--)
            {
                if(current[i]==0)
                {
                    numberZero++;
                }
            }
            if(numberZero==6)
                return true;
            else
                return false;
        }
        else if(zone==2)
        {
            int numberZero=0;
            for(int i= current.length-1; i>=current.length-3 ; i--)
            {
                if(current[i]==0)
                {
                    numberZero++;
                }
            }
            if(numberZero==3)
                return true;
            else
                return false;
        }


        return false;
    }

    public void zoneHundred(int left, int middle, int right, int[] current)
    {
        if(left!=0 && middle!=0 && right !=0)
        {
            String total1 = String.valueOf(middle)+ String.valueOf(right);
            int total = Integer.valueOf(total1);
            if(total>=11 && total<=19)
            {
                finalWords += onesMap.get(left) + " Hundred " +  tensMap.get(total) ;
            }
            else if(total >=21)
            {
                finalWords +=  onesMap.get(left) + " Hundred " + tenTonintyMap.get(middle) + " "
                        +onesMap.get(right);
            }
        }
        else if(left==0 && middle==0 && right ==0)
        {
            if(current.length<=3)
            {
                finalWords="Zero";
            }
        }
        else if(  left!=0 && middle==0 && right !=0)
        {
            finalWords += onesMap.get((int) left) + " Hundred "
                    + onesMap.get(right);
        }
        else if(left!=0 && middle==0 && right ==0)
        {
            finalWords += onesMap.get((int) left) + " Hundred";
        }
        else if(left==0 && middle!=0 && right !=0)
        {
            String total1 = String.valueOf(middle)+ String.valueOf(right);
            int total = Integer.valueOf(total1);
            if(total>=11 && total<=19)
            {
                finalWords += tensMap.get(total) ;
            }
            else if(total >=21)
            {
                finalWords += tenTonintyMap.get(middle) + " " + onesMap.get(right);
            }
        }
        else if(left==0 && middle!=0 && right ==0)
        {
            if(current.length==2)
                finalWords += tenTonintyMap.get(middle);
            else
                finalWords += tenTonintyMap.get(middle);
        }
        else if(left==0 && middle==0 && right !=0)
        {
            if(current.length==1)
                finalWords += onesMap.get(right);
            else
                finalWords += onesMap.get(right);
        }
        else if(left!=0 && middle!=0 && right ==0)
        {
            finalWords += onesMap.get(left)+ " Hundred " + tenTonintyMap.get(middle);
        }
    }

    public void zoneThousandHundred(int zone, int remainers, int startIndex, int endIndex,
                                    int left, int middle, int right, int[] current) {
        if (checkAfterZero(zone,current))
        {
            if (left != 0 && middle != 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + tenTonintyMap.get(middle) + " "
                        + onesMap.get(right)
                        + " Thousand";
            }
            else if (left != 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Thousand "
                        + onesMap.get(right);
            } else if (left != 0 && middle == 0 && right == 0) {
                finalWords += onesMap.get((int) left) + " Hundred Thousand";
            } else if (left == 0 && middle != 0 && right != 0) {
                String total1 = String.valueOf(middle) + String.valueOf(right);
                int total = Integer.valueOf(total1);
                if (total >= 11 && total <= 19) {
                    finalWords += tensMap.get(total) + " Thousand";
                } else if (total >= 21) {
                    finalWords += tenTonintyMap.get(middle) + onesMap.get(right) + " Thousand";
                }
            } else if (left == 0 && middle != 0 && right == 0) {
                finalWords += tenTonintyMap.get(middle) + " Thousand";
            } else if (left == 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get(right) + " Thousand";
            } else if (left != 0 && middle != 0 && right == 0) {
                finalWords += onesMap.get(left) + " Hundread " + tenTonintyMap.get(middle) + " Thansound";
            }

            zone = zone - 1;
            remainers = 0;
            int nextStartIndex = endIndex + 1;
            int nextEndIndex = endIndex + 3;
            int nextLeft = current[nextStartIndex];
            int nextMiddle = current[nextStartIndex+1];
            int nextRight = current[nextStartIndex+2];
            zoneHundred(nextLeft, nextMiddle, nextRight, current);

        }
        else {
            if (left != 0 && middle != 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + tenTonintyMap.get(middle) + " "
                        + onesMap.get(right)
                        + " Thousand ";
            } else if (left == 0 && middle == 0 && right == 0) {
                finalWords += " ";

            } else if (left != 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + onesMap.get(right) + " Thousand ";
            } else if (left != 0 && middle == 0 && right == 0) {
                finalWords += onesMap.get((int) left) + " Hundred Thousand ";
            } else if (left == 0 && middle != 0 && right != 0) {
                String total1 = String.valueOf(middle) + String.valueOf(right);
                int total = Integer.valueOf(total1);
                if (total >= 11 && total <= 19) {
                    finalWords += tensMap.get(total) + " Thousand ";
                } else if (total >= 21) {
                    finalWords += tenTonintyMap.get(middle) + " "+ onesMap.get(right) + " Thousand ";
                }
            } else if (left == 0 && middle != 0 && right == 0) {
                finalWords += tenTonintyMap.get(middle) + " Thousand ";
            } else if (left == 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get(right) + " Thousand ";
            } else if (left != 0 && middle != 0 && right == 0) {
                finalWords += onesMap.get(left) + " Hundread " + tenTonintyMap.get(middle) + " Thansound ";
            }

            zone = zone - 1;
            remainers = 0;
            int nextStartIndex = endIndex + 1;
            int nextEndIndex = endIndex + 3;
            int nextLeft = current[nextStartIndex];
            int nextMiddle = current[nextStartIndex+1];
            int nextRight = current[nextStartIndex+2];
            zoneHundred(nextLeft, nextMiddle, nextRight,current);
        }
    }

    public void zoneMillion(int zone, int remainers, int startIndex, int endIndex,
                            int left, int middle, int right, int[] current)
    {
        if (checkAfterZero(zone, current))
        {
            if (left != 0 && middle != 0 && right != 0)
            {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + tenTonintyMap.get(middle) + " "
                        + onesMap.get(right)
                        + " Million";
            }
            else if (left != 0 && middle == 0 && right != 0)
            {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + onesMap.get(right)+ " Million";
            }
            else if (left != 0 && middle == 0 && right == 0)
            {
                finalWords += onesMap.get((int) left) + " Hundred Million";
            }
            else if (left == 0 && middle != 0 && right != 0) {

                String total1 = String.valueOf(middle) + String.valueOf(right);
                int total = Integer.valueOf(total1);
                if (total >= 11 && total <= 19) {
                    finalWords += tensMap.get(total) + " Million";
                } else if (total >= 21) {
                    finalWords += tenTonintyMap.get(middle) + onesMap.get(right) + " Million";
                }
            } else if (left == 0 && middle != 0 && right == 0) {
                finalWords += tenTonintyMap.get(middle) + " Million";
            } else if (left == 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get(right) + " Million";
            } else if (left != 0 && middle != 0 && right == 0) {
                finalWords += onesMap.get(left) + " Hundread " + tenTonintyMap.get(middle) + " Million ";
            }
        }
        else {

            if (left != 0 && middle != 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Hundred "
                        + tenTonintyMap.get(middle) + " "
                        + onesMap.get(right)
                        + " Million ";
            } else if (left == 0 && middle == 0 && right == 0) {
                finalWords += " ";

            } else if (left != 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get((int) left) + " Million "
                        + onesMap.get(right);
            } else if (left != 0 && middle == 0 && right == 0) {
                finalWords += onesMap.get((int) left) + "Hundred Million ";
            } else if (left == 0 && middle != 0 && right != 0) {

                String total1 = String.valueOf(middle) + String.valueOf(right);
                int total = Integer.valueOf(total1);
                if (total >= 11 && total <= 19) {
                    finalWords += tensMap.get(total) + " Million ";
                } else if (total >= 21) {
                    finalWords += tenTonintyMap.get(middle) + onesMap.get(right) + " Million ";
                }
            } else if (left == 0 && middle != 0 && right == 0) {
                finalWords += tenTonintyMap.get(middle) + " Million ";
            } else if (left == 0 && middle == 0 && right != 0) {
                finalWords += onesMap.get(right) + " Million ";
            } else if (left != 0 && middle != 0 && right == 0) {
                finalWords += onesMap.get(left) + " Hundread " + tenTonintyMap.get(middle) + " Million ";
            }

            zone = zone - 1;
            remainers = 0;
            int nextStartIndex = endIndex + 1;
            int nextEndIndex = endIndex + 3;
            int nextLeft = current[nextStartIndex];
            int nextMiddle = current[nextStartIndex+1];
            int nextRight = current[nextStartIndex+2];
            zoneThousandHundred(zone, remainers, nextStartIndex, nextEndIndex, nextLeft, nextMiddle, nextRight, current);
        }
    }

    public void zoneBillion(int zone, int remainers, int startIndex, int endIndex,
                            int left, int seocnd, int right, int[] current)
    {

        if(flagZeros== current.length-1) {
            finalWords += onesMap.get(remainers) + " Billion";
        }
        else {
            finalWords += onesMap.get(remainers) + " Billion ";

            zone = zone - 1;
            remainers = 0;
            int nextStartIndex = endIndex + 1;
            int nextEndIndex = endIndex + 3;
            int nextLeft = current[nextStartIndex];
            int nextMiddle = current[nextStartIndex+1];
            int nextRight = current[nextStartIndex+2];
            zoneMillion(zone, 0, nextStartIndex, nextEndIndex, nextLeft, nextMiddle, nextRight, current);
        }
    }

    public static void main(String[] args) {
        int num = 1000010; //2,147,483,647
        NunbersToWords N = new NunbersToWords();
        System.out.println(num);
        System.out.println(N.numberToWords(num));
    }
}
