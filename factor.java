import java.util.Scanner;
class factor
{
    public static void main(String []args)
    {
        int g = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Common factors are :");
        for(int i = 1; i<=a ;i++)
        {
            if(a%i == 0 && b %i == 0)
          {
                System.out.println(i +" ");
          }       
            if(a%i == 0 && b %i == 0)
        g = i;   
    }
    System.out.println("Greatest number :"+g);
}
}