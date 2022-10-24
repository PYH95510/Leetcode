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
			
			
			return priority.toArray(new int[0][0]);//this means just return 2d array, it doesn't mean the number inside it. [1][1] [2][1] whatever.
			
		}
	}

}
/*To be honest, this problem, if we knew how to change the comparator of priority queue, we could have solved this problem with like five minutes. 
 * However, for me, I did not expect that I could change the priority queue's comparator so it took so much time to solve. At first, I tried to solve
 * this problem using two data structure HashMap and priority queue. First adding data to Hashmap and then adding them to priority queue reverse order
 * then if we get the data again from the priority queue k times I thought I could get the index because second index is [i][0] and [i][1] anyways.
 * However, it didn't go well anyways. We could change the queue's comparator like the above, then the priority queue can compare 2D array's value as well
 * After then if the priority queue's size gets above the k then we just poll and return.*/
 