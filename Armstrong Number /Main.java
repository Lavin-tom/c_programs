#include <stdio.h>
int main() {
	int n,b,a,r,s;
  scanf("%d",&n);
  for(a=n;n!=0;n=n/10){
         r=n%10;
         s=s+(r*r*r);
    }
    if(s==a)
         printf("Armstrong Number");
    else
         printf("Not an Armstrong Number");
	return 0;
}