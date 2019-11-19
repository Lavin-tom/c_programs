#include <stdio.h>
int main() 
{
	int n,c,r,s;
  scanf("%d",&n);
 s = n;
  for (r = 1; r <= n; r++) 
  {
    for (c = 1; c < s; c++)  
      printf(" ");
    s--;
    for (c = 1; c <= 2*r - 1; c++) 
      printf("*");
    printf("\n");
  }
        return 0;
}