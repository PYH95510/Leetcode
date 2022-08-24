package practicing;

import javax.swing.tree.TreeNode;

public class RangeSumOfBST938 {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    public int rangeSumBST(TreeNode root, int low, int high) {
	        
	        if(root==null){
	            return 0;
	        }
	        
	        
	        int result = 0;
	        
	        
	      
	        if(root.val >= low && root.val <= high)result += root.val;
	        /*if we add two more conditions, we could accelerate algorithm's speed way faster.
	        For example, if(root.val >low)result+=rangeSumBST(root.left,low,high);
	        if(root.val<high)result+=rangeSumBST(root.right,low,high) because it is binary tree, we just need to compare bigger node value with the right side, and smaller value with the left side. and if the node's value is not in the range of low and high, we do not need to put it in the recursion in the first place and thus so, we could speed up the algorithm*/ 
	        if(root.val>low)result+=rangeSumBST(root.left,low,high);
	        if(root.val<high)result+=rangeSumBST(root.right,low,high);
	        
	        result += rangeSumBST(root.left, low, high);
	        result += rangeSumBST(root.right, low, high);
	        
	        
	        return result;
	        
	    }
	}

}
/*I am trying to work on strings and trees, window sliding, BFS, DFS because I think these are types that I could forget easily. This is pretty much
 * the most basic problem of tree + BFS problem. and if there is a little bit of idea, we could more optimize the algorithm. */
 