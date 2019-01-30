
/** WAP to find the sum of all array elements
 * @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */


package codes;

public class sum_ofAllelementsArray {

	public static void main(String[] args) {
		int a[]= {10,20,3,7};
		int s=0;
		for(int i =0;i<a.length;i++)
		{
			s=s+a[i];
		}
		
		System.out.println("The sum of all elements is "+s);
		

	}

}
