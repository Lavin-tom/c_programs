#include <stdio.h>
 main()
{
  int n;
   scanf("%d",&n);
   while(n>99){
     n=n/10;}
   n=n%10;
    printf(" %d",n);
}