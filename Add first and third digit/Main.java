#include<stdio.h>
int main()
{
  int a,s;
  scanf("%d",&a);
  s=(a%10)+(a/100);
  printf("%d",s);
  return 0;
}