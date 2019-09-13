#include<stdio.h>
int fact(int n)
{
  return (n==1 || n == 0) ? 1 : n * fact(n -1);
  /*assume n = 3;
   3 != 0 -> return 3 * 2 -> 6
   2 != 0 -> return 2 * 1
   1 != 0 -> return 1 * fact(0) => return 1 * 1 -> 1*/
}
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",fact(n));
  return 0;
}