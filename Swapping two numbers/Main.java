import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=a;
      a=b;
      b=c;
      System.out.println(""+a);
      System.out.println(""+b);
    }
}