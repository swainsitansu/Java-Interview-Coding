/** WAP to find the factorial of a number in recursion way
 * 
 * @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */
 

package codes;

import java.util.Scanner;

public class factorial_recursionWay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number....");
		int n = sc.nextInt();
		int x=fact(n);
		System.out.println("Factorial is "+x);
		
		
		

	}
	
	public static int fact(int n)
	{
		if(n==0 ||n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

}
