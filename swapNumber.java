import java.util.Scanner;
class swapNumber
{
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value of A ");
        int a = obj.nextInt();
        System.out.println("Enter a value of B");
        int b = obj.nextInt();
         b = b + a;
         a = b -a;
             
         b = b - a;
        System.out.println(a+ " "+b);
    }
}