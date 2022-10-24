package practicing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllNodesDistanceKinBinaryTree863 {

	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	class solution{
		Map <TreeNode, TreeNode> graph = new HashMap<>();
		List<Integer> answer = new ArrayList<>();
		Set<TreeNode> visited = new HashSet<TreeNode>();
		 public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
			 
			 
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
		
		
		public void findistance(TreeNode node, int k) {
			if(visited.contains(node)|| node == null)return;
			
			visited.add(node); //add node to visited
			
			if(k == 0) {
				answer.add(node.val);
				return;
			}
			
			
			findistance(node.left,k-1);
			findistance(node.right,k-1);
			
			findistance(graph.get(node),k-1);
			
		
			
			
		}
		
		
		
		
		
		
	}
	
	

}
