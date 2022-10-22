package practicing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString767 {

	class Solution {
		
	    public String reorganizeString(String s) {
	        //max value's alphabet 
	        Map <Character,Integer> result = new HashMap <Character,Integer> ();
	        
	        for(char c : s.toCharArray()){
	            result.put(c,result.getOrDefault(c,0)+1);
	        }
	        
	        
	        // put the char of result into the maxheap with sorting the frequencies by large->small. Adding character accordingly to frequencies in map. We are not actually adding it yet, we are just defining how we are going to add it to Priority Queue later. If we do not set accordingly to the frequencies, priority queue will add accrodingly to the latest alphabetical order.
	         PriorityQueue<Character> maxheap = new PriorityQueue<>(
	            (a, b) -> result.get(b) - result.get(a)
	        ); 
	        
	        maxheap.addAll(result.keySet());
	        // Now we are adding all the result's keyset to maxheap
	        
	        StringBuilder sb = new StringBuilder();
	        while (maxheap.size() > 1) {
	            char first = maxheap.poll();
	            char second = maxheap.poll(); //taking out two most frequent alphabets
	            sb.append(first);
	            sb.append(second);
	            //append two alphabets.
	            
	            result.put(first, result.get(first) - 1);
	            result.put(second, result.get(second) - 1);
	            
	            // insert the character back to the freq_map if the count in 
	            // hashmap of these two character are still > 0
	    
	            if (result.get(first) > 0) {
	                maxheap.offer(first);
	            }
	            if (result.get(second) > 0) {
	                maxheap.offer(second);
	            }
	        }
	        //doing so until last element left
	        
	        if (!maxheap.isEmpty()) {
	            // when there is only 1 element left in the maxheap
	            // check the count, it should not be greater than 1
	            // otherwise it would be impossible and should return ""
	            if (result.get(maxheap.peek()) > 1) {
	                return "";
	            }
	            else {
	                sb.append(maxheap.poll());
	            }
	        }
	        
	        return sb.toString();
	        
	    }
	}

}
/*This solution is very intuitive to understand. With the first intuitive idea, it is easy to come up with the solution. It is always important for
 * Java to come up with the right data structure. This time, we used heap (Priority Queue) and Hashmap to solve. First, we get the numbers of frequencies
 * of characters from the strings. Then add it the the priority queue accordingly to the frequencies. And then, we add it to the string builder one by one.
 * For the priority queue, we should set queue dependency as frequency of occurrence which means, if it occurs more, it comes first using lambda. By so,
 * we add it to the string builder until it gets 0. Time complexity for this is O(nlogn) because we are using priority queue.*/
