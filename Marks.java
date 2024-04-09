import java.util.Scanner;
public class Marks
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks ");
        int a = scan.nextInt();
        if(a>90)
        {
            System.out.println("Excellent");
        }
        else if(a>80 && a<=90)
        {
            System.out.println("Good");
        }
        else if(a>70 && a<=80)
        {
            System.out.println("fair");
        }
        else if(a>60 && a<=70)
        {
            System.out.println("Meet Expections");
        }
        else{
            System.out.println("Below par");
        }
    }
}