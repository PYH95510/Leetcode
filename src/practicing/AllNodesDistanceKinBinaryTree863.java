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
		Map <TreeNode, TreeNode> draw = new HashMap<>();
		List<Integer> answer = new ArrayList<>();
		Set<TreeNode> visited = new HashSet<TreeNode>();
		 public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
			 
			 
			 findParent(root);
			 
			 
			 return answer;
		 }
		
		
		public void findParent(TreeNode node){ // using this method, we could draw a graph of the whole tree.
			if(node == null)return;
			
			
			if(node.left != null) {
				draw.put(node.left, node);
			findParent(node.left);
			}
			
			if(node.right !=null) {
				draw.put(node.right, node);
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
			
			findistance(draw.get(node),k-1);
			
		
			
			
		}
		
		
		
		
		
		
	}
	
	

}
/*This is tree problem but the one that I have never met. People categorized this problem as map its parent or draw a graph. To solve this problem. We
 * should know that draw or graph or map its parent. Either one is same concept. It is because if we do not do so, we, at the end would only get the 
 * child node from p starting from the target node. Therefore, we should map the whole graph or either parent. After that, we should do the recursion.
 * The time complexity for the problem is O(n) because we use recursion and the space complexity is O(n) as well.
 * review again once*/
 