
public class LongestSubarrayof1sAfterDeletingOneElement1493 {

	class Solution {
		public int longestSubarray(int[] nums) {

		    int max = 0, part1=0, part2=0;
		   
		    
		    for(int i = 0; i<nums.length; i++){
		        
		        if(nums[i]==0){
		            
		            part2=part1;
		            part1=0;
		            
		            
		        }else{
		            part1++;
		        }
		        
		        
		        if(part1+part2>max){
		            max = part1+part2;
		        }
		        
		    }
		    
		    if(max==nums.length)max--;  //taking out 1 if there is no 0s according to the problem's description
		    
		    return max;
		    
		}
		}
		//What I am trying to do is deviding part 1 and part 2. If we encounter 0, we pass the stored value in part 1 to part 2 and then assign 0 again to part 1. By doing so, if we find summation(part1+part2) which is greater than the max value, we assign it to max.

		// We have to take out 1 from the max if the max's value is same as num's length because from the problem's description, even if there is no 0s, at least one number should be taken out.

		// Hopefully my code could help you guys :)

}
/*I am kind of proud of myself because after I have submitted this code to Leetcode, it passed with great result and I looked up discussion section and it seems that nobody has similar answer as I did.
 * As so, I wrote new discussion thread myself for the first time. These days, I was a little bit depressed because I thought my ability of solving Leetcode is not that improving but I tried to believe in
 * myself and maybe I can do it as other people could do it :)*/
