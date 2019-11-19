import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int l1,l2,l3;
      String l;
      Scanner s=new Scanner(System.in);
        l1=s.nextInt();
      l2=s.nextInt();
      l3=s.nextInt();
      s.nextLine();
      l=s.nextLine();
      if( l.equals("L1"))
      {
        if( l2>l3 )
          System.out.println("L3");
        else
          System.out.println("L2");
      }
      if( l.equals("L2"))
      {
        if( l1>l3 )
          System.out.println("L3");
        else
          System.out.println("L1");
      }
      if( l.equals("L3"))
      {
        if( l2>l1 )
          System.out.println("L1");
        else
          System.out.println("L2");
      }
    }
}