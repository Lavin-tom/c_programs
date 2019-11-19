import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float x,y,cost,prof;
      Scanner s = new Scanner(System.in);
      x=s.nextFloat();
      y=s.nextFloat();
      cost=12*y;
      prof=x-cost;
      if(x<cost)
        System.out.printf("profit :Rs.%.2f",prof);
      if(x>cost)
        System.out.printf("Loss : Rs.%.2f",prof);
      if(x==cost)
        System.out.printf("No profit nor loss");
      
    }
}