#include <stdio.h> 
int main()
{
   int i,j,n,t,k,count;
scanf("%d",&n);
scanf("%d",&k);
   int a[n] ;
for(i=0;i<n;i++)
   {
   scanf("%d",&a[i]);
   }
   
 
   for(i=1;i<=k;i++)
   {
        count=0;
       for(j=0;j<n;j++)
       {
           if(i==a[j])
           count++;
       }
   
   printf("%d %d\n",i,count);}
   
   //for(i=0;i<n;i++)
   //printf("%d ",a[n-k]);
return 0;
} 