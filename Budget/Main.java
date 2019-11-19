import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int b,v,a,ar,l;
      float bl,vi,au,arm,le,sum;
      Scanner s=new Scanner(System.in);
      b=s.nextInt();
      v=s.nextInt();
      a=s.nextInt();
      ar=s.nextInt();
      l=s.nextInt();
      bl=(float)(b*350.34);
      vi=(float)(v*230.90);
      au=(float)(a*190.55);
      arm=(float)(ar*125.3);
      le=(float)(l*180.90);
      sum=(float)bl+vi+au+arm+le;
      if(sum<15000)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}