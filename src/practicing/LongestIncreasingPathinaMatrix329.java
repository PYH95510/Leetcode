package practicing;

public class LongestIncreasingPathinaMatrix329 {

//	class Solution {
//	    private static final int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
//	    private int m,n;
//	    
//	    public int longestIncreasingPath(int[][] matrix) {
//	        if(matrix.length == 0) return 0;
//	        m = matrix.length;
//	        n = matrix[0].length;
//	        int ans = 0;
//	        
//	        
//	        for(int i = 0 ; i<m; i++)
//	            for(int j = 0; j<n; j++)
//	                ans = Math.max(ans,dfs(matrix,i,j));
//	        return ans;
//	    }
//	    
//	    public int dfs(int[][] matrix , int i, int j){
//	        int ans = 0;
//	        for(int[]d : directions){
//	            int x = i+d[0] , y = j + d[1];
//	            if (0 <= x && x < m && 0 <= y && y < n && matrix[x][y] > matrix[i][j])
//	                ans = Math.max(ans,dfs(matrix,x,y));
//	        }
//	        
//	            return ++ans;
//	        
//	    }
//	    
//	    
//	    
//	}
	class Solution {
	    private static final int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
	    private int m,n;
	    
	    public int longestIncreasingPath(int[][] matrix) {
	        if(matrix.length == 0) return 0;
	        m = matrix.length;
	        n = matrix[0].length;
	        int[][] cache = new int[m][n];
	        int ans = 0;
	        
	        
	        for(int i = 0 ; i<m; i++)
	            for(int j = 0; j<n; j++)
	                ans = Math.max(ans,dfs(matrix,i,j,cache));
	        return ans;
	    }
	    
	    public int dfs(int[][] matrix , int i, int j, int[][] cache){
	        if(cache[i][j] !=0 ) return cache[i][j]; // if it is already computed, we check it so we do not need future computation.
	        
	        for(int[]d : directions){
	            int x = i+d[0] , y = j + d[1];
	            if (0 <= x && x < m && 0 <= y && y < n && matrix[x][y] > matrix[i][j])
	                cache[i][j] = Math.max(cache[i][j],dfs(matrix,x,y,cache)); //if it is computed, assign the values to cache[i][j]
	        }
	        
	            return ++cache[i][j];
	        
	    }
	    
	    
	    
	}

}
/*Here, dp is not used as what we used to use. Here dp is just to store the value that we calculated and then move on to the next index. To avoid
 * multiple calls for same index, we used dp named as cached. We add computed result to each cache index and then at the end, we add max value to
 * starting point cache index [i][j].*/
