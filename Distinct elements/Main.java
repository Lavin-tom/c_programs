import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,count=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(arr[i]>10)
        count=count+1;
    }
    System.out.print(+(n-count));
  }
  }