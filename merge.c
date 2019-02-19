//mergeSort
#include<stdio.h>
#include<conio.h>
void main()
{

    int n,i,arr[100];
    //int b[100];
    printf("\n enter no. of elements:");
    scanf("%d",&n);
    printf("\n Enter elements::");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
         printf("\n Array after sorting::");
    mergesort(arr,0,n-1);

    for(i=0;i<n;i++)
        printf("%d",arr[i]);
}
mergesort(int arr[],int p,int q)
{
    int mid;
    if(p<q)
    {
        mid=(p+q)/2;
        mergesort(arr,p,mid);
        mergesort(arr,mid+1,q);
        merging(arr,p,mid,q);
    }
}
int merging(int arr[],int p,int mid,int q)
{

    int l1,l2,i;
    //int b[100];
    for(l1=p,l2=mid+1,i=p;l1<=mid,l2<=q;i++)
    {

        if(arr[l1]<=arr[l2])
        {

        i++;
            arr[i]=arr[l1];
        }
            else{
                    i++;
                arr[i]=arr[l2];
            }
    }
    while(l1<=mid)
        arr[i++]=arr[l1++];
    while(l2<=q)
        arr[i++]=arr[l2++];

    for(i=p;i<=q;i++)
        arr[i]=arr[i];
        return 0;
}
