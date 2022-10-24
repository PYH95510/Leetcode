package practicing;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointstoOrigin973 {

	class solution{
		public int[][] kClosest(int[][] points, int k) {
			 if(k == points.length) return points;
			Queue<int[]> priority = new PriorityQueue<int[]>(k,new Comparator<int[]>() { //k is the initial comparator size
				public int compare(int[] a, int[] b) {
	                return (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
	            }
	        });
			
			for(int[] point:points) { //from for each, int[] point will be iterated as array set.
				priority.add(point);
				if(priority.size()>k)
					priority.poll();
			}
			
			
			return priority.toArray(new int[0][0]);
			
		}
	}

}
