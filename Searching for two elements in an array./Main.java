#include<stdio.h>
int main()
{
    
    int n,x,b,q=0,w=0;
  scanf("%d",&n); 
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&x,&b);
  for(int i=0;i<n;i++)
  {
    if(x==a[i])
    {
      printf("%d\n",i);
      q=1;
    }
     if(b==a[i])
    {
      printf("%d\n",i);
       w=1;
    }
  }
    if(q==0)
      
      printf("-1");
    
  
    
      if(w==0)
      
      printf("-1");

  return 0;
}