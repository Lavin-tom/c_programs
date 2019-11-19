#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
  char t[100],w[10],rp[10];
  char str[10][10];
  
  int i=0,j=0,k=0;
  int p,z;
  
      gets(t);
      //scanf("%s",t);
      scanf("%s",w);
      scanf("%s",rp);
      
      p=strlen(t);
      
      for (k=0; k<p; k++)
      {
        if (t[k]!=' ')
        {
          str[i][j] = t[k];
          j++;
        }
        else
        {
          str[i][j]='\0';
          
          j=0; i++;
        }
      }
  str[i][j]='\0';
  z=i;
  
  for (i=0; i<=z; i++)
  {
    if(strcmp(str[i],w)==0)
    
      strcpy(str[i],rp);
    printf("%s ",str[i]);
  }
  
  return 0;
}