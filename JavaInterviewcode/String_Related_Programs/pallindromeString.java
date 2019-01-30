/** WAP to find string is Pallindrome
 * A string/word is pallindrome if on reversing the word is same.
 * Eg 'madam' ,'amma' 'mom' are pallindrome
 * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;

import java.util.Scanner;

public class pallindromeString {

	public static void main(String[] args) {
		
		String str;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First word");
		str=sc.next();
		
		StringBuilder sb =new StringBuilder(str);
		
		if(str.equals(sb.reverse().toString()))
		{
			System.out.println("String is Pallindrome");
		}
		
		else
		{
			System.out.println("String is not Pallindrome");
		}


	}

}
