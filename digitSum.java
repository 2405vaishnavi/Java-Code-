import java.util.Scanner;
class digitSum
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number");
        int a = scan.nextInt();
        int  rem,sum =0;
        while(a !=0){
        rem = a %10;
        sum =sum +  rem;
        a = a/ 10;
        }
        System.out.println(sum);        
    }
}