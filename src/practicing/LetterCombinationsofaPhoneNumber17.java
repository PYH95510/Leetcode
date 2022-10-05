package practicing;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {

	public class solution{
		
		public List<String> letterCombinations(String digits){
			List<String> answer = new ArrayList<String>();
			String[] comp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
			
			
			
			for(int i = 0 ; i<digits.length(); i++) {
				answer = combination(comp[digits.charAt(i)-'0'],answer);
			}
			
			return answer;
		}
		
		
		public List<String> combination(String comp, List<String> answer){
			List<String> result = new ArrayList<String>();
			
			for(int i=0;i<comp.length();i++)
				for(String s : answer) 
					result.add(s+comp.charAt(i));
				
			
			
			return result;
		}
		
	}

}
