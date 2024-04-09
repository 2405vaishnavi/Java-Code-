//Write a program in java to print unique 3 digit number 
// import java.util.Scanner;
class uniqueNumber
{
    public static void main(String []args)
    {
        int a = 0;
        for(int i = 1;i<=3;i++)
        {
        for(int j = 1;j<=3;j++)
            {
        for(int k=1;k<=3;k++)
        {
            if(k != i && k != j && i != j)
            {
                a++;
         System.out.println(i+" "+j+" "+k);
            }
        }
            }
        }
        System.out.println(a);
    }
}