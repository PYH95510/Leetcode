package practicing;

public class UniquePaths62 {

	public class Solution {
		public int uniquePaths(int m, int n) {
		    int[][] grid = new int[m][n];
		    
		    for(int i = 0; i<m; i++){
		        for(int j = 0; j<n; j++){
		            if(i==0||j==0)
		                grid[i][j] = 1;
		            else
		                grid[i][j] = grid[i][j-1] + grid[i-1][j]; // add to grid[i][j] from gird[i-1][j]+grid[i]j[-1]
		        }
		    }
		    return grid[m-1][n-1];
		    }
		}

	/*This could be solved very easily. It is simple math that we have learned from middle school. To find the possible path, we first allocate 1s to all either i or j is 0s. and then add 1s from is and
	 * js from is and js accordingly to their diagonal grid as we did so to from comented above. and then return grid[m-1]n[-1]. Because we are using dynamic programming, we saved each steps to grid array.
	 * Remember, Dynamic Programming saves each steps to reduce time complexity even if it could increase space complexity.*/

}
