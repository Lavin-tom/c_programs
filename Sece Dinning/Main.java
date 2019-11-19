import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a;
      String b;
      Scanner s=new Scanner(System.in);
      b=s.nextLine();
      a=s.nextInt();
      if(b.equals("front")) 
         {
            if(a==1)
      System.out.println("Left Handed");
         
        else 
          
       System.out.println("Right Handed");
         }
          if(b.equals("rear"))
           {
              if(a==1) 
        System.out.println("Right Handed");  
      else
      System.out.println("Left Handed");
         }
         }
	}
