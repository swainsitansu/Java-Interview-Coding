/**WAP to find the Factorial of a number
 * For an integer n greater than or equal to 1, 
 * the factorial is the product of all integers less than or equal to n but greater than or equal to 1.
 *  factorial value of 0 is defined as equal to 1
 . The factorial values for negative integers are not defined.
 Eg 5! is 5*4*3*2*1=120
 * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;

import java.util.Scanner;

public class factorial_of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number....");
		int n = sc.nextInt();
		int factorial = 1;
		if (n == 0) {
			System.out.println("The Factorial is 1");
		} else {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("The Factorial is " + factorial);
		}

	}

}
