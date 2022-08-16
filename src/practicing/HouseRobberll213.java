package practicing;

public class HouseRobberll213 {

}

class Solution {
    public int rob(int[] nums) {  
        if (nums.length == 1) return nums[0];
        
        int include = nums.length-1;
        int notinclude = nums.length;
        
        
        include = robhelp(nums,0 ,include);
        notinclude = robhelp(nums, 1,notinclude);
        
        return Math.max(include,notinclude);
        
    }
    
    
    public int robhelp(int[]nums , int indx, int endindx){
        int included=0,excluded=0;
        
        
        for(int i = indx ; i <endindx ; i++){
            
            int a = included, e = excluded;
            included = e + nums[i];
            excluded = Math.max(e, a);
        }
        return Math.max(included, excluded);
    }
    
}

/*This one is very easy medium problem if you know how to solve House Robber problem 1. However, one thing
 * is different. I usually solve this problem finding dp[0] and dp[1]=Math.max(nums[0],nums[1]) and then using
 * for loop. However, from this test case, it causes out of index boundary error. Therefore, this time we should
 * use similar but a little bit different. Let's instantiate int a and e during for loop, we add to included with excluded
 * variable and nums[i], and then upload excluded with Math.max(included and excluded) Other than that, it is pretty much similar
 * to House robber 1, except two times recursion. One time, we start with 0 second time we start with 1 and then find the max
 * between them because we cannot rob the house from begging cell and the end cell */
