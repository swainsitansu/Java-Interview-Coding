/**WAP to check a number is pallindrome
 * A number is pallindrome if on reversing the number is same
 * Eg 121 is same even after reversing but 123 is not pallindrome
 * @author Indrajit Bhattacharjee
 * @date Jan 23,2019
 * 
 */



package codes;

import java.util.Scanner;

public class check_PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, r, x;
		int rev = 0;
		System.out.println("Enter the number....");
		n = sc.nextInt();
		x = n;

		while (x > 0) {
			r = x%10;
			rev = (rev * 10) + r;
			n = n/10;
		}

		if (rev == n) {
			System.out.println("Number is Pallindrome");
		} else {
			System.out.println("Number is not Pallindrome");
		}

	}

}
