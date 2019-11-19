import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,count=2,sum=6;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.print("6");
      for (int i=1;count<=n;i++)
      {
        if(i%5==0)
        {
          sum=sum+i;
          System.out.print(" "+sum);
          count++;
	}
}
    }
}