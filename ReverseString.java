class ReverseString
{
    public static void main(String []args)
{
    String a ="abcd" , b=" ";
    char ch;
    System.out.println("abcd");
    for(int i=0;i<a.length();i++)
    {
        ch = a.charAt(i);
         b = ch+b;
    }
    System.out.println(b);
}

}