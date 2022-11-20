package practicing;

public class ArithmeticSlices413 {

	class Solution {

		public int numberOfArithmeticSlices(int[] n) {
		    int k=n.length;
		    if(k<3)
		        return 0;
		    int results=0,p=0;
		    for(int i=0;i<k-2;i++)
		    {
		        int a=n[i];
		        int b=n[i+1];
		        int c=n[i+2];
		        if(a-b == b-c)
		        {
		            p++;
		            results+=p;
		        }
		        else
		        {
		            p=0;
		        }
		    }
		    return results;
		}
		}

}
/*It took so much time for me to solve this problem. I thought to solve this problem, I should use special technique or something but
 * at the end, to solve this, I just need intuition to solve this question. As we could know from the algorithm, we just assign the value to each
 * number and then find if there is satisfied numbers. trick here is we use i index until k-2 to avoid array index out of boundary for c n[i+2].
 * Further  more, here we are using a simple math that if there are consecutive numbers added to array, the result will be added 1+2+3+4+5...
 * if there is not condition satisfying number in the middle of satisfying numbers, we just reset the adding p and then add p from the beginning
 * That is the key solution for this problem.*/
