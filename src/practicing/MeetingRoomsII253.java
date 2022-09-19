package practicing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsII253 {

	class Solution {
	    public int minMeetingRooms(int[][] intervals) {
	        if(intervals.length == 0)return 0;
	        
	        Arrays.sort(intervals, new Comparator <int[]>(){
	           public int compare (int[]a , int[]b){
	               if(a[0] != b[0])return Integer.compare(a[0],b[0]);
	               
	               return Integer.compare(a[1],b[1]); //if start times are same, compare end times to sort
	           } 
	        });
	        
	        
	        PriorityQueue <Integer> currentMeetings = new PriorityQueue<Integer>();
	        
	        int maxRooms = 0;
	        
	        for(int i = 0; i<intervals.length; i++){
	            int startTime = intervals[i][0] , endTime =intervals[i][1];
	            
	            while(currentMeetings.size()>0 && currentMeetings.peek() <= startTime)              {
	            	currentMeetings.remove();
	            }
	            
	            
	            currentMeetings.add(endTime);
	            
	            maxRooms = Math.max(maxRooms, currentMeetings.size());
	            
	            
	        }
	        
	        return maxRooms;
	        
	    }
	    
	    
	}
	    
	    
}
/*It took me so much time to solve this problem because I had to study priority queue and heap again because I forgot most of the parts. After
 * reviewing that, the basic intuition is not that difficult to understand. Also, the arrays.sort(comparator) is what we need to know to solve this
 * problem. What it does is it returns positive, zero or negative. It switches only if it returns positive. P1>P2. Thus so, we could get sorted
 * intervals. After that, we create priority queue and add each value that overlaps with current starting time to queue and it will added Min-heap
 * when the time is not overlapped, we remove the time from the queue. */


