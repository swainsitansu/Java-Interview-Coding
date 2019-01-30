/** WAP to find the largest number without a target digit.
 * 
 * if number is 123
 * digit is 2
 * so next largest number without digit=119
 * 
 * if number is 4582
 * digit is 5
 * so next largest number without digit=4499
 * 
* @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;

public class LargestNumberwithout_Digitgiven {

	public static void main(String[] args) {
		
		int n=143;
		int digit=1;
		while(String.valueOf(n).contains(String.valueOf(digit))){
		
			n=n-1;
		}
		
		System.out.println(n);
		
		}	

	

}
