import java.util.Scanner;
class Prime1
{
    public static void main(String []args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter low value ");
        int a = obj.nextInt();
        System.out.println("Enter high value ");
        int b = obj.nextInt();

         for(int i = a;i<=b;i++)
         {
                    int c =0;
            for(int j =2;j<=b/2;j++){
            if(i%j == 0){
            c++;
            break;
            }
            }
            if(c == 0){
            System.out.println(i);
            // else 
            // System.out.println(i);
         }
         }
         }
    }
