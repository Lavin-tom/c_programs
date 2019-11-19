import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int l1,l2,l3,n;
      Scanner s=new Scanner(System.in);
      l1=s.nextInt();
      l2=s.nextInt();
      l3=s.nextInt();
      n=s.nextInt();
     if(l1<n && l2<n && l3>n )
          System.out.println("L3");
       
      if(l1>n && l2<n && l3<n)
        System.out.println("L1");
      
        if(l1<n && l2>n && l3<n)
          System.out.println("L2");
 
      if(l1>n && l2>n && l3<n)
      {
        if(l1>l2)
        System.out.println("L2");
        else
         System.out.println("L1"); 
        
      }
       if(l2>n && l3>n && l1<n)
      {
        if(l2>l3)
        System.out.println("L3");
     
        else
         System.out.println("L2"); 
         
      }
 	if(l3>n && l1>n && l2<n)
      {
        if(l1>l3)
        System.out.println("L3");
        else
         System.out.println("L1"); 
      
    }
       if(l1>n && l2>n && l3>n)
     {
       if(l1<l2 && l2<l3)
         System.out.println("L1");
       else if (l2<l3)
         System.out.println("L2");
        else
         System.out.println("L3");
     }
      
    }
}