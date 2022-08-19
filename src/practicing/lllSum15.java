package practicing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lllSum15 {

	class Solution {
	    
        /*1. order doesn't matter
        2. triplets does not contain duplicate
        3. 0,0,0 could be distinct answer which means if there are same numbers inside the array, they are considered as different numbers when they are counted.
        4. As we can know from the problem title, it should be at least 3 numbers to be added to be answer.
        5. Duplicated numbers could be used again.*/
       
   public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int left = i+1, right = num.length-1, sum = 0 - num[i];
            while (left < right) {
                if (num[left] + num[right] == sum) {
                    res.add(Arrays.asList(num[i], num[left], num[right]));
                    while (left < right && num[left] == num[left+1]) left++; //move until not duplicated index
                    while (left < right && num[right] == num[right-1]) right--;
                    left++; right--;
                } else if (num[left] + num[right] < sum) left++;
                else right--;
           }
        }
    }
    return res;
}
    
    
    // it is impossible to use exact two point middle because if we use middle, we could loose some numbers and it is not guaranteed it is all ascending order.
    
}

}
/*Set<List<Integer>> threeSumSet  = new HashSet<>(); //we are using two giant data structure here which is hashset and array list compare to the above one
 * However, we do not need to care duplicated components because of hash's characteristic. 
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2;i++){                         //Doing length-2, because we want two elems j and k after i.
            int j =i+1;
            
            int k = nums.length-1;
            
            while(j<k){
                
                int sum = nums[i]+nums[j]+nums[k];
                
                if(sum==0){
                    threeSumSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    j++;
                    k--;
                }
                else if (sum > 0){
                    k--;
                } 
                else if (sum < 0){
                    j++;
                } 
            }

        }
        
        return new ArrayList<>(threeSumSet);
    }*/

/*There are basically two ways to solve this problem. One is optimized way as I solved above and the the below as I commented. The below one
 * takes way more time and space compare to the above one. However, it is worth trying and we need to remember the traits of Hash. When we add
 * same components to hash, it removes does not allow the same components. Therefore, by using this characteristic, we do not need to come up
 * with the idea that move until index without duplicated numbers which is hard one of three hard parts in this problem. Two key parts of this problem
 * is that one is we need to sort arrays first and then fix one minimum point and then compare them and then set the algorithm to eliminate duplicated
 * index. This was the most difficult part of this problem I think. Also, because we are using two arbitrary points to compare, we need to set
 * ending point for for-loop as length-2. Lets keep it up !! :) */
