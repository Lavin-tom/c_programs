import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  int n,count=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=11;count<=n;i=i+4)
      {
        int p=i*i;
        System.out.print(+p+" ");
        count++;
      }
	}
}