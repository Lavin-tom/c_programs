import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a,f,su,sum;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      f=a%10;
      su=a/10;
     sum=f+su;
      System.out.println("Alice must go in path-"+sum);
      
	}
}