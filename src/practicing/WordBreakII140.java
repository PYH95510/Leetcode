package practicing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakII140 {

	
	    public List<String> wordBreak(String s, Set<String> dict) {
	        return dfs(s, dict, new HashMap<String,List<String>>());
	    }

	    public List<String> dfs(String s, Set<String> dict, Map<String, List<String>> memo){
	        if(memo.containsKey(s)) {
	            return memo.get(s);
	        }
	        List<String> res = new ArrayList<>();
	        if(s == null || s.length() == 0) {
	            return res;
	        }
	        int n = s.length();
	        
	        for(String w : dict) {
	            if(!s.startsWith(w)) {
	                continue;
	            }
	            int end = w.length();
	            if(end == n) {
	                res.add(w);
	            } else {
	                List<String> sublist = dfs(s.substring(end), dict, memo);
	                for(String item : sublist) {
	                    item = w + " " + item;
	                    res.add(item);
	                }
	            }
	        }
	        
	        memo.put(s, res);
	        return res;
	    }
	    
	    public static void main(String[] args) {
	    	
	    }
	    class Solution {
	        public List<String> wordBreak(String s, List<String> wordDict) {
	            List<String> list = new ArrayList<>();
	            Set<String> set = new HashSet<>(wordDict);
	            wordBreak(list, new ArrayList<>(), 0, set,s);
	            return list;
	        }
	        
	        private void wordBreak(List<String> list, List<String> temp, int index, Set<String> set, String s) {
	            if(index==s.length()) { //  reached at the end of string
	                StringBuilder sb = new StringBuilder();
	                for(int i=0; i<temp.size()-1; i++) {
	                    sb.append(temp.get(i)).append(" ");
	                }
	                sb.append(temp.get(temp.size()-1));
	                list.add(sb.toString());
	                return;
	            }
	            
	            for(int i=index; i<s.length(); i++) {
	                String str = s.substring(index, i+1);
	                if(!set.contains(str)) continue;
	                temp.add(str); // add to the temporary list
	                wordBreak(list, temp, i+1, set,s); // recurse to check every word from next index
	                temp.remove(temp.size()-1); //backtrack
	            }
	        }
	    }

}
