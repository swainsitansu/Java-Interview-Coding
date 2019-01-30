/** WAP to enter a word and print it in reverse order
 * @author Indrajit Bhattacharjee
 * @date Jan 05,2019
*/

package codes;

import java.util.Scanner;

public class printWord_reverse {

	public static void main(String[] args) {
		System.out.println("Enter the word");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		

	}

}
