/** WAP to find the Largest and Smallest number in Array.
* @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */
package codes;

public class Max_Min_Value {

	public static void main(String[] args) {
		int a[] = { 10, 12, 0, 9, 100, 17 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}

		System.out.println("Maximum number is :" + max);
		System.out.println("Miniumum number is :" + min);

	}

}
