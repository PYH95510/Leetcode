package practicing;

public class LongestCommonPrefix14 {

	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        String prefix = strs[0];
	        
	        
	        for(int i = 1; i<strs.length; i++){
	            while(strs[i].indexOf(prefix)!=0){
	                prefix = prefix.substring(0,prefix.length()-1);
	                if(prefix.length() == 0)return"";
	            }
	        }
	        
	        return prefix;
	    }
	    
	    
	}

}
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0)
//            return "";
//        Arrays.sort(strs);
//        String first = strs[0];
//        String last = strs[strs.length - 1];
//        
//        int c = 0;
//        while(c<first.length()){
//       if (first.charAt(c) == last.charAt(c))
//                c++;
//            else
//                break;
//        }
//        return c == 0 ? "" : first.substring(0, c);
//        
//        
//    }
//}
/*This is LC easy section. However, it is not easy to solve and we have tons of things to learn here. The uncommented solution is O(n) timecomplexity
 * and O(1) space complexity solution. Below is o(nlogn) timecomplexity solution. However, below solution is very intuitive and easy to understand.
 * Above solution is very fast and easy to understand. We first set first element array as prefix and then bring it into for loop. By using while
 * loop and the indexOf, we iterate and eliminate one characters at a time using substring starting at the end. Because indexOf(string) treat string
 * as a whole chunk of index element, we could use this method. If we cannot find any comment element, it will eliminate all the characters.*/
