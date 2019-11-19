#include<stdio.h>
#include<string.h>

int main()
 {
  int i,j,r=1,flag=0;
  char temp[100];
  char a[100];
  char b[100];

  scanf("%s %s",a,b);
  
int L1 = strlen(a);
int L2 = strlen(b);

while(r!=L1)
{
    for(i=0;i<L1;i++)
    
    {
    j=(i+r)%L1;
    temp[j]=a[i];
    }

if(strcmp(temp,b)==0)
{
    flag=1;
    break;
}
r++;
}
if(flag==1)
{
    printf("Yes");
}
else
{
    printf("No");
}
return 0;
}