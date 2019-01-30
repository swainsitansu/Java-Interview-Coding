/** WAP to find the length of a word without using length()
  * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;

import java.util.Scanner;

public class length_String {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.next();
		int len=str.lastIndexOf("");
		System.out.println("The length is "+len);

	}

}
