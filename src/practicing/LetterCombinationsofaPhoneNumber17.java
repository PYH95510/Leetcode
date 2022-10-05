package practicing;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {

	public class solution{
		
		public List<String> letterCombinations(String digits){
			List<String> answer = new ArrayList<String>();
			String[] comp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
			
			
			answer.add("");
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
/*I had so much fun to solve this problem. A problem mixed with string always gives a hard time but this one doesn't. Of course I got some help
 * to solve this problem but it was so fun to solve this problem. The basic idea for this problem is this. First we create a string array that
 * can store each mapped characters. Then create a method that could combine the input digits and all possible characters. The main idea here is
 * that we first add string to answer"" like this. Unless it will becomes empty list in String s: answer. Unless it will be empty for the first
 * Iteration so it will not go over the first iteration.
 * Basic idea for helper method is that every time we recursively call helper method, we add the result to the answer List<String>. Next time we
 * get the digit input, we add all the possible input possible digits' information from String comp[] array and add it to the result List<String>
 * By so, we are storing up the result until there is no result. The worst case of this method is 9999 because the problem's constraint says the digit
 * will be 0~4. */
 