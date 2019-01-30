/**WAP to find the binary equivalent of a number(Base 10)
 * For more info kindly go through this https://www.wikihow.com/Convert-from-Decimal-to-Binary
* @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */



package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class decimal_Binary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, r;
		System.out.println("Enter number");
		n = in.nextInt();
		List<Integer> binaryNumbers = new ArrayList<Integer>();
		int x = n;
		while (x > 0) {
			r = x % 2;
			binaryNumbers.add(r);
			x = x / 2;

		}

		Collections.reverse(binaryNumbers);

		Iterator<Integer> itr = binaryNumbers.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
