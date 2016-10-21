package org.usc.edu.trees;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class SumPath {
	public boolean hasPathSum(TreeNode root, int sum) {
		Boolean flag = Boolean.FALSE;
		if (root == null) {
			flag = Boolean.FALSE;
			return flag;
		}
		if (root.left == null && root.right == null) {
			if (root.val == sum) {
				flag = Boolean.TRUE;
				return flag;
			} else {
				flag = Boolean.FALSE;
				return flag;
			}
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}

	}
}
