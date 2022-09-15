package practicing;

public class ZeroOneMatrix542 {

	class Solution {
	    public int[][] updateMatrix(int[][] mat) {
	        if (mat == null || mat.length == 0 || mat[0].length == 0) {
	            return mat;
	        }
	        
	        int row = mat.length;
	        int col = mat[0].length;
	        
	        if(row == 1 && col==1)return mat;
	        
	        
	        
	        int result[][] = new int [row][col];
	        int maxdis = row+col;
	        
	        
	        for(int i = 0 ;i<row ; i++){
	            for(int j =0 ;j<col ; j++){
	                if (mat[i][j] == 0) continue;
	                    
	                result[i][j] = maxdis; //to find the minimum value
	                
	                if(i>0)result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
	                
	                if(j>0)result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
	                
	            }
	        }
	        
	        
	        
	        for (int i = row - 1; i >= 0; i--) {
	            for (int j = col - 1; j >= 0; j--) {
	                if (mat[i][j] == 0) {
	                    continue;
	                }
	                if (i < row - 1) {
	                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
	                }
	                if (j < col - 1) {
	                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
	                }
	            }
	        }
	        
	        return result;
	    }
	    
	    
	}

}
