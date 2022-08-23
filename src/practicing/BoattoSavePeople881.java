package practicing;

import java.util.Arrays;

public class BoattoSavePeople881 {

	class Solution {
	    public int numRescueBoats(int[] people, int limit) {
	        int boat = 0;
	        if(people.length ==1) return 1;
	        
	        int left = 0;
	        int right = people.length-1;
	        Arrays.sort(people);
	        
	        //can I use queue here ?
	        while(left<=right){ //using two pointers
	            int middle = people[left]+people[right];
	            
	            if(middle<=limit){
	                boat++;
	                right--;
	                left++;
	            }else{
	                boat++;
	                right--;
	                
	            }
	            
	        }
	        return boat;
	        
	        
	    }
	}

}
/*To be honest, it was not that difficult for me to solve this problem after getting hint to use two pointers. Actually if I have read that maximum
 * two people can ride a boat is a constraint from the problem, I woduln't need a hint I guess. This problem is more related to math rather than coding
 * maximum two people can ride a boat so we are going to use two pointers. First we are going to sort the people array and then using two pointers,
 * we are going to ship people who are heavy first. even though the summation of two people's weight is less than the limitation, we do not care
 * because the constrain of the problem says maximum two people can ride the boat and then we will move the pointer accordingly. If it is heavier than 
 * the limitation, we are going to move only the right pointer to the left. We are going to keep this process until left and right pointer meet. This is pretty
 * much the whole process. */
