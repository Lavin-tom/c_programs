import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int a,b,p,d;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    p=2*(a+b);
    d=a*b;
    System.out.println(""+p+"m");
    System.out.println(""+d+"sqm");
  }
}