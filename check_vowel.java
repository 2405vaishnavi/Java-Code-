// write a program to check a vowel is present in a String .
import java.util.Scanner;
class check_vowel
{
    public static void main(String []args)
    { 
    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value ");
        String x = obj.next();
        for(int i =0;i < x.length();i++)
        {
        if(x.charAt(i)=='a'|| x.charAt(i)=='e'||x.charAt(i)=='i'|| x.charAt(i)=='o'|| x.charAt(i)=='u'    )
        {
            System.out.println("yes");
        }
    }
}
}