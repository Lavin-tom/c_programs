
  #include<stdio.h>
int main()
{
  int n,x,sum=0,i,b=0;
  scanf("%d",&n); 
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int q=n/2;
  for(i=0;i<q;i++)
  {
      sum = sum + a[i];
  }
  for(i=q;i<n;i++)
  {
      b=b+a[i];
  }
  //x=sum+b;
  if(sum==b)
  {
      printf("Perfect Batch");
  }
  else
  {
   printf("Not a Perfect Batch");   
  }
  return 0;
}