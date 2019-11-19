import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a%2==0)
        System.out.println("Even");
        else
          System.out.println("Odd");
      
    }
}