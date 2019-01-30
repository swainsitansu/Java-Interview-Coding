package codes;

/** WAP to check two numbers are Ambical Pair
 * 
 *  
 *  Let 2 nos. A and B are there.
  when sum of factors of A=B
  and sum of factors of B=A, then they are amicable pair.
  eg. 220 and 284
WAP to input 2 numbers and check are they amicable
 pair. 
 
 
 
 @author Indrajit Bhattacharjee
 @date Jan 23,19
 
 */
import java.util.*;
public class AmicablePair
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int i,a,b,s1=0,s2=0;
        System.out.println("Enter 1st number");
        a=in.nextInt();
        System.out.println("Enter 2nd number");
        b=in.nextInt();
        in.close();
        System.out.println("Factors of "+a +"=");
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
                s1=s1+i;
            }
        }
        
        System.out.println("\nFactors of "+b +"=");
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            {
                System.out.print(i+" ");
                s2=s2+i;
            }
        }
        if(s1==b && s2==a)
        {
            System.out.println("\nAmicable pair");
        }
        else
        {
          System.out.println("\nnot Amicable pair");  
        }
    }
}
