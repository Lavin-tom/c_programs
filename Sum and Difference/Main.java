import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            int a,b,sum,dif;
          Scanner s=new Scanner(System.in);
          a=s.nextInt();
          b=s.nextInt();
          sum=a+b;
          dif=a-b;
          System.out.println(""+sum);
          System.out.println(""+dif);
        }
}