#include <stdio.h> 
int main()
{
   int i,j,n,t,k;
scanf("%d",&n);

   int a[n] ;
for(i=0;i<n;i++)
   {
   scanf("%d",&a[i]);
   }
   scanf("%d",&k);
   for(i=0;i<n;i++)
   {
       for(j=i+1;j<n;j++)
       {
           if(a[i]>a[j])
           {
           t = a[j];
           a[j] = a[i];
           a[i] = t;
           }
       }
   }
   
   
   //for(i=0;i<n;i++)
   printf("%d ",a[n-k]);
return 0;
} 