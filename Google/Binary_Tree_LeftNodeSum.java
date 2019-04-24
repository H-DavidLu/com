package com.Google;
/*



 */

public class Binary_Tree_LeftNodeSum
{


    public static void main(String args[])
    {

    }

    public int sumOfLeftLeaves(TreeNode root)
    {
        if(root==null) // if the root is null
        {
            return 0;
        }
        else if(root.left!=null && root.left.left == null && root.left.right == null)
        // if left child is not ull and left child has no its children and left child is a leave without right child
        {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        else
        {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }


    }

}


