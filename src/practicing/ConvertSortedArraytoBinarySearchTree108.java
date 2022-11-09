package practicing;

public class ConvertSortedArraytoBinarySearchTree108 {

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

	class Solution {
		
		public TreeNode insert(int[] nums,int left, int right) {
			if(left>right) return null;
			
			int middle = left + (right-left)/2;
			
			TreeNode root = new TreeNode(nums[middle]);
			
			root.left = insert(nums,left,middle-1); 
			//this tree structure basically skip one number at a time. If one floor is set and it will go to next floor by dividing one set of array into two [a,a,a /middle/ b,b,b] a,onefloor/ a,a, second floor like this
			root.right = insert(nums,middle+1,right);
			//if we insert root like this and at the end, if we return root like this every time, root will have
			//root.left's left, left's left's left or left's right's left like this. So eventually, root will be added as we desired. 
			
			return root;  
			//think return root as just let's go back to the previous root with the result okay? Just think it easy. Nothing difficult.
			
		}
		
		
		
		public TreeNode sortedArrayToBST(int[] nums) {
			int left = 0;
			int right = nums.length-1;
			
			return insert( nums, left, right);
		}
	}

}
/*This problem is not that easy if you do not have basic understand and problem solving skills regarding tree. However, there is no reason for you to
 * disappoint. First, understanding the problem is crucial. For me it was the most difficult. We just need to add nodes maintaining the balance of the
 * tree. To make it easy we could easily come up with the idea that if we could use the middle of the input array, we could make it easy. After that,
 * we  probably do so by preorder tree. Here we need to understand tree kinds. There are three trees. One is pre-ordre tree. Which is we visit Node first
 * and then left node and then right node. Inorder tree, we visit left node first root node, and then finally the right node. Post order tree we visit
 * left node, right node and then root node. I will later post the code snippet for the trees. */
 