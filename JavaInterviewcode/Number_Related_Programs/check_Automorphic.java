/** WAP to check a number is Automorphic
 * an automorphic number (sometimes referred to as a circular number) is a number
 *  whose square "ends" in the same digits as the number itself.
 *   For example, 5^2 = 25, 
 *   6^2 = 36, 
 *   76^2 = 5776,
 *   376^2 = 141376
 *   @author Indrajit Bhattacharjee
 *   @date Jan 20,2019
 * 
 */

package codes;

import java.util.Scanner;

public class check_Automorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number....");
		n = sc.nextInt();
		sc.close();
		int d = 1;
		int i;
		for (i = n; i > 0; i = i / 10) {
			d = d * 10;
		}
		if ((n * n) % d == n) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not Automorphic Number");
		}

	}

}
