package practicing;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

//	class Solution {
//	    public int maxDepth(TreeNode root) {
//	        int depth = 0;
//	        if(root == null) return depth;
//	        
//	        int left = maxDepth(root.left);
//	        int right = maxDepth(root.right);
//	        
//	        return Math.max(left, right)+1;
//	}
//
//}

	class Solution {
		public int maxDepth(TreeNode root) {
			if (root == null) {
				return 0;
			}
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			int count = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				while (size-- > 0) {
					TreeNode node = queue.poll();
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
				}
				count++;
			}
			return count;
		}
	}
}
/*
 * Finding max depth using recursion. My basic concept so far regarding
 * recursion was wrong. Not technically wrong but I was worried about if I
 * initialize new variable at the beginning of recursive processes, it will re
 * initialize the whole variable. However, it was so wrong and I knew that it
 * wouldn't work that way but I hesitate to do so.
 */
