import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      if(n==100)
        System.out.println("S");
      if(n>90 && n<99)
        System.out.println("A");
      if(n>80 && n<89)
        System.out.println("B");
      if(n>70 && n<79)
        System.out.println("C");
      if(n>60 && n<69)
        System.out.println("D");
      if(n>50 && n<59)
        System.out.println("E");
      if(n<50)
        System.out.println("F");
    }
}