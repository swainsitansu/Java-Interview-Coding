package codes;

import java.util.Scanner;

public class check_PowerofaNumber {

	public static void main(String[] args) {
		
		int power ,number;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		System.out.println("Enter the power");
		power=sc.nextInt();
			int f=1;
			for(int i=1;i<=power;i++)
			{
				f=f*number;
			}
			
		System.out.println("The power of is "+f);
		

	}

}
