#include<stdio.h>
int main()
{
  int a,s;
  scanf("%d",&a);
  s=(a%4);
  if (s==0)
  {
  printf("Leap year");
  }
  else
  {
  printf("Not Leap year");
  }
  return 0;
}