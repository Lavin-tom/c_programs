#include<stdio.h>
int S_Functions(int N);
int main()
{
  int n,N, i, s = 0;
  scanf("%d", &N);
  
  s = S_Functions(N);
  //if
  printf("%d", s);
  return 0;
}

int S_Functions(int N)
{
	int i, Sum = 0;
	if (N == 0)
	{
		return N;
	}
	else
	{
		return (N* (N + 1) / 2);
	}
	
}