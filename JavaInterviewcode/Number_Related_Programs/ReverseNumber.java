/** WAP to reverse a Number
 * If number is 278 the reverse is 872
 * @author Indrajit Bhattacharjee
 * @date Jan 2,2019
 * 
 * 
 */

package codes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rev = 0, r;
		while (n > 0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;

		}

		System.out.println("Reverse is " + rev);
	}
}
