#include <stdio.h>
int main() {
	int a,b,n,p=1;
  scanf("%d",&n);
  for(a=1;a<=n;a++)
  {
    p=p*a;
  }
      printf("%d",p);
	return 0;
}