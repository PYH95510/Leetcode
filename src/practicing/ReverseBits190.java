package practicing;

public class ReverseBits190 {
	
	public class soluition{
		public int reverseBits(int n) {
			n = n>>>16 | n << 16; //2byte swap
		    n = (n&0xff00ff00)>>>8 | (n&0x00ff00ff) <<8; //1byte swap
		    n = (n&0xf0f0f0f0)>>>4 | (n&0x0f0f0f0f) <<4; //4bit swap
		    n = (n&0xcccccccc)>>>2 | (n&0x33333333) <<2;//2bit swap
		    n = (n&0xaaaaaaaa)>>>1 | (n&0x55555555) <<1;//1bit swap
			
			// I am not familiar with the bitwise operation. | is or when it comes to bitwise operation.
			
		    
		    return n;
		    
		
		}
	}
}
