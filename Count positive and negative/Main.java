import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,n,ne=0,p=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=0;i<n;i++)
      {
        a=s.nextInt();
      if(a>0)
        p=p+1;
       if(a<0)
        ne=ne+1;
      }
      System.out.println("Number of positive numbers is "+p+" and the number of negative numbers is "+ne);
    }
}