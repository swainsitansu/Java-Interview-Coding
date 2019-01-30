/** WAP to check a number is Magic Number
 * A number is said to be Magic Number if the sum of its digits 
 * are calculated till a single digit is obtained by recursively adding the sum of its digits.
 * If the single digit comes to be 1 then the number is a magic number.
 * Ex  199 is Magic number because 1+9+9=19 .Then 1+9 =10=>1+0=1 so 1 is coming as the last.
 * @author Indrajit Bhattacharjee
 * @date Jan 23,2019
 */

package codes;

import java.util.Scanner;

public class check_MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked.");
		int n = sc.nextInt();
		int sum = 0, num = n;
		while (num > 9) {
			sum = num;
			int s = 0;
			while (sum != 0) {
				s = s + (sum % 10);
				sum = sum / 10;
			}
			num = s;
		}
		if (num == 1) {
			System.out.println(n + " is a Magic Number.");
		} else {
			System.out.println(n + " is not a Magic Number.");
		}
	}
}
