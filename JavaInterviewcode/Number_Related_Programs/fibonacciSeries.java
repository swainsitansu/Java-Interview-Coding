/**WAP to print the Fibonacci series for a given range
 * It is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
The simplest is the series 1, 1, 2, 3, 5, 8, etc
* @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of fibonacci terms you want ..........");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;

		for (int i = 2; i < n; i++) {

			// storing sum in the
			// preceding location
			a[i] = a[i - 2] + a[i - 1];
		}

		for (int i = 0; i < n; i++) {

			System.out.print(a[i] + " ");
		}
		sc.close();

	}
}