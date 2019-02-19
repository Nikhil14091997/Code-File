//maximum minimum
#include<stdio.h>
#include<conio.h>
void main()
{
    int arr[100],i;
    int n,max,min;
    printf("\n enter the number of elements to compare::");
    scanf("%d",&n);
    printf("\n enter the array elements :");
    for(i=0;i<n;i++)
    {


        scanf("%d",&arr[i]);

    }
    for(i=0;i<n;i++)
    printf("\n Element %d::%d",i,arr[i]);
    if(i==-1)
        printf("\n no elements in the array");
    max=0;
    min=0;
    for(i=0;i<n;i++)
    {
        if(arr[i]>max)
            max=arr[i];

    }
    printf("\n maximum is:%d",max);

    for(i=0;i<n;i++)
    {
        if(arr[i]<min)
            min=arr[i];

    }
    printf("\n minimum is:%d",min);
}
