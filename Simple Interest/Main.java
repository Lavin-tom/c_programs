import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int p,n;
      float r,simple;
      Scanner s=new Scanner(System.in);
      p=s.nextInt();
      n=s.nextInt();
      r=s.nextFloat();
     simple=(p*n*r)/100;
      System.out.printf("%.2f",simple);
    }
}