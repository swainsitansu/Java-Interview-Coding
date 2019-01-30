/**WAP to find the sum of digits of a number.
 * If number is 274 then sum of digits is 2+7+4=13
 * @author Indrjit Bhattacharjee
 * @date Jan 20,2019
 */

package codes;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, r, s = 0;
		System.out.println("Enter the number....");
		n = sc.nextInt();

		while (n > 0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}

		System.out.println("Sum of digits = " + s);

		sc.close();

	}
}
