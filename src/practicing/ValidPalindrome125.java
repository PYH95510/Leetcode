package practicing;

public class ValidPalindrome125 {

	class Solution {
	    public boolean isPalindrome(String s) {
	        for (int i = 0, j = s. length() - 1 ; i < j ; i++, j--){
	            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
	                i++;
	            }
	            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
	                j--;
	            }
	            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
	            return false;
	        }
	        return true;
	    }
	}
//	class Solution {
//		  public boolean isPalindrome(String s) {
//		    StringBuilder builder = new StringBuilder();
//
//		    for (char ch : s.toCharArray()) {
//		      if (Character.isLetterOrDigit(ch)) {
//		        builder.append(Character.toLowerCase(ch));
//		      }
//		    }
//
//		    String filteredString = builder.toString();
//		    String reversedString = builder.reverse().toString();
//
//		    return filteredString.equals(reversedString);
//		  }
//
//		  /** An alternate solution using Java 8 Streams */
//		  public boolean isPalindromeUsingStreams(String s) {
//		    StringBuilder builder = new StringBuilder();
//
//		    s.chars()
//		        .filter(c -> Character.isLetterOrDigit(c))
//		        .mapToObj(c -> Character.toLowerCase((char) c))
//		        .forEach(builder::append);
//
//		    return builder.toString().equals(builder.reverse().toString());
//		  }
//		}
}

/*When it comes to palindrme question, two things should always we have to have in minde. Either we will compare two strings using reverse() or builder
 *compare two indexes from the middle and return early if we find different character. Of course it should be false. I prefer above solution. Both are O(n)
 *time complexity solution but only above one has O(1) space complexity whereas below one is o(n)*/
 