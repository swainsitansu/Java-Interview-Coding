/**WAP to find Combinations of any 3 digit number
 * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 * 
 */

package codes;

import java.util.Scanner;

public class printCombinationsof_3Digit_Number {

	public static void main(String[] args) {

		System.out.println("Enter the number ...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String ss = Integer.toString(n);
		// System.out.println(ss.length());

		String str = String.valueOf(n);// Converting int to String

		int len = str.length();

		int a[] = new int[len];

		for (int i = 0; i < len; i++) {

			a[i] = str.charAt(i);

			// char to integer - google

		}
		
		System.out.println("Combinations of "+n+" are...");

		int[] input = new int[a.length];
		for (int j = 0; j < a.length; j++) {

			input[j] = (Character.getNumericValue(a[j]));

		}

		for (int x = 0; x < len; x++) {
			for (int y = 0; y < len; y++) {
				for (int z = 0; z < len; z++) {

					if (x != y && y != z && z != x) {
						System.out.println(input[x] + "" + input[y] + "" + input[z]);
					}
				}
			}
		}

		sc.close();

	}
}
