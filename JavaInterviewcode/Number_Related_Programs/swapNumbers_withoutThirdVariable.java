/**WAP to swap two numbers without using a third variable
 * @author Indrajit Bhattacharjee
 * @date Jan 26,2019
 */



package codes;

import java.util.Scanner;

public class swapNumbers_withoutThirdVariable {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number....");
		int x = sc.nextInt();	
		System.out.println("Enter the Second number....");
		int y = sc.nextInt();
		System.out.println("Numbers before Swapping...");
		System.out.println("First number ="+x+ " "+"Second number ="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers after Swapping...");
		System.out.println("First number ="+x+ " "+"Second number ="+y);

	}

}
