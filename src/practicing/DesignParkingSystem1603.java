package practicing;

public class DesignParkingSystem1603 {

//	class ParkingSystem {
//
//	    int big;
//	    int medium;
//	    int small;
//	    
//	    public ParkingSystem(int big, int medium, int small) {
//	        this.big = big;
//	        this.medium = medium;
//	        this.small = small;
//	    }
//	    
//	    public boolean addCar(int carType) {
//	        if(carType == 1){
//	            if(this.big == 0) return false;
//	            
//	            this.big = this.big-1;
//	            return true;
//	        }else if(carType == 2){
//	            if(this.medium == 0) return false;
//	            
//	            this.medium = this.medium -1;
//	            return true;
//	        }else{
//	            if(this.small == 0)return false;
//	            
//	            this.small = this.small-1;
//	            return true;
//	        }
//	        
//	        
//	    }
//	    
//	    
//	}

	/**
	 * Your ParkingSystem object will be instantiated and called as such:
	 * ParkingSystem obj = new ParkingSystem(big, medium, small);
	 * boolean param_1 = obj.addCar(carType);
	 */

	class ParkingSystem {
	    int [] system=new int[3];
	    public ParkingSystem(int big, int medium, int small) {
	        system[0] = big;
	        system[1] = medium;
	        system[2] = small;
	    }
	    
	    public boolean addCar(int carType) {
	        if(system[carType-1] -1 < 0)return false;
	        else{
	            system[carType-1]--;
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
/*To write a code a little bit more neat, we could write it like this. It is very easy to understand.*/