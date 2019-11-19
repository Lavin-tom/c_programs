import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,d,date;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      if(b==99)
      {
      c=1900+a;
      d=1900+b;
      }
      else
      {
        c=1900+a;
        d=2000+b;
      }
      date=d-c;
      System.out.println(+date);
    }
}