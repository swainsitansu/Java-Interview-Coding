/** WAP to find all the Phythagorial Triplets within a given range
 * We know the Phytagoras Theorem a^2+b^2=c^2.
 * So 3,4,5 are called Phythagorial Triplets because (3*3)+(4*4)=(5*5)
 * So if my range is 10 .The possible Phythagorial Triplets are:-
 * 3 4 5
   4 3 5
   6 8 10
   8 6 10
   
 * @author Indrajit Bhattacharjee
 * @date Jan 23,2019
 *  
 * 
 */

package codes;

import java.util.Scanner;

public class check_PhythagorialTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Enter the range....");
		r = sc.nextInt();
		for (int a = 1; a <= r; a++) {
			for (int b = 1; b <= r; b++) {
				int csquared = (a * a) + (b * b);
				double c = Math.sqrt(csquared);
				if (c == Math.ceil(c)) {
					System.out.println(a + " " + b + " " + (int) c);
				}

			}
		}

	}

}
