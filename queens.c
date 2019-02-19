// queens
#include<stdio.h>
#include<conio.h>
#include<math.h>
void nqueen(int,int);
int place(int,int);
int n,x[100];
void main()
{
   // int n;

    printf("\n Enter the number of queens");
    scanf("\n %d",&n);
    nqueen(1,n);
}
void nqueen(int k,int n)
{
    int i,l;
    for(i=1;i<=n;i++)
    {
        if(place(k,i))
        {


            x[k]=i;
        if(k==n)
        {
            printf("\n Solution:");
            for(i=1;i<=n;i++)
            {
                for(l=1;l<x[i];l++)
                    printf("*");
                printf("Q");
                for(l=x[i+1];l<=n;l++)
                    printf("*");

            }
                printf("\n");
        }
        else
        nqueen(k+1,n);
    }

}
}
int place(int k,int i)
{

    int j;
    //int n;
    for(j=1;j<=k-1;j++)
    {
        if((x[j]==i)||(abs(x[j]-i)==abs(j-k)))
            return 0;
    }
    return 1;
}
