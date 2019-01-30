
/** WAP to check the equality of two Arrays
 * @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */


package codes;

import java.util.Arrays;

public class check_EqualityArrays {

	public static void main(String[] args) {
	int a[]= {2,8,5,6,9};
	int b[]={2,8,5,6,9};
	
	Boolean status= Arrays.equals(a, b);
	if(status)
	{
		System.out.println("Arrays are Equals");
	}
	
	else
	{
		System.out.println("Arrays are UnEquals");
	}

	}

}
