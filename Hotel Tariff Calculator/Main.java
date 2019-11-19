import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	    int m,d;
      float r,sum;
     Scanner s=new Scanner(System.in);
     m=s.nextInt();
      r=s.nextFloat();
      d=s.nextInt();
      
      switch(m)
      {
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
        case 10:
          sum=(float)r*d;
          System.out.printf("%.2f",sum);
          break;
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
          sum=(float)(r+(r*.2))*d;
          System.out.printf("%.2f",sum);
          break;
      
       default:
         System.out.printf("Invalid Input");
	}
}
}