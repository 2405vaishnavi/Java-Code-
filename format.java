import java.util.Scanner;
class format
{
    public static void main(String[] args)
    {
        int a;
        // char x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number");
        a=scan.nextInt();
        System.out.println(a +"+ "+a+a+" +"+a+a+a+"");
    }
}