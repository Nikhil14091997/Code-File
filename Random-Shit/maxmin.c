#include<stdio.h>
#include<conio.h>
void main()
{
    int max,min,a[100],n,i;
    printf("\n Enter athe no of value to compare:");
    scanf("%d",&n);
    printf("\n Enter the elements of the array:");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
   max = a[0];
   min =a[0];
   for(i=0;i<n;i++)
   {
       if(a[i]>max)
        max = a[i];
       if(a[i]<min)
        min = a[i];
   }
   printf("\n max::%d",max);
   printf("\n min::%d",min);
}
