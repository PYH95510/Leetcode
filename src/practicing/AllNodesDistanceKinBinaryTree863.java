package practicing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllNodesDistanceKinBinaryTree863 {

	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	class solution{
		Map <TreeNode, TreeNode> graph = new HashMap<>();
		
		
		 public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
			 List<Integer> answer = new ArrayList<>();
			 
			 findParent(root);
			 
			 
			 return answer;
		 }
		
		
		public void findParent(TreeNode node){ // using this method, we could draw a graph of the whole tree.
			if(node == null)return;
			
			
			if(node.left != null) {
			graph.put(node.left, node);
			findParent(node.left);
			}
			
			if(node.right !=null) {
			graph.put(node.right, node);
			findParent(node.right);
			}
			
		}
		
		public List<Integer> 
		
		
		
		
		
		
	}
	
	

}
