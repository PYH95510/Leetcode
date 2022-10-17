package practicing;

public class DesignParkingSystem1603 {

	class ParkingSystem {

	    int big;
	    int medium;
	    int small;
	    
	    public ParkingSystem(int big, int medium, int small) {
	        this.big = big;
	        this.medium = medium;
	        this.small = small;
	    }
	    
	    public boolean addCar(int carType) {
	        if(carType == 1){
	            if(this.big == 0) return false;
	            
	            this.big = this.big-1;
	            return true;
	        }else if(carType == 2){
	            if(this.medium == 0) return false;
	            
	            this.medium = this.medium -1;
	            return true;
	        }else{
	            if(this.small == 0)return false;
	            
	            this.small = this.small-1;
	            return true;
	        }
	        
	        
	    }
	    
	    
	}

	/**
	 * Your ParkingSystem object will be instantiated and called as such:
	 * ParkingSystem obj = new ParkingSystem(big, medium, small);
	 * boolean param_1 = obj.addCar(carType);
	 */

}
