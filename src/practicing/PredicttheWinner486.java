package practicing;

public class PredicttheWinner486 {

//	public class Solution {
//	    public boolean PredictTheWinner(int[] nums) {
//	          int[][] dp = new int[nums.length][nums.length];
//	        for (int i = 0; i < nums.length; i++) {
//	            dp[i][i] = nums[i];
//	        }
//	        
//	        for (int i = nums.length - 2; i >= 0; i--) {
//	            for (int j = i + 1; j < nums.length; j++) {
//	                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
//	            }//checking numbers from the end, adding which number is bigger either adding from end or adding from 
//	        }        
//	        return dp[0][nums.length - 1] >= 0;
//	    }
//	}
	
//	    public static boolean PredictTheWinner(int[] nums) {
//	        return getMaxScore(nums,0,nums.length-1) >= 0;
//	    }
//	  
//	    private static int getMaxScore(int[] nums, int s, int e){
//	        if (s == e)
//	            return nums[s];
//	 
//	    
//	        int first = nums[s] - getMaxScore(nums,s+1,e);
//	        int last = nums[e] - getMaxScore(nums,s,e-1);
//	        
//	        return Math.max(first,last);
//	    }
	
	
	public static void main(String[] args) {
		int[] num1 = new int[5];
		num1[0] = 8;
		num1[1] = 2;
		num1[2] = 27;
		num1[3] = 4;
		num1[4] = 5;
		boolean result;
		result =PredictTheWinner(num1);
		
	}


	
	    public static boolean PredictTheWinner(int[] nums) {
	        int[][] dp = new int[nums.length][nums.length];
	        for (int s = nums.length-1; s >= 0; s--) {       
	            dp[s][s] = nums[s]; /*+++++++++++++++++ add a new line ++++++++++++++++++*/
	            for (int e = s+1; e < nums.length; e++) {
	                int a = nums[s] - dp[s + 1][e];
	                int b = nums[e] - dp[s][e - 1];
	                dp[s][e] = Math.max(a, b);
	            }
	        }
	        return dp[0][nums.length - 1] >= 0;
	    }
	}



/*It takes almost 3 days to understand this problem. Almost 20 hours. TBH, I am not so sure that I fully understood this problem. However, this
 * problem is so important to understand. The basic algorithm using dp is this. We are supposed to initialize 2D array to solve this problem.
 * We should quickly understand that greedy solution does not work. We are supposed to know that this is one of the algorithm problem that
 * we had learned when we were in school. Then to solve this problem. We need to understand that we can choose either first or last element
 * from the array. To make the problem more easy and fast, we are going to start array with end part. To solve this, we are going to start with
 * two index start, end here they would be s and e. s would be index -2 and e would be index -1. Before actually getting into computation, we should
 * initialize the dp function's diagonal with num's elements. After that, By using max function, we are going to compute
 * which one is better to choose among those two numbers assuming if there are only two numbers and then save the result to dp[num.length-2][num.length-1]
 * After doing so, dp[i][j], we are going to store difference between player 1 and player 2 's maximum effective score that the player can get.
 * To understand this problem, MIT open source lecture really helped me a lot. It is better to understand as sub arrays. Always added sets to make one
 * side win is same if we assume that both players are acting optimally and both integers are greater than one. From dp[i][j], the maximum possible
 * value is stored and every single time its + and - sign is changed. 
 *  */
