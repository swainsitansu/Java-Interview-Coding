/**WAP to check if the given number is in power of 2.

* if enter number =4

* the 2^2 =4 so 4 is a power of 2

* if enter number =7

* the 2^any number !=7 so 7 is a power of 2

* if enter number =32

* the 2^5 =32 so 32 is a power of 2

*

 * @author Indrajit Bhattacharjee

* @Date Jan 25,2019

*

 */
package codes;
import java.util.Scanner;

public class Power_ofTwo

{

	public static void main(String[] args)

	{

		int n;

		System.out.println("Enter the number to check.....");

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int x = n;

		sc.close();

		int r, counter = 0, prod = 1;

		while (n > 0)

		{

			r = n % 2;

			if (r == 0)

			{

				counter++;

			}

			n = n / 2;

		}

		for (int i = 1; i <= counter; i++)

		{

			prod = prod * 2;

		}

		if (prod == x)

		{

			System.out.println("The number is power of 2");

		}

		else

		{

			System.out.println("The number is not power of 2");

		}

	}

}
