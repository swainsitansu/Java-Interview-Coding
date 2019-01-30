/** WAP to check a number is Perfect 
 * A number is said to be perfect if its positive factors(except the number itself) sum
 * is equal to the number
 * Eg 6 is perfect because its factors(except the number) sum is 1+2+3=6(the number itself).
 * Eg 28 is perfect because 1+2+4+7+14 =28. 
 * @author Indrajit Bhattacharjee
 * @Date Jan 23,2019
 * 
 * 
 */

package codes;

import java.util.Scanner;

public class check_PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, x;
		System.out.println("Enter the number....");
		n = sc.nextInt();
		x = n;
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s = s + i;
			}
		}

		if (s == x) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}

		sc.close();
	}

}
