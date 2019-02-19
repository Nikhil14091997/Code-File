// binary search
#include<stdio.h>
#include<conio.h>
void main()
{

    int a[100],n,target,i,beg,end,mid;
    printf("\n Enter the number of elements:");
    scanf("%d",&n);
    printf("\n Enter the elements of array:");
    for(i=0;i<n;i++)
    {

        scanf("%d",&a[i]);

    }
    printf("\n Enter the target element :");
    scanf("%d",&target);
    beg = 0;
    end = n-1;
    while(beg<end)
    {
        mid = (beg+end)/2;
        if(a[mid]==target)
        {

            printf("\n Element found");
            printf("%d",mid+1);
            break;
        }

        else if(a[mid]>target)
            end = mid-1;
        else if(a[mid]<target)
            beg = mid+1;


    }
if(beg>end)
        printf("\n  not exixt!!");


    getch();
}
