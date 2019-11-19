import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,a,b;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      a=n%10;
      b=a/10;
      if(n>99)
      {
        if(b%3==0)
        System.out.println("Trendy Number");
      }
      else
        System.out.println("Not a Trendy Number");
    }
}