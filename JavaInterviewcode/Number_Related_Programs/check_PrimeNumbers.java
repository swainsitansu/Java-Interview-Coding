/**WAP to check a number is prime number
 * A number is said to be prime only if it has 2 factors.
 * the smallest prime(also even ) is 2
 * Logic is to check numbers factor only 2 (not more or less) then prime.
 * @author Indrajit Bhattacharjee
 * @date Jan 23,2019
 * 
 */

package codes;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..........");
		int n = sc.nextInt();
		int i = 0;
		int f = 0;

		for (i = 1; i <= n; i++) {

			if (n % i == 0) {
				f++;
			}
		}
		if (f == 2) {
			System.out.println("Prime ");
		} else {
			System.out.println("Not Prime ");
		}

	}

}
