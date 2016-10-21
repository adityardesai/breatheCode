package org.usc.edu.trees;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeSame {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Boolean flag = Boolean.FALSE;
        if(p==null &&  q==null){
            flag = Boolean.TRUE;
            return flag;
        }
       else if((p!=null && q==null) || (p==null &&q!=null)){
            flag = Boolean.FALSE;
            return flag;
        }
       else if((p.val == q.val)){
           if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
           flag = Boolean.TRUE;
           return flag;
       }
       return flag;
    }
}