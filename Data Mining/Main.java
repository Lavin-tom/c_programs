import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,t,se,se1,f,sum=0,sum1=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      t=n%10;
      se=n/10;
      se1=se%10;
      f=n/100;
      if( f%2==0 && se1%2==0 && t%2==0)
        sum=(f+se1+t);
      if( f%2==1 && se1%2==1 && t%2==1)
        sum1=(f+se1+t);
      if( f%2==1 && se1%2==0 && t%2==0)
      {
      sum=(se1+t);
      sum1=f;
      }
      if( f%2==0 && se1%2==1 && t%2==0)
      {
      sum=(f+t);
      sum1=se1;
      }
      if( f%2==0 && se1%2==0 && t%2==1)
      {
      sum=(f+se1);
      sum1=t;
      }
      if( f%2==0 && se1%2==1 && t%2==1)
      {
      sum=(f);
      sum1=(se1+t);
      }
      if( f%2==1 && se1%2==0 && t%2==1)
      {
      sum=(se1);
      sum1=(f+t);
      }
       if( f%2==1 && se1%2==1 && t%2==0)
      {
      sum=(t);
      sum1=(f+se1);
      }
      
      if(sum==sum1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}