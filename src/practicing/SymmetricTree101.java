package practicing;

public class SymmetricTree101 {

	
	  
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
	 
	//we can iterate differently

	class Solution {
	    public boolean isSymmetric(TreeNode root) {
	        if(root == null) return true ;
	        
	        return isSymmetric(root.left,root.right);
	    }
	    
	    public boolean isSymmetric(TreeNode left , TreeNode right){
	        if (left == null && right == null) return true; // both are null or reached to the end
	        
	        if (left == null || right == null) return false; //not symettric
	        
	        if (left.val != right.val) return false;
	        
	       
	       
	        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	        // this is sort of important, this means we are going to check every time that these two are wheter true or first from left recursion to right recursion
	        
	    }
	   
	    
	}
}
/*This is recursive solution for symmetric tree. It is pretty easy to solve and I did it by myself. The last return part is sort of important to understand
 * but once you understand the meaning of it, it is fairly easy.*/
 