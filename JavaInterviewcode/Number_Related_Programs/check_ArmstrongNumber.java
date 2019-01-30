/** WAP to check a number is Armstrong
 * An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits
 * 153=1^3+5^3+3^3, 1634=1^4+6^4+3^4+4^4
 * @author Indrajit Bhattacharjee
 * @date Jan 15,2019
 * 
 */
package codes;

import java.util.Scanner;

public class check_ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n,r,x;
		double s=0;
		System.out.println("Enter the number....");
		n=sc.nextInt();
		x=n;
		int y=n;
		int count=0;
		 while(y>0)
	        {
	        	r=y%10;
	        	count++;
	        	y=y/10;
	        }
		
		
        while(n>0)
        {
        	r=n%10;
        	s=s+mutliply(r,count);
        	n=n/10;
        }
        
        if(x==s)
        {
        	System.out.println("Armstrong Number.................");
        }
        else
        {
        	System.out.println("Not Armstrong Number...........");
        }
        sc.close();
	}
	
	public static long mutliply(int number,int power)
	{
		int f=1;
		for(int i=1;i<=power;i++)
		{
			f=f*number;
		}
		return f;
	}

}
