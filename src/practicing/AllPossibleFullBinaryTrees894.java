package practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AllPossibleFullBinaryTrees894 {

	
	  
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
	    Map<Integer, List<TreeNode>> memo = new HashMap<>();
	    
	    public List<TreeNode> allPossibleFBT(int n) {
	         
	        List<TreeNode> result = new ArrayList <> ();
	        
	        if(n % 2 == 0)return result;
	        if(n == 1) return Arrays.asList(new TreeNode(0)); //Arrays to list
	        if(memo.containsKey(n))return memo.get(n);
	        
	        for(int i = 1; i < n; i += 2){
	            for(TreeNode leftNode: allPossibleFBT(i)){
	                for(TreeNode rightNode: allPossibleFBT(n-i-1)){
	                    result.add(new TreeNode(0,leftNode,rightNode));
	                }
	            }
	        }
	        
	        memo.put(n,result);
	        return result;
	        
	    }
	    
	    
	}
	
	

}
