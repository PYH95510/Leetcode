package practicing;

public class NumberofIsland200 {

	class Solution {
	    
	    public int numIslands(char[][] grid) {
	        
	        if (grid == null || grid.length == 0)return 0;
	            
	     
	        int row = grid.length;
	        int column = grid[0].length;
	        boolean[][] marked = new boolean[row][column]; 
	        int islandCount = 0;
	    
	        for (int i = 0; i < row; ++i) {
	            for (int j = 0; j < column; ++j) {
	                if (!marked[i][j] && grid[i][j] == '1') {
	                    dfs(i, j, grid, marked);
	                    ++islandCount;
	                }
	            }
	        }
	  
	        return islandCount;

	    }


	    private void dfs(int i, int j, char[][] grid, boolean[][] marked) {
	  
	        int row = grid.length; 
	        int column = grid[0].length;
	         
	        int x = i;
	        int y = j;
	        
	            
	        if(x>= 0 && x< row && y >= 0 && y < column){
	            if (!marked[x][y] && grid[x][y] == '1'){
	        marked[i][j] = true;
	        dfs(x-1,y,grid,marked); //move left until it does not meet 1
	        dfs(x+1,y,grid,marked);	//move right until it does not meet 1
	        dfs(x,y-1,grid,marked);	//move up until it does not meet 1
	        dfs(x,y+1,grid,marked); // move below until it does not meet 1
	            }
	        }
	        
	    

	    }
	    
	    
	}

}
