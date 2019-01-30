/** WAP to print the following pattern
 *   1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 *   *****
 *   @author Indrajit Bhattacharjee
 *   @date Jan 26,2019
 *   
 * 
 */



package codes;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int i, j, num = 1;

		for (i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {

				System.out.print(num + " ");

				num = num + 1;
			}

			System.out.println();
		}
	}

}
