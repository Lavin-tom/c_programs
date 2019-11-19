import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,v=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=n*2-1;i>=1;i=i-2)
      {
        for(int j=1;j<=i;++j)
        {
          System.out.print(+j+" ");
        }
        System.out.print("\n");
      }
	}
}