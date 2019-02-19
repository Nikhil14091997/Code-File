#include<stdio.h>
#include<conio.h>
void main()
{
    int a[10],num,i,n,beg,mid,end;
    printf("\n Enter the number of elements in the array::");
    scanf("%d",&n);
    printf("\n Enter the ellements of the array::");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n Enter the target element to be searched::");
    scanf("%d",&num);
    beg = 0;
    end = n-1;
    while(beg<end)
    {
        mid = (beg+end)/2;
        if(a[mid]==num)
        {
            printf("Element found in the given array!!");
            printf("%d",mid+1);
            break;
        }
        else if(a[mid]>num)
            end = mid-1;
        else if(a[mid]<num)
            beg = mid+1;
            else
        printf("\n Number does not exist");
}
        printf("\n element not found");
}
