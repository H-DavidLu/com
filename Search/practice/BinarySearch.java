package com.Search.practice;

public class BinarySearch
{
    public static void main(String args[])
    {
      int[] test = {2,6,8,9,10,22,33,55,89,100};

      BinarySearch binarySearch = new BinarySearch();
      binarySearch.Search(test, 10);

    }
    static void Search(int[] test, int num)
    {
        System.out.println(Search(test, 10 , 0 , test.length));

    }

    static int Search(int[] test2, int num, int left, int right)
    {
        int middle = (left+right)/2;
        if(test2[middle]== num)
            return num;
        else if(test2[middle]< num)
            return Search(test2,num,middle+1,right);
        else
            return Search(test2, num, left, middle-1);
    }


}
