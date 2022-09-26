package practicing;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals56 {

	public class Solution{
		 public int[][] merge(int[][] intervals) {
			 Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
			 LinkedList<int[]> merge = new LinkedList<>();
			 
			 for(int[] interval : intervals) { 
				 
				 if(merge.isEmpty() || merge.getLast()[1]<interval[0]) { //check if current latest is faster than newly added interval start time
					 
					 merge.add(interval);
				 }else {
					 merge.getLast()[1] = Math.max(merge.getLast()[1], interval[1]); //replace the end time with the latest time if start time is overlapped
					 
				 }
				 
			 }
			 
			 
			 return merge.toArray(new int[merge.size()][]); //
		 }
		 
		 
		 
	}

}
