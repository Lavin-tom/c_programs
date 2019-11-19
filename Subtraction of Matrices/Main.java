#include<stdio.h>
int main()
{ 
  int r;
  int c;
  scanf("%d", &r);
  scanf("%d", &c);
  int matrix1[r][c];
  int matrix2[r][c];
  int matrix3[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &matrix1[i][j]);
   }
  }for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &matrix2[i][j]);
   }
  }
   for(int i = 0; i < c; i++)
  {
   for(int j = 0; j < r; j++)
   {
       matrix3[i][j]=matrix1[i][j]-matrix2[i][j];
    printf("%d ",matrix3[i][j]);
   }
   printf("\n");
  }
}
