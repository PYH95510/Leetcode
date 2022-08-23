package practicing;

import javax.swing.tree.TreeNode;

public class SameTree100 {

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
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        
	        if (p == null && q == null) return true;// if both p and q are null then return null
	        
	        if (q == null || p == null) return false; //if either p or q, not both is null then return false. 
	        
	        
	        
	        if(p.val != q.val ) return false; //comparing root's val later on recursion, if p and q's val is not the same, return false.
	            
	            
	        
	        
	        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);//now let's do the recursion
	    }
	    
	    
	}

}
/*It is kind of very shamed of myself that sometimes, when I solve recursion problems that are integrated with other concept, I forgot very
 * basic concept of recursion which is that I do not need to use for or while loop when I call recursion until it gets base case to have recursive
 * and repeated calls. However, I forgot this kind of basic concept and spend times to set while loop because usually when we solve TreeNode problems
 * we usually integrate with while loops. Even if it is shamed of myself, I should admit my mistake to improve myself :). This is very basic combination
 * of tree and recursion. Here I just want to note one thing is that when we see the last line, if we write recursive line like this, it will beautifully
 * recurse all the tree node left and right so if we can remeber this, it will help us in the future !*/
