package practicing;

public class HouseRobberIII337 {

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
	    public int[] helper(TreeNode node) {
	       if(node == null)return new int [] {0,0}; //reaching to base case.
	    
	       int left[] = helper(node.left);
	       int right[] = helper(node.right);
	       
	       int rob = node.val + left[1] + right[1]; //we will setting array[1] to not robbed values
	       int notrobbed = Math.max(left[0],left[1])+Math.max(right[0], right[1]);
	       
	       return new int [] {rob, notrobbed};
	       
	       
	    }
	    
	    
	    public int rob(TreeNode root) {
	    	int [] answer = helper(root);
	    	return Math.max(answer[0], answer[1]);
	    }

	   
	}

}

/*This problem could be solved using recursion. First recurse left node until it reaches the base case. If it reaches the base case, we assumes we rob
 * the node. If we rob that node, we go back to previous node and check the right node. If there is, we check the right base node as well. Because we
 * assign rob node's value to [0]'s array and from next recursive sequence, we add array's [1]'s value and node's current value, we could add current
 * cell's value and then not robbed value. Also, we could compare not robbed value relatively freely because if we did not rob current node, we could
 * add either previous node or current node whichever is bigger.*/
