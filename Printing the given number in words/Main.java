#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  switch(a)
  {
      case 1:
      //if(a==1)
        printf("One");
      break;
      case 2:
      if(a==2)
        printf("Two");
      break;
      case 3:
      //if(a==3)
        printf("Three");
      break;
      case 4:
      if(a==4)
        printf("Four");
      break;
      case 5:
      if(a==5)
        printf("Five");
      break;
  default:
        printf("Invalid");
  }
     return 0;
}