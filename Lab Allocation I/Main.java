import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int l1,l2,l3;
      Scanner s=new Scanner(System.in);
      l1=s.nextInt();
      l2=s.nextInt();
      l3=s.nextInt();
      if( l1<l2 && l1>l3)
        System.out.println("L3");
      if( l1>l2 && l2<l3)
        System.out.println("L2");
      if( l1<l2 && l1<l3)
        System.out.println("L1");
      
    }
}