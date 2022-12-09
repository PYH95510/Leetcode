package practicing;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber171 {
	
	
		
		class Solution {
		    public int titleToNumber(String s) {
		        int result = 0;

		        Map < Character, Integer > alpha_map = new HashMap < > ();
		        for (int i = 0; i < 26; i++) {
		            int c = i + 65; 
		            alpha_map.put((char) c, i + 1);
		        }

		        int n = s.length();
		        for (int i = 0; i < n; i++) {
		            char cur_char = s.charAt(n - 1 - i);
		            result += (alpha_map.get(cur_char) * (Math.pow(26, i)));
		        }
		        return result;
		    }
		}
	

}
