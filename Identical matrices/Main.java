#include<stdio.h>
int main()
{
    int n1;
    int n2;
  int flag=0;
    scanf("%d", &n1);
    scanf("%d", &n2);
   // scanf("%d", &c);
    int matrix1[n1][n1];
    int matrix2[n2][n2];
    
    for(int i = 0; i < n1; i++)
    {
      for(int j = 0; j < n1; j++)
      {
        scanf("%d", &matrix1[i][j]);
      }
    }
    
    for(int i = 0; i < n2; i++)
    {
      for(int j = 0; j < n2; j++)
      {
        scanf("%d", &matrix2[i][j]);
      }
    }
    
    for(int i=0; i<n1; i++)
    {
      for(int j=0; j<n1; j++)
      {
    
          if(matrix1[i][j]==matrix2[i][j])
       flag=1;
        else
        flag=0;
      }
    }
  if(flag == 1)
        printf("Yes");
  if(flag == 0)
    printf("No");
}