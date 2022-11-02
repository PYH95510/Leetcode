package practicing;

public class RomantoInteger13 {

	class Solution {
	    public int romanToInt(String s) {
	        int answer = 0, tmtnumber = 0;
	        for(int i = s.length()-1; i >= 0; i--){
	            switch(s.charAt(i)){
	                case 'I' : 
	                    tmtnumber = 1;
	                    break;
	                case 'V' :
	                    tmtnumber = 5;
	                    break;
	                case 'X' :
	                    tmtnumber = 10;
	                    break;
	                case 'L' :
	                    tmtnumber = 50;
	                    break;
	                case 'C' :
	                    tmtnumber = 100;
	                    break;
	                case 'D' :
	                    tmtnumber = 500;
	                    break;
	                case 'M' :
	                    tmtnumber = 1000;
	                    break;
	            }
	            if(4*tmtnumber<answer)answer -= tmtnumber;
	                else answer+= tmtnumber;
	                //we should multiply 4 because answer could be up to 80 or 800
	                //in the answer, previous number is in. tmtnumber is new number, according to roman number, new input number should always bigger than the previous number. However, even though we multiplied 4 times, it is still smaller than the previous number, then it means IXC comes before for either VLD or XCM to make it smaller.
	            
	        }
	        return answer;
	        
	        
	    }
	}

}
