import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,count=1,sum=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      
      for (int i=3;count<=n;i++)
      {
          sum=sum*3;
          System.out.print(+sum+" ");
          count++;
	}

    }
}