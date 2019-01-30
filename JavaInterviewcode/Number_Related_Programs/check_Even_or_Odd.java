/**WAP to check a number is even or odd
 * A number is 'even' if its remainder is zero when / by 2 else odd
 * Even numbers are 2,4,6,8,...
 * Odd numbers are 1,3,5,7,....
 * @author Indrajit Bhattacharjee
 * @Date Jan 23,2019
 */



package codes;

import java.util.Scanner;

public class check_Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		if (n % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

	}

}
