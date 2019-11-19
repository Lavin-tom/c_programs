import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a,b,x,cost,pro,spent;
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      a=s.nextInt();
      b=s.nextInt();
      cost=x*a;
      spent=x*b;
      pro=(cost-spent)-100;
      System.out.println("The profit obtained is Rs."+pro);
      
	}
}