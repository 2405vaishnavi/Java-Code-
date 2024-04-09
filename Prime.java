import java.util.Scanner;
class Prime
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hom many number you want to check : ");
        int a = scan.nextInt();
        System.out.println("Enter number :");
        int count = 0;
        for(int i = 0;i<a;i++)
        {
        int n = scan.nextInt();
        for (int j =2 ;j<=n/2;j++)
        {
            if(n%j == 0){
            count++;
            break;
            }
        }    
        if(count == 0)
             System.out.println("prime ");
        else
        System.out.println(" not prime ");
        }
    } 
}