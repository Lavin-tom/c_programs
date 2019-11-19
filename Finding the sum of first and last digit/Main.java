#include <stdio.h>
int main() 
{
int n,a,b,c;
scanf("%d",&n);
  b=n%10;
while(n>=10)
{
     n=n/10;
   }
a=b+n;
    printf(" %d",a);
	return 0;
}