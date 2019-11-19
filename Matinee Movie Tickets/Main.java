import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a;
      double t,b=13.30,c=10.15,d=18.00,e=22.00;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      t=s.nextDouble();
      if( (t==b) && (a>13) )
        System.out.println("$5.00");
      if ( (t==b) && (a<13))
        System.out.println("$2.00");
      if((a>13) && (t== c)||(t==d) ||(t==e))
        System.out.println("$8.00");
      if((a<13) && (t== c)||(t==d) ||(t==e))
        System.out.println("$4.00");
	}
}