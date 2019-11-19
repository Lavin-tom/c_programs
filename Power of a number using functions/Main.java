#include <stdio.h>
int main()
{
    int b,e,r=1;
    scanf("%d %d", &b,&e);
   
    while (e != 0)
    {
        r *= b;
        --e;
    }
    printf("%d",r);
    return 0;
}