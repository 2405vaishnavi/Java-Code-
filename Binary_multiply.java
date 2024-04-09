import java.util.Scanner;
class Binary_multiply
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int b = Integer.parseInt(a,2);
        System.out.println(b);
        String a1 = scan.next();
        int b1 = Integer.parseInt(a1,2);
        System.out.println(b1);
        // System.out.println(Integer.toBinaryString(b1));   
        int c = b*b1;
        System.out.println(Integer.toBinaryString(c));

System.out.println(Integer.toHexString(15));    
System.out.println(Integer.toOctalString(19));
    }

}