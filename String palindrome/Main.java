
#include <stdio.h>
#include <string.h>
int main()
{
    int j,i,flag=1;
  char str[20];
  scanf("%s", str);
  int strnlen = strlen(str);
  j=strnlen-1;
  while(strnlen>=i)
  {
      if(str[i]==str[j])
      {
      i++;
      j--;
      }
      else
      {
          flag=0;
          break;
      }
  }
      if(flag==1)
      printf("%s is a palindrome",str);
      else
      printf("%s is not a palindrome",str);
      
return 0;      
  }

