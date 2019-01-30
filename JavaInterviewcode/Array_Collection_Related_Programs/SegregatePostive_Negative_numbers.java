/**  WAP to segregate positive and negative numbers in an array
 * @author Indrajit Bhattacharjee
 * @Date Jan 19,2019
 */

package codes;

import java.util.ArrayList;
import java.util.List;

public class SegregatePostive_Negative_numbers {

	public static void main(String[] args) {
		int a[] = { 2, -8, 10, -15, -2, 11, 3, -9, 15, -20 };
		List<Integer> positive = new ArrayList<Integer>();
		List<Integer> negative = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negative.add(a[i]);

			}
			else {

				positive.add(a[i]);
			}
		}

		System.out.println("The negative numbers are...");
		for (int k = 0; k < positive.size(); k++) {
			System.out.print(positive.get(k) + " ");
		}
		System.out.println();
		System.out.println("The positive numbers are...");
		for (int k = 0; k < negative.size(); k++) {
			System.out.print(negative.get(k) + " ");
		}

	}

}

/* OUTPUT
 The negative numbers are...
2 10 11 3 15 
The positive numbers are...
-8 -15 -2 -9 -20 

*/
