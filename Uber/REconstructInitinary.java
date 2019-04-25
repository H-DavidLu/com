package com.Uber;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given a list of airline tickets represented by pairs of departure and arrival airports [from, to],
reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus,
the itinerary must begin with JFK.

Note:

If there are multiple valid itineraries, you should return the itinerary that
 has the smallest lexical order when read as a single string. For example,
 the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
All airports are represented by three capital letters (IATA code).
You may assume all tickets form at least one valid itinerary.
Example 1:

Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
Example 2:

Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
             But it is larger in lexical order.
 */
public class REconstructInitinary
{
    int startJFK_No = 0;
    int startJFK_i = 0;
    int startJFK_j = 0;
    ArrayList<Integer> destinations =  new ArrayList<>();
    ArrayList<Integer> positionJFK = new ArrayList<>();
    ArrayList<Integer> initenaryList =  new ArrayList<>();
    ArrayList<Integer> positionsAll = new ArrayList<>();
    HashMap<Integer, Integer> jfk = new HashMap<>();
    ArrayList<String> fianlInitinary =  new ArrayList<>();


    public static void main(String args[])
    {
      //Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
        String[][] tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        REconstructInitinary rEconstructInitinary = new REconstructInitinary();

        for(int i= 0; i<tickets.length ; i++)
        {
            if(tickets[i][0].contains("JFK"))
            {
                rEconstructInitinary.positionJFK.add(i);
                rEconstructInitinary.positionsAll.add(i);
                System.out.println("This is the adding the position of JFK:" + rEconstructInitinary.positionJFK);
            }
        }

        if(rEconstructInitinary.positionJFK.size()==1)
        {
            //Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
            rEconstructInitinary.checkJFK_OnlyJFK(rEconstructInitinary.positionJFK.get(0), tickets);
        }
        else
        {


        }

        //
        for(int i= 0; i< rEconstructInitinary.positionsAll.size() ; i++)
        {
            if(i==0)
            {
                String first = tickets[rEconstructInitinary.positionsAll.get(i)][0];
                rEconstructInitinary.fianlInitinary.add("["+first+"]");
            }
            else if(i!= rEconstructInitinary.positionsAll.size()-1)
            {
                String laterOnes = tickets[rEconstructInitinary.positionsAll.get(i)][0];
                rEconstructInitinary.fianlInitinary.add("["+laterOnes+"]");
            }
            else
            {
                String laterFirst = tickets[rEconstructInitinary.positionsAll.get(i)][0]  ;
                String laterSecond = tickets[rEconstructInitinary.positionsAll.get(i)][1] ;
                rEconstructInitinary.fianlInitinary.add("["+laterFirst+"]");
                rEconstructInitinary.fianlInitinary.add("["+laterSecond+"]");
            }
        }

        System.out.println("This is the final list:" + rEconstructInitinary.fianlInitinary );

    }

    void checkJFK_OnlyJFK(int positionJFK, String[][] tickets)
    {
        for(int i= 0; i<tickets.length ; i++)
        {
            if((positionJFK != i) && ( tickets[positionJFK][1].contains(tickets[i][0])))
            {
                 positionsAll.add(i);
                checkJFK_OnlyJFK(i,tickets);
            }
        }
    }
}
