import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int a,b,c,d;
    float x,y;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    d=s.nextInt();
    x=(float)(a+c)/2;
    y=(float)(b+d)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",x,y);
  }
}