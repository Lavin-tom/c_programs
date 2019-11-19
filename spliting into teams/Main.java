import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int a,b,c,d;
  Scanner s=new Scanner (System.in);
  a=s.nextInt();
  b=s.nextInt();
  c=a/b;
  d=a%c;
  System.out.println("The number of students in each team is "+c+" and left out is "+d);
}
}