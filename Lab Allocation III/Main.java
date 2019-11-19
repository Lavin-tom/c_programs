import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int l1,l2,l3,n,count=0;
      Scanner s=new Scanner(System.in);
      l1=s.nextInt();
      l2=s.nextInt();
      l3=s.nextInt();
      n=s.nextInt();
      if(l1>n)
        count++;
      if(l2>n)
        count++;
      if(l3>n)
        count++;
      System.out.println(+count);
    }
}