package codes;
/**
 * WAP to reverse a word
 * 
 * @author Indrajit Bhattacharjee
 * @date Jan 05,2019
 */
import java.util.*;
class RevWord
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1,s2="";
        char ch;
        int len,i;
        System.out.println("Enter a word");
        s1=in.next();
        len=s1.length();
        in.close();
        
        for(i=len-1;i>=0;i--)
        {
            ch=s1.charAt(i);
            s2=s2+ch;
        }
        System.out.println("Reverse of word :"+s2);
    }
}
