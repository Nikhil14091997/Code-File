//binary
#include<stdio.h>
#include<conio.h>
void main()
{

    int i,beg,end,target;
    int n;
    int found;
    int a[100];
    int mid;
    printf("\n Enter the numnerr of numbers::");
    scanf("%d",&n);
    printf("\n enter the rray elements::");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        printf("\n the array elements are::");
        for(i=0;i<n;i++)
        printf("%d",a[i]);
        printf("\n Enter the target element to search::");
        scanf("%d",&target);
        beg=0;
        end=n-1;
        while(beg<end)
        {
            mid=(beg+end)/2;
            if(target==a[mid])
            {


                printf("\n Element found");
                found=1;
                break;
            }
            else if(beg<a[mid])
                    end=mid-1;
                else //if(beg>mid)
                    beg=mid+1;


        //break;
        }
        if(beg>end||found==0)
                printf("\n element not found");
}
