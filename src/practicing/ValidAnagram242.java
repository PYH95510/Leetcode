package practicing;

public class ValidAnagram242 {
	class solution{
		public boolean isAnagram(String s, String t) {
			if(s.length()!= t.length()) return false;
			int [] counter = new int[26];
			
			for(int i = 0; i<s.length(); i++) {
				counter[s.charAt(i)-'a']++;
				counter[t.charAt(i)-'a']++;
				
			}
			
			for(int count: counter) {
				if(count != 0) return false;
			}
			
			return true;
		}
	}
	
}

/*it is fairly easy when if there is only lower case alphabet letters. First we need 26 int array. As we iterating one character at a time, we
 * add their numbers if it is exist to their index by using s.charAt and t.charAt. After we are done with doing so, we should check if they are all
 * zero because otherwise, they are not exactly the same. The solution is O(n) time complexity and O(1) space complexity. If the input s and t are
 * composed with unicodes, we should use counter as hash because there are so many unicodes.*/
