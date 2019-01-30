/**WAP to find all divisors of a number
 * A divisor of a number is that   number whichcompletely divides number.
 * Eg divisors of 100 is
 * 1 2 4 5 10 20 25 50 100 
 * @author Indrajit Bhattacharjee
 * @date Jan 15,2019
 * 
 * 
 */

package codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class find_DivisorsofNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number ...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> divisors = new ArrayList<Integer>();

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				divisors.add(i);
			}
		}
		Iterator<Integer> iter = divisors.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}

		sc.close();

	}

}
