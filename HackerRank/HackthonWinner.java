package com.HackerRank;

public class HackthonWinner
{

    public static String winner(String erica, String bob) {
        // Write your code here
        int sumErica = 0;
        int sumBob=0;

        for(int i= 0; i<erica.length() ; i++)
        {
            if (erica.charAt(i) == 'E')
                sumErica+=1;
            else if(erica.charAt(i) == 'M')
                sumErica+=3;
            else if(erica.charAt(i) == 'H')
                sumErica+=5;
        }

        for(int i= 0; i<bob.length() ; i++)
        {
            if (bob.charAt(i) == 'E')
                sumBob+=1;
            else if(bob.charAt(i) == 'M')
                sumBob+=3;
            else if(bob.charAt(i) == 'H')
                sumBob+=5;
        }

        if(sumBob==sumErica)
            return "Tie";
        else if (sumBob>sumErica)
            return "Bob";
        else  //(sumBob<sumErica)
            return "Erica";

    }


    public static void main(String[] args) {

        String erica= "E";
        String bob = "H";
        HackthonWinner H = new HackthonWinner();
        System.out.println( H.winner(erica,bob));

    }
}

/*
EHH
EME
Sample Output

Erica
Explanation

       Erica's          Bob's
Day    Diff    Score    Diff    Score
0        E        1       E        1
1        H        5       M        3
2        H        5       E        1
Total Scores     11                5

Erica wins.
 */
