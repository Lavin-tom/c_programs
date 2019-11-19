import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		float sp,d,t,m,n;
      Scanner s=new Scanner(System.in);
      sp=s.nextFloat();
 	  d=s.nextFloat();
      t=s.nextFloat();
      m=(float)sp/60;
      if(d<m)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}