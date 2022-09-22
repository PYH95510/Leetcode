package practicing;

public class UniqueBinarySearchTrees96 {

	public class Solution {
		  public int numTrees(int n) {
		    int[] G = new int[n + 1];
		    G[0] = 1;
		    G[1] = 1;

		    for (int i = 2; i <= n; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        G[i] += G[j - 1] * G[i - j];
		      }
		    }
		    return G[n];
		  }
		}
//	class Solution {
//		  public int numTrees(int n) {
//		    // Note: we should use long here instead of int, otherwise overflow
//		    long C = 1;
//		    for (int i = 0; i < n; ++i) {
//		      C = C * 2 * (2 * i + 1) / (i + 2);
//		    }
//		    return (int) C;
//		  }
//		}

}

/*The below one is the mathematical solution which is O(n) and the above solution is DP solution takes O(n^2). For unique binary search tree, if we 
 * choose for example j to be node, left side would be j-1 and the right side would be i-j. The total number of unique binary search tree should be
 * j-1 times i-j it is because it the summation of number of cases. After knowing this, it is easy to compute. The below answer is also easy to come
 * up with if we know the Catalan Numbers and to get the Catalan number's nth number 2(2n+1)/n+2 so if we already know it, it is great to come up with
 * this mathematical deduction answer.*/
