/** WAP to perform Binary Search
 * Note:Binary search can be performed only on a sorted array
 * @author Indrajit Bhattacharjee
@Date Jan 19,2019
 */

package codes;

public class BinarySearch {

	public static void main(String[] args) {

		int array[] = { 2, 4, 8, 10, 12 };

		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;
		int search = 8;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " isn't present in the list.\n");
	}

}
