import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,count=1,t,sum=0;
     Scanner s=new Scanner(System.in);
      t=s.nextInt();
      
    do
    {
      n=s.nextInt();
      sum=sum+n;
      if(sum<t)
      count++;
    }
      while(sum<t);
      System.out.println("The number of turns is "+count);
    }
}