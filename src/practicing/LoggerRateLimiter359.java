package practicing;

import java.util.HashMap;

public class LoggerRateLimiter359 {

	class Logger {

	    HashMap<String, Integer> map;
	    public Logger() {
	        map = new HashMap<>();
	    }
	    
	    public boolean shouldPrintMessage(int timestamp, String message) {
	        
	        
	        
	        if(map.containsKey(message) && timestamp - map.get(message) < 10)return false;
	            
	        
	        
	        
	        map.put(message,timestamp);
	        return true;
	        
	        
	        
	        
	        
	    }
	    
	    
	}

	/**
	 * Your Logger object will be instantiated and called as such:
	 * Logger obj = new Logger();
	 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
	 */

}
/*This problem is so easy to solve. Basically just put data to map and then compare the time between added data.*/