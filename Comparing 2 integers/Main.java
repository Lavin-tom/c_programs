import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      if(a==b)
        System.out.println(+a+" and "+b+" are equal");
      if(a>b)
        System.out.println(+a+" greater than "+b);
      if(a<b)
        System.out.println(+a+" less than "+b);
    }
}