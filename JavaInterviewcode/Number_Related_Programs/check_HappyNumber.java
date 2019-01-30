/** WAP to check a number is Happy
 * A happy number is a number in which the eventual sum of the square of the digits of the number is equal to 1
 * Eg 31 is Happy because 31->3*3+1*1=10->1*1+0+0=>1 
 * but 2 is unhappy because
 * 2*2 = 4
 * ->4*4 = 16
 * ->1*1 + 6*6 = 37
 * ->3*3 + 7*7 = 58
 * ->25 + 64 = 89
 * ->64 + 81 = 145
 * ->1 + 16 + 25=42
 * ->16 + 4=20
 * ->2*2 + 0*0 = 4
 * hence, 2 is unhappy as 4 came twice (first calculation also gave 4), it will loop endlessly without giving 1 ever
 * 
 * 
 * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */



package codes;

import java.util.Scanner;

public class check_HappyNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, s, div, dig, arr[] = new int[100], dvc = 0, i;
		boolean repeated;
		System.out.println("Enter a number");
		n = in.nextInt();
		do {
			s = 0;
			for (div = n; div > 0; div = div / 10) {
				dig = div % 10;
				s = s + dig * dig;
			}

			if (s == 1) {
				break;
			} else {
				repeated = false;
				for (i = 0; i < dvc; i++) {
					if (s == arr[i]) {
						repeated = true;
					}
				}

				if (!repeated) {
					arr[dvc] = s;
					dvc++;
				}

				n = s;
			}

		} while (!repeated);

		if (s == 1)
			System.out.println("It is Happy number");
		else
			System.out.println("It is Unhappy number");
	}
}
