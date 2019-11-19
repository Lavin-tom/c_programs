import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,se,f,p,su,sum,n;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      
      for(n=(a+1);n<b;n++)
      {
      se=n%10;
      f=n/10;
      su=f+se;
      p=f*se;
      sum=su+p;
      if(n==sum)
        System.out.println(+n);
      }
    }
}