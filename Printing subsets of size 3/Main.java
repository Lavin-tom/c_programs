#include <stdio.h>
int main()
{
    int b,i,j,k,n;
   scanf("%d",&n);
       int a[n];
       for(i = 0; i < n; i++)
       {
           scanf("%d",&a[i]);
       }
       
    for(i=0; i<n-1; i++)
    {
      
        for(j=i+1; j<n; j++)
        {
          
            for(k=j+1; k<n; k++)
            {
              
                printf("(%d, %d, %d) ", a[i], a[j],a[k]);
              
            }
        }
      printf("\n");      
    }
  
   return 0;
}