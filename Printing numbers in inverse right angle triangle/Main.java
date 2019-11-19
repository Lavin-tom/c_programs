#include <stdio.h>
int main()
{
    int i, j,n;
    scanf("%d",&n);
    for(i=n; i>=1;i--)
    {
        for(j=i; j>=1;j--)
        {
          
          //x=r-j+1;
            printf("%d",j);
        }
        printf("\n");
    }
    return 0;
}