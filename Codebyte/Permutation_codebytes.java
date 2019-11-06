package com.Codebyte;
/*
  24=1 *2 *3 *4
 */
public class Permutation_codebytes
{
   public static int getPermutation(int num)
   {
       int total=1;
       if(num==0)
           return 1;
       if(num<0 || num>=19)
           return -1;
       else
       {
           for(int i= 2; i<=num ; i++)
           {
               total*=i;
           }
           return total;
       }

   }

    public static void main(String[] args) {

       int test = 8;
       System.out.println(getPermutation(8));

    }
}
