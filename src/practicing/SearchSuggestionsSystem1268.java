package practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem1268 {

	class Solution {
		   
	    public int lower_bound(String[] products, int start, String word){
	            int i = start, j = products.length, mid;
	        while (i < j){
	            mid = (i + j) / 2;
	            if (products[mid].compareTo(word) >= 0)
	                j = mid;
	            else
	                i = mid + 1;
	        }
	        return i;
	    }
	    //find the lowest bound, if sting word is bigger than the word product, than we can skip the input word product
	    
	     public List<List<String>> suggestedProducts(String[] products, String searchWord) {
	        Arrays.sort(products);
	         List<List<String>> result = new ArrayList<>();
	         int start = 0,  bsStart = 0, n = products.length;
	         String prefix = new String();
	         for (char c : searchWord.toCharArray()){
	             prefix += c;
	             
	             //Get the starting index of word starting with 'prefix'.
	             start = lower_bound(products, bsStart, prefix);
	             
	             result.add(new ArrayList<>());//initialize next list
	             
	             for(int i = start; i < Math.min(start + 3, n); i++){//we can add to the result 3 answers anyways
	                 if(products[i].length() < prefix.length()|| !products[i].substring(0,prefix.length()).equals(prefix))
	                     break; // if product's length is shorter than prefix's length or product's substring is not eqaul to prefix then break, do not add it to the result
	                 result.get(result.size()-1).add(products[i]);
	                 // add it to the previously added newly created list.
	             }
	             
	             bsStart = Math.abs(start);//assign start's absolute value to bsStart
	         }
	         return result;
	    }
	}

}
/*The above is pretty brute force or first solution that could come up with your mind when you first see this problem on the interview. However, it 
 * might be way more longer and not might be optimized like this form. Therefore, we should use different way to solve this problem.*/
