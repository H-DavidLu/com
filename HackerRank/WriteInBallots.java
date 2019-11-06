package com.HackerRank;
/*
Given an array of names of candidates in an election.
A candidate name in array represents a vote casted to the candidate.
 Print the name of candidates received Max vote. If there is tie, print lexicographically smaller name.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WriteInBallots
{

    private String toCheckBallots(String[] ballots)
    {
        HashMap<String, Integer> ballotMap =  new HashMap<>();
        for(int i= 0; i<ballots.length ; i++)
        {
           if(ballotMap.size()==0 && i==0)
           {
               ballotMap.put(ballots[i], 1);

           }
           else if(ballotMap.size()!=0 && ballotMap.containsKey(ballots[i]))
               ballotMap.put(ballots[i], ballotMap.get(ballots[i])+1);
           else if(ballotMap.size()!=0 && !ballotMap.containsKey(ballots[i]))
           {
               ballotMap.put(ballots[i], 1);
           }

        }

        Set<Map.Entry<String, Integer>> bMap = ballotMap.entrySet();
         String temp = "";
         int[] frequency = new int[ballotMap.size()];
         //
         for(Map.Entry<String, Integer> entry: bMap)
         {

         }
    return "STOP!";

    }

    public static void main(String[] args) {

        String[] ballots = {"john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};

        WriteInBallots W = new WriteInBallots();



    }
}
