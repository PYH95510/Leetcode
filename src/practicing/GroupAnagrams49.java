package practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

	class solution{
		public List<List<String>> groupAnagrams(String[] strs) {
			Map<String,List> ans = new HashMap<String,List>();
			
			for(String s: strs) {
				char[] converted_Strings = s.toCharArray(); // this converts strings to each character array for example "apple" to  [a,p,p,l,e]
				Arrays.sort(converted_Strings);
				String key = String.valueOf(converted_Strings);
				
				if(!ans.containsKey(key));
				ans.put(key, new ArrayList()); // after you instantiate key and value (vacant arrayList), you can add any value to that vacant arraylist
				
				ans.get(key).add(s);
				// it is because ArrayList is an object and primitive type values and other objects that inherit ArrayLists are also child class of ArrayList
				// therefore, it is possible for them to add any value to ArrayList
			}
			
			return new ArrayList(ans.values());
		}
		
		
	}
	
}
/*Using various values for the key and convert them is kind of tricky for this question. However, basic idea is  not that difficult for this question.
 *First, getting string value from the input and then convert strings to array of characters. It is because we are trying to sort them. After we sort,
 *we generate key value for the sorted string by using String.valueOf(). After that, if(!ans.containsKey(key), we instantiate ans.put(key,new ArrayList();
 *and then get key and add (s) which is not a sorted string and which couldn't be sorted because we need not sorted string as a result.*/
 