import java.util.Scanner;
class sum_BN
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("First binary number ");
        String a = scan.next();
      
        System.out.println("Second binary number ");
        String b = scan.next();
       
        int a1 = Integer.parseInt(a,2);
        System.out.println(a1);
        int b1 = Integer.parseInt(b,2);
        int c = a1  + b1 ;
System.out.println(Integer.toBinaryString(c));  // convert integer to binary number
    }
}