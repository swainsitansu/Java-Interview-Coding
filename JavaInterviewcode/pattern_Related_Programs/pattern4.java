/** WAP to print the following pattern
 *   1
 *   1 2
 *   1 2 3
 *   1 2 3 4
 *   1 2 3 4 5
 *   @author Indrajit Bhattacharjee
 *   @date Jan 26,2019
 *   
 * 
 */


package codes;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i, j, num;

		for (i = 0; i < n; i++) {

			num = 1;

			for (j = 0; j <= i; j++) {

				System.out.print(num + " ");

				num++;
			}

			System.out.println();
		}
	}

}
