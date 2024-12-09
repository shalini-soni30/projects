#include <stdio.h>
#include <stdlib.h>

/*int main()
{// 5! = 5*4*3*2*1;
    int i,n,fact=1;
    printf("Enter number\n");
    scanf("%d",&n);
    for(int i=n; i>0; i--)
    {
        fact=fact*i;
    }
    printf("%d",fact);
    return 0;
}*/
/// using recurrsion
int factorial(int fact){
     if(fact<=1)
        return 1;
         return fact*factorial(fact-1);
    }
int main()
{// 5! = 5*4*3*2*1;
    int n;
    printf("Enter number\n");
    scanf("%d",&n);
 // int factno=factorial(n);
    printf("%d",factorial(n));
    // printf("hello");
    return 0;
}
