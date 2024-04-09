import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        char arr1[],arr2[];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        arr1 = s1.toCharArray();
        arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean c = Arrays.equals(arr1,arr2);
        if(c == true)
        {
            System.out.println(" Anagram ");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}