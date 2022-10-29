package practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem1268 {

//	class Solution {
//		   
//	    public int lower_bound(String[] products, int start, String word){
//	            int i = start, j = products.length, mid;
//	        while (i < j){
//	            mid = (i + j) / 2;
//	            if (products[mid].compareTo(word) >= 0)
//	                j = mid;
//	            else
//	                i = mid + 1;
//	        }
//	        return i;
//	    }
//	    //find the lowest bound, if sting word is bigger than the word product, than we can skip the input word product
//	    
//	     public List<List<String>> suggestedProducts(String[] products, String searchWord) {
//	        Arrays.sort(products);
//	         List<List<String>> result = new ArrayList<>();
//	         int start = 0,  bsStart = 0, n = products.length;
//	         String prefix = new String();
//	         for (char c : searchWord.toCharArray()){
//	             prefix += c;
//	             
//	             //Get the starting index of word starting with 'prefix'.
//	             start = lower_bound(products, bsStart, prefix);
//	             
//	             result.add(new ArrayList<>());//initialize next list
//	             
//	             for(int i = start; i < Math.min(start + 3, n); i++){//we can add to the result 3 answers anyways
//	                 if(products[i].length() < prefix.length()|| !products[i].substring(0,prefix.length()).equals(prefix))
//	                     break; // if product's length is shorter than prefix's length or product's substring is not eqaul to prefix then break, do not add it to the result
//	                 result.get(result.size()-1).add(products[i]);
//	                 // add it to the previously added newly created list.
//	             }
//	             
//	             bsStart = Math.abs(start);//assign start's absolute value to bsStart
//	         }
//	         return result;
//	    }
//	}
	// Custom class Trie with function to get 3 words starting with given prefix
	class Trie {

	    // Node definition of a trie
	    class Node {
	        boolean isWord = false;
	        List<Node> children = Arrays.asList(new Node[26]);
	    }
	    Node Root, curr;
	    List<String> resultBuffer;
	    // Runs a DFS on trie starting with given prefix and adds all the words in the resultBuffer, limiting result size to 3
	    void dfsWithPrefix(Node curr, String word) {
	        if (resultBuffer.size() == 3)
	            return;
	        if (curr.isWord)
	            resultBuffer.add(word);

	        // Run DFS on all possible paths.
	        for (char c = 'a'; c <= 'z'; c++) //it will automatically gives you lexicographical order because c will iterate from a from z
	            if (curr.children.get(c - 'a') != null)
	                dfsWithPrefix(curr.children.get(c - 'a'), word + c);
	    }
	    Trie() {
	        Root = new Node();
	    }

	    // Inserts the string in trie.
	    void insert(String s) {
	        // Points curr to the root of trie.
	        curr = Root;
	        for (char c : s.toCharArray()) {
	            if (curr.children.get(c - 'a') == null)
	                curr.children.set(c - 'a', new Node());
	            curr = curr.children.get(c - 'a'); // because it is a new node and it doesn't have a child node starting with the new alphabet it is inserted.
	        }

	        // Mark this node as a completed word.
	        curr.isWord = true;
	    }
	    
	    List<String> getWordsStartingWith(String prefix) {
	        curr = Root;
	        resultBuffer = new ArrayList<String>();
	        // Move curr to the end of prefix in its trie representation.
	        for (char c : prefix.toCharArray()) {
	            if (curr.children.get(c - 'a') == null)
	                return resultBuffer; //if it doesn't have from the children then just return
	            curr = curr.children.get(c - 'a');
	        }
	        dfsWithPrefix(curr, prefix);
	        return resultBuffer;
	    }
	}

	class Solution {
	    List<List<String>> suggestedProducts(String[] products,
	                                         String searchWord) {
	        Trie trie = new Trie();
	        List<List<String>> result = new ArrayList<>();
	        // Add all words to trie.
	        for (String w : products)
	            trie.insert(w);
	        String prefix = new String();
	        for (char c : searchWord.toCharArray()) {
	            prefix += c;
	            result.add(trie.getWordsStartingWith(prefix));
	        }
	        return result;
	    }
	}
}
/*The above is pretty brute force or first solution that could come up with your mind when you first see this problem on the interview. However, it 
 * might be way more longer and not might be optimized like this form. Therefore, we should use different way to solve this problem. The below uncommented
 * solution is who we use Tire solution. To explain the solution, first we insert all the words from the products. In the insert method in the insert
 * Method in the Trie class, when for loop is over, we change the boolean isword to true. after we add all the words, we iterate all the prefix. It
 * first goes into the getWordsStrartwith method inside the trie class. From there, starting from the first prefix, if curr.children does not contains
 * prefix as the solution wants, we just returns result. Else, we iterate through until the end of the prefix. After finishing iterating prefix, we
 * go into dfsWithprefix. In that method, we do the dfs with the prefix's character. Until we reach to the is complete word, which is boolean true, we
 * do the recursion. If resultarrayList's size becomes 3, we return it. Here, we do not have to worry about the lexicographical order because character
 * c would iterate from a to z and do the dfs from a to z and adding the answer accordingly anyways.*/
