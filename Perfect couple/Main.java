#include <stdio.h>
int main()
{
    int b,sum=0,i,j,n,flag=0;
 
   scanf("%d",&n);
       int a[n];
       for(i = 0; i < n; i++)
       {
           scanf("%d",&a[i]);
       }
       scanf("%d",&b);
    for(i=0; i<n-1; i++)
    {
        for(j=i+1; j<n; j++)
        {
            if(b == (a[i] + a[j]))
            {
                printf("Perfect couple: %d %d", a[i], a[j]); 
              flag=1;
            }
        }
    }
  if(flag==0)
  {
    printf("No perfect couple found!");
  }
   return 0;
}