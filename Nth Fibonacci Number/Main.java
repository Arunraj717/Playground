#include<stdio.h>
int fib(int n)
{
  int t1 = 0, t2 = 1, nextTerm = 0, i;
  if(n == 0 || n == 1)
    return 1;
  else
  {
nextTerm = t1 + t2;
for(i = 3; i <= n; ++i)
{
  t1 = t2;
  t2 = nextTerm;
  nextTerm = t1 + t2;
}
    return t2;
  }
}
int main()
{
  int n;//nth fibonacci number to be printed
  scanf("%d",&n);
  printf("%d",fib(n));
  return 0;
}