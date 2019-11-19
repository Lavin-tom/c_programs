#include <stdio.h>
int main()
{
int r,c;
scanf("%d", &r);
  scanf("%d", &c);
int flag = 0;
int mat[r][c];
int i, j,k=0;
for(i = 0; i < r; i++)
{
  for(j = 0; j < c; j++)
  
       scanf("%d",&mat[i][j]);
}


for(i=0;i<r;i++)
{
    for(j=0,k=i;k<c;j++,k++)
    //if((i==j)||(i==i+2))
    printf("%d ",mat[j][k]);
    //printf("\n");
}
return 0;
}