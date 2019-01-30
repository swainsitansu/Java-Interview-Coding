
/** WAP to print the following pattern
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 *   @author Indrajit Bhattacharjee
 *   @date Jan 26,2019
 *   
 * 
 */

package codes;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i, j;
		for (i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}
}
