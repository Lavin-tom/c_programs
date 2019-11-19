
  #include<stdio.h>
int main()
{
  int n,x,b,large,i;
  scanf("%d",&n); 
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  large = a[0];
 
        for (i = 1; i < n; i++) 
        {
		if (large < a[i])
		{
			large = a[i];
       
  }
        }
         printf("%d",large);

  return 0;
}