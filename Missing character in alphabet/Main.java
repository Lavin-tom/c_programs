#include <stdio.h>
#include <string.h>
int main()
{
    
 char s[100],t[100];
 int n,i,k,j;
 
scanf("%[^\n]s",s);
 n=strlen(s);
 for(i=0; i<26; i++)
  {
       t[i] = 'a'+i;
   }
   t[i]='\0';
for (int i = 0; i < 26; ++i) 
       {
for (int j = 0; j < n; ++j) 
       {
     if(t[i]==s[j])
     {
         t[i]='0';
     }
       }
                  
       }
       for (int i = 0; i < 26; ++i) 
       {
           if(t[i]!='0')
           printf("%c ",t[i]); 
       }
  return 0;
}