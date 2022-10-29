package practicing;

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
	    //find the lowest bound
	    
	     public List<List<String>> suggestedProducts(String[] products, String searchWord) {
	        Arrays.sort(products);
	         List<List<String>> result = new ArrayList<>();
	         int start = 0,  bsStart = 0, n = products.length;
	         String prefix = new String();
	         for (char c : searchWord.toCharArray()){
	             prefix += c;
	             
	             //Get the starting index of word starting with 'prefix'.
	             start = lower_bound(products, bsStart, prefix);
	             
	             result.add(new ArrayList<>());
	             
	             for(int i = start; i < Math.min(start + 3, n); i++){
	                 if(products[i].length() < prefix.length()|| !products[i].substring(0,prefix.length()).equals(prefix))
	                     break;
	                 result.get(result.size()-1).add(products[i]);
	             }
	             
	             bsStart = Math.abs(start);
	         }
	         return result;
	    }
	}

}
