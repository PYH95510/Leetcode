package practicing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeavesofBinaryTree366 {

	
	  
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
	 
//	class Solution {
//	    private List<Pair<Integer,Integer>> piars;
//	    
//	    
//	    
//	    private int getHeight(TreeNode root) {
//	    	if(root == null)return -1;
//	    	
//	    	
//	    	
//	    	int left = getHeight(root.left);
//	    	int right = getHeight(root.right);
//	    	
//	    	
//	    	int currHeight = Math.max(left, right)+1; 
//	    	
//	    	this.piars.add(new Pair<Integer,Integer>(currHeight,root.val));
//	    	
//	    	
//	    	return currHeight;
//	    }
//	    
//	    
//	    private List<List<Integer>>findLeaves(TreeNode root){
//	    	this.pairs = new ArrayList<>();
//	    	
//	    	getHeight(root);
//	    	
//	        Collections.sort(this.pairs, Comparator.comparing(p -> p.getKey()));
//	    	ArrayList<List<Integer>>solution = new ArrayList<List<Integer>>();
//	    	
//	        int n = this.pairs.size() , height = 0 , i = 0;
//	        
//	        while(i < n) {
//	        	List<Integer> nums = new ArrayList<Integer> ();
//	        	while(i < n && this.pairs.get(i).getkey() == height) {
//	        		nums.add(this.pairs.get(i).getvalue());
//	        		i++;
//	        	}
//	        	solution.add(nums);
//	        	height++;
//	        }
//	    	
//	        
//	        return solution;
//	    }
//	    
//	    
//	}
	  class Solution {
		    private List<List<Integer>> solution;
		    
		    private int getHeight(TreeNode root){
		        if (root == null)return -1;
		        
		        int leftHeight = getHeight(root.left);
		        int rightHeight = getHeight(root.right);
		        
		        int currHeight = Math.max(leftHeight,rightHeight)+1;
		        
		        if(this.solution.size() == currHeight){
		            this.solution.add(new ArrayList<>());
		        }
		        
		        this.solution.get(currHeight).add(root.val);
		        
		        return currHeight;
		        
		    }
		    
		    public List<List<Integer>> findLeaves(TreeNode root) {
		    
		        this.solution = new ArrayList<> ();
		        
		        getHeight(root);
		        
		        return this.solution;
		        
		    }
		    
		}
}
/*This solution is based on sorting. The basic process of this solution is we first write method for calculating height. Using recursive method,
 * either right or left, increment one to max number. Add current height and root's number to pair. The reason that we are using pair is because
 * pair is compatible with arraylist. After we write all the cacluating height method, we then write findleves method. We first convert pairs with
 * arraylist. Then get the height. After that, sort the pairs. The reason that we are doing this is because we are going to add it iteratively.
 * After this, we are just going to add them iteratively. However, below is so elegant and easy solution compare to the upper one. We just add
 * the node's value to the solution array accordingly to the height. By getting this.solution.get(currHeight).add(root.val); By doing so, the
 * solution method becomes much more easy and the solution time becomes O(n) from O(NlogN)*/
