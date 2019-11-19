
#include <stdio.h>
#include<string.h>
 
int main(void)
{
	int i,j,L,k;
	char str[100],ch[100];
	scanf("%[^\n]s",str);				

	L = strlen(str);			
	k = 0;	
	
	for(i=L-1;i>=0;i--)		
	{
	    if(str[i] == ' ')  
	    {
	        for(j=k-1;j>=0;j--)
	        {
	            printf("%c",ch[j]);
	        }
	        printf(" ");
	        k=0;
	    }
	    else
	    {
	        ch[k] = str[i];
	        k++;
	    }
	}
	if(k != 0)
	{
	    for(j=k-1;j>=0;j--)
	    {
	        printf("%c",ch[j]);
	    }
	}

	return 0;
}