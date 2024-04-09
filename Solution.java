
import java.util.Scanner;
class Solution {
    public static void main(String []args)
    {
        int rem, sum =0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while(a !=0){
        rem = a %10;
        sum= (sum*10) +rem;
        a = a/10;
    }
    System.out.println(sum);
    }
}


