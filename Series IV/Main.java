import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,count=2,sum=1;
          float a;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.print("0.5 ");
      for (int i=3;count<=n;i++)
      {
          sum=sum*3;
         a=(sum/2)+.5f;
          System.out.print(+a+" ");
          count++;
	}

    }
}