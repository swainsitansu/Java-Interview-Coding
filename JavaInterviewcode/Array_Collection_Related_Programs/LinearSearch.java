/** WAP to perform Linear search(usually performed on unsorted array)
 * @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */


package codes;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 2, 7, 1, 6, 87 };
		int val;
		System.out.println("Enter the number to search");
		Scanner sc = new Scanner(System.in);
		val = sc.nextInt();
		sc.close();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				System.out.println("The value is present at location " + i + " in a array");
				break;
			}

		}

	}

}
/* OUTPUT
Enter the number to search
6
The value is present at location 3 in a array 
*/
