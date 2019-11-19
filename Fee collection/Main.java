import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       String type;
     float t,b,h,sum=0;
      Scanner s=new Scanner(System.in);
      type=s.nextLine();
      t=s.nextFloat();
      b=s.nextFloat();
      h=s.nextFloat();
      
      if(type.equals("MSDS"))
      {
        sum=t+b;
      System.out.printf("%.2f",sum);
      }
      if(type.equals("MSH"))
      {
        sum=t+b+h;
     System.out.printf("%.2f",sum);
      }
      if(type.equals("MGSDS"))
      {
        sum=(float)(1.5*t)+b;
        System.out.printf("%.2f",sum);
      }
      if(type.equals("MGSH"))
      {
        sum=(float)(1.5*t)+h;
        System.out.printf("%.2f",sum);
    }
}
}