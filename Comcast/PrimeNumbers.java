package com.Comcast;


// this is to test the numbers of prime number with a given number:
// this is the test
public class PrimeNumbers
{

    //Prime prime;
    public static void main(String args[])
    {
      int given = 100;
      PrimeNumbers primeNumbers = new PrimeNumbers();

      Prime prime = new Prime();
      int counter = 0;

      for(int i=2; i<=given; i++)
      {

          if (prime.checkPrime(i) == true)
          {
              System.out.print(i + ", ");
              counter++;
          }
      }

      // Printl the number of prime number
        System.out.println();
        System.out.println("The number of prime number under " + given+ " is " + counter );
    }
}
