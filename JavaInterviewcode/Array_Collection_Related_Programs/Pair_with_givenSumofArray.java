/** WAP to find pairs of numbers for a given sum of array
 * @author Indrajit Bhattacharjee
 * @Date Jan 19,2019
 */

package codes;

public class Pair_with_givenSumofArray {

public static void main(String[] args) {
		
		int a[]= {8,7,2,5,3,1};
		int sum=10;
		
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("The pairs are" + "("+a[i]+","+a[j]+")"); //(8,2) and (7,3)
				}
			}
		}
				
	}

}

/* OUTPUT
The pairs are(8,2)
The pairs are(7,3)

*/
