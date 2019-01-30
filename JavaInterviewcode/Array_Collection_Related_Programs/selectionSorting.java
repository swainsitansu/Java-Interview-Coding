
/** WAP to perform Selection sorting
 * @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */


package codes;

public class selectionSorting {

	public static void main(String[] args) {
		int a[]= {10,28,4,3,15,88,100,0};
		int l=a.length;
		int i,j,temp,minValue,minIndex;
		
	
		for(i =0;i<l-1;i++)
		{
			
			minValue=a[i];
			minIndex=i;
			for( j=i+1;j<l;j++)
			{
				
				//Ascending code for descending it will be a[j]>minValue
				if(a[j]< minValue)
				{
					minValue=a[j];
					minIndex=j;
				}
			}
			
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
			
		}
		
		//Print the sorted Array
		for(int k =0;k<l;k++)
		{
		System.out.println(a[k]+ " ");
		}
		

	}

}
