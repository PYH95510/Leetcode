package practicing;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree226 {

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
	    public TreeNode invertTree(TreeNode root) {
	        
	        if(root == null){
	            return null;
	        }
	        
	        final Queue<TreeNode> que = new LinkedList<>();
	        que.offer(root);
	        
	        while(!que.isEmpty()){
	            TreeNode node = que.poll(); //root is inside
	            TreeNode tmtleft = node.left; // left is inside now
	            node.left = node.right; //node's left and right is changed
	            node.right = tmtleft; // tmt left is assigned to right
	            
	            if (node.left !=null){
	                que.offer(node.left); //adding node's left to queue, offer is prefer to add because it returns boolean if it qualifies the sizes
	            }
	            
	            if(node.right !=null){
	                que.offer(node.right); //adding node's right to queue
	            }
	        }
	        
	        return root;
	    }
	    
	  
	    
	    
	}

}
/*This time, I tried to use queue because as I remembered, I have not actually used queue since after I have learned it from my data structure
 * class. For those who forgot about Queue structure, opposite to stack (which is Java's memory structure) queue is so called FIFO (First-in-first-out)
 * so if you come first, you served first. As soon as I saw this problem, I came up with the queue. However, I hesitated to try it because I was
 * not pretty sure that I am capable of. So I looked up the solution of https://leetcode.com/problems/invert-binary-tree/discuss/62707/Straightforward-DFS-recursive-iterative-BFS-solutions 
 * This helped me a lot to understand how to code using queues.*/
