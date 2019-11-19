import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,p;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      for(int i=1;i<=b;i++)
      {
        p=a*i;
      System.out.println(+i+"*"+a+"="+p);
      }
    }
}