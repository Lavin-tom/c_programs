import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a;
      float t;
      double d;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      t=s.nextFloat();
      if(a==2)
      {
        d=t+(t*.5);
        System.out.println(+d);
      }
      if(a==3)
      {
        d=(float)t+(t);
        System.out.println(+d);
      }
      if(a>3)
        System.out.println("Number of items is more");
	}
}