#include <stdio.h>
int main() 
{
	int n,r,c;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  {
    for(c=1;c<=r;c++)
    {
      if (r>n)
      printf("%d",r);
     // else
        printf("%d",r);
    }
    printf("\n");
  }
  	return 0;
}