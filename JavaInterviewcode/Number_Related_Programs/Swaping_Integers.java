package codes;

import java.util.Scanner;

public class Swaping_Integers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the First number.....");
		System.out.println("Enter the Second number.....");
		int y = sc.nextInt();
		
		System.out.println("Before Swapping....");
		System.out.println("x =" + x + "" + "y =" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping--------------");
		System.out.println("x =" + x + "" + "y =" + y);

	}

}
