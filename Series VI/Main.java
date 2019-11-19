import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,a=0,b=0,count=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=1;count<=n;i++)
      {
        if(i%2==1)
        {
          a=((i*i)-1);
          System.out.print(+a+" ");
          count++;
        }
        if(i%2==0)
        {
          b=((i*i)-2);
          System.out.print(+b+" ");
          count++;
        }
	}
    }
}