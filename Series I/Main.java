import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,count=1,sum=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
    for(int i=1;count<=n;i=i+2)
    {
      if(i%2==1)
      {
        sum=sum+i;
        System.out.print(+sum+" ");
         //sum=i;
      count++;
     
      }
    }
    }}