/**WAP to print the pallindrome word/s in a sentence
 * @author Indrajit Bhattacharjee
 * @date Jan 20,2019
 */
package codes;
import java.util.*;
class palindromeWord
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="",s3="";
        int i,len;
        char ch;
        System.out.println("Enter a sentence");
        s1=in.nextLine();
        
        s1=s1+" ";
        len=s1.length();
        
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch!=' ')
            {
                s2=s2+ch;
                s3=ch+s3;
            }
            else
            {
                if(s2.equalsIgnoreCase(s3))
                {
                    System.out.println(s2);
                }
                s2="";
                s3="";
            }
        }
    }
}
