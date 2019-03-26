package com.Zillow;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree
{
    /*
    The first operation we’re going to cover is the insertion of new nodes.

First, we have to find the place where we want to add a new node in order
to keep the tree sorted. We’ll follow these rules starting from the root node:

if the new node’s value is lower than the current node’s, we go to the left child
if the new node’s value is greater than the current node’s, we go to the right child
when the current node is null, we’ve reached a leaf node and we can insert the new node in that position
First, we’ll create a recursive method to do the insertion:
     */

    /* :  this is the  Node class to use
    public class Node
{
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }


     */

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new Node(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */


        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
    }
}
