import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,squa,rect,m;
      float d,cir,p=3.14f;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      d=s.nextFloat();
      squa=a*a;
      rect=b*c;
      cir=(d*d)*p;
      System.out.println(""+squa);
      System.out.println(""+rect);
      System.out.printf("%.3f",cir);
    }
}