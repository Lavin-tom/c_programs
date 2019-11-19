import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,p,d,r;
          
      Scanner s= new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      p=a*b;
      d=a/b;
      r=a%b;
      System.out.println(""+p);
      System.out.println(""+d);
      System.out.println(""+r);
    }
}