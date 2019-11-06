package com.Karat;

/*
// Suppose we have some input data describing a graph of relationships
between parents and children over multiple generations.
 The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

// For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:

// 1   2   4
//  \ /   / \
//   3   5   8
//    \ / \   \
//     6   7   10

// Write a function that takes this data as input and returns two collections: one containing
all individuals with zero known parents, and one containing all individuals with exactly one known parent.

// Sample input/output (pseudodata):

// parentChildPairs = [
//     (1, 3), (2, 3), (3, 6), (5, 6),
//     (5, 7), (4, 5), (4, 8), (8, 10)
// ]

// findNodesWithZeroAndOneParents(parentChildPairs) => [
//   [1, 2, 4],    // Individuals with zero parents
//   [5, 7, 8, 10] // Individuals with exactly one parent
// ]

 */

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class OnlyOneParent {

    ArrayList<Integer> childList =  new ArrayList<>();
    ArrayList<Integer> parentList =  new ArrayList<>();
    TreeSet<Integer> noParentSet = new TreeSet<>();
    TreeSet<Integer> noChildSet =  new TreeSet<>();
     TreeSet<Integer> childSet =  new TreeSet<>();
    TreeSet<Integer> parentSet =  new TreeSet<>();
    HashMap<Integer, Integer> childMap = new HashMap<>();
    HashMap<Integer, Integer> parentMap =  new HashMap<>();

    public static void main(String args[])
    {


        int[][] parentChildPairs = new int[][]
                {
                        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
                        {4, 5}, {4, 8}, {8, 10}
                };
        OnlyOneParent onlyOneParent = new OnlyOneParent();
        onlyOneParent.findNodesWithZeroAndOneParents(parentChildPairs);
        System.out.println("child map: "+ onlyOneParent.childMap );
        System.out.println("child set: " +onlyOneParent.childSet );
        System.out.println("child list: " +onlyOneParent.childList );

        System.out.println("parent map: "+ onlyOneParent.parentMap );
        System.out.println("parent set: " +onlyOneParent.parentSet );
        System.out.println("parent list: " +onlyOneParent.parentList );

       // System.out.println( onlyOneParent.c);


    }


    void findNodesWithZeroAndOneParents(int[][] parentChildPairs)
    {
        // first: add the elements to the parent map
        for(int i = 0; i< parentChildPairs.length; i++)
        {

            if(parentMap.size()== 0)
            {
                parentMap.put(parentChildPairs[i][0], 1);
                parentSet.add(parentChildPairs[i][0]);
                parentList.add(parentChildPairs[i][0]);


            }
            else if(parentMap.containsKey(parentChildPairs[i][0]))
            {

                parentMap.put(parentChildPairs[i][0], parentMap.get(parentChildPairs[i][0]+1) );
                parentSet.add(parentChildPairs[i][0]);
                parentList.add(parentChildPairs[i][0]);
            }
            else

            {
                parentMap.put(parentChildPairs[i][0], parentMap.get(parentChildPairs[i][0]+1) );
                parentSet.add(parentChildPairs[i][0]);
                parentList.add(parentChildPairs[i][0]);

            }

        }

        // second : children map here:

        for(int i = 0; i< parentChildPairs.length; i++)
        {

            if(childMap.size()== 0)
            {
                childMap.put(parentChildPairs[i][1], 1);
                childList.add(parentChildPairs[i][1]);
                childSet.add(parentChildPairs[i][1]);

            }
            else if(childMap.containsKey(parentChildPairs[i][1]))
            {
                childMap.put(parentChildPairs[i][1], childMap.get(parentChildPairs[i][1]+1) );
                childSet.add(parentChildPairs[i][1]);
                childList.add(parentChildPairs[i][1]);
            }
            else
            {
                childMap.put(parentChildPairs[i][1], childMap.get(parentChildPairs[i][1]+1) );
                childSet.add(parentChildPairs[i][1]);
                childList.add(parentChildPairs[i][1]);
            }

        }

        Object[]  obj = parentSet.toArray();
        childList.clear();
        Integer[] tochildArray = parentSet.toArray(new Integer[parentSet.size()]);
        for(int i= 0; i<tochildArray.length ; i++)
        {
          childList.add(tochildArray[i]);
        }









        // calculate the NoParent Elements
    }





}
