package practicing;

public class MaximumDepthofBinaryTree104 {

	
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	  }
	 
	
	class Solution {
	    public int maxDepth(TreeNode root) {
	        int max = 0;
	        
	        if(root == null) return max;
	        
	        
	        int right = maxDepth(root.right);
	        int left = maxDepth(root.left);
	        
	        return Math.max(left, right)+1;
	    }
	}

}
/*Finding max depth using recursion. My basic concept so far regarding recursion was wrong. Not technically wrong but I was worried about if
 * I initialize new variable at the beginning of recursive processes, it will re initialize the whole variable. However, it was so wrong and
 * I knew that it wouldn't work that way but I hesitate to do so.*/
