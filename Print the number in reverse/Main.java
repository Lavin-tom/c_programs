import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b,n;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      while(a>=b)
      {
      System.out.println(+a);
      a--;
      }
    }
}