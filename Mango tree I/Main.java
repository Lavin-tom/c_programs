import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a,b,n;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      n=s.nextInt();
      if(n%a==1)
        System.out.println("Yes");
      else if(n%a==0)
     System.out.println("Yes");
      else
        System.out.println("No");
	}
}