import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float a,b,c,d,e,avg=0;
      Scanner s=new Scanner(System.in);
      a=s.nextFloat();
      b=s.nextFloat();
      c=s.nextFloat();
      d=s.nextFloat();
      e=s.nextFloat();
      avg=(a+b+c+d+e)/5;
      System.out.printf("%.2f",avg);
    }
}