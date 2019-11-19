import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b,n;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      //for(n=a;n<=b;n++)
      n=a;
      while(n<=b)
      {
      System.out.println(+n);
      n++;
      }
    }
}