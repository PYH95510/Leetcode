package practicing;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

	class Solution {

		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> answer = new ArrayList<>();
			answer.add(new ArrayList<>());
			answer.get(0).add(1);

			for (int rowNum = 1; rowNum < numRows; rowNum++) {
				List<Integer> row = new ArrayList<>();
				List<Integer> prevrow = answer.get(rowNum - 1); // getting whole row

				row.add(1); // adding one to first element of row

				for (int j = 1; j < rowNum; j++) {
					row.add(prevrow.get(j) + prevrow.get(j - 1)); // this time if we get prev.get, we are getting one
																	// element at the time, not the whole row
				}//here if we get index, we are getting each element, not the whole row. It will leave the last element anyways because j < rowNum
				
				row.add(1);
				//adding 1 to the last element of the row
				
				answer.add(row);
				//add row to the answer that is computed
			}
			
			return answer;
		}
	}

}
/*It is always hard when it comes to List<List<Integer>> datastructure. To make it simple, we need two list to access inside the list. After that, 
 *everything is easy. Also, we should consider that we need to initialize the list by adding list.add(new ArrayList<>()) first. Otherwise it is hard
 *to get the first element. The intuition of this algorithm is dynamic programming. It is because previous computed result affect to the next computation
 *All we need to do is just do the computation using previous element and current element and add them together. */
 