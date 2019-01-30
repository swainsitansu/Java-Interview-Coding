/** WAP to input names and print them Alphbetically using selection sort
 * @author Indrajit Bhattacharjee
 * @Date Jan 19,2019
 */
package codes;
import java.util.*;
class sortNames_SelectionSorting
{
	public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String name[]=new String[10];
        int i,j,minpos;
        String temp;
        
        System.out.println("Enter 10 names ");
        for(i=0;i<10;i++)
        {
            name[i]=in.next();
            name[i]=name[i].toUpperCase();
        }
        
        //selection sorting
        for(i=0;i<9;i++)
        {
            minpos=i;
            for(j=i+1;j<10;j++)
            {
                if(name[j].compareTo(name[minpos])<0)
                {
                    minpos=j;
                }
            }
            temp=name[i];
            name[i]=name[minpos];
            name[minpos]=temp;
        }
        
        System.out.println("Names in Sorted order");
        for(i=0;i<10;i++)
        {
            System.out.println(name[i]);
        }
        in.close();
    }
}
