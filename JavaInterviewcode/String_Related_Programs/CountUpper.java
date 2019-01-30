package codes;
/**
 * WAP to count the number of uppercase alphabets in a given word.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
class CountUpper
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s;
        char ch;
        int i,len,c=0;
        System.out.println("Enter a word");
        s=in.next();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                c++;
            }
        }
        System.out.println("No. of Upper case letters ="+c);
    }
}
