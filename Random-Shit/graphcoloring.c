#include<stdio.h>
#include<conio.h>
int g[10][10],n,x[10],m;
void mcolouring(int,int);
void nextvalue(int,int);

void main()
{
    int i,j;
    printf("\n Enter the no. of nodes:");
    scanf("%d",&n);
    m=n-1;
    for(i=1;i<=n;i++)
    {

        x[i] = 0;
    }
    printf("\n Enter the bolean adjancy matrix:");
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            scanf("%d",&g[i][j]);
        }
    }

    // algorithm of graph colouring function mcoloring

    mcolouring(1,n);

        printf("\n the vertices are coloured as:");
        for(i=i;i<=n;i++)
        {
            printf("\n %d:%d",i,x[i]);
        }


}

void mcolouring(int k,int n)
{
    int i;
    nextvalue(k,n);
    if(x[k]==0)
        return;
    else if(k==n)
    {

        for(i=1;i<=n;i++)
            printf("%d :",x[i]);
    }
    else
        mcolouring(k+1,n);
}

void nextvalue(int k,int n)
{

    do
    {

        int j;
        int a,b;
        a = x[k]+1;
        b = m+1;
        x[k] = a%b;
        if(x[k]==0)
            return;
        for(j=1;j<=n;j++)
        {
            if(g[k][j]==1&&x[k]==x[j])
                break;
        }
        if(j==n+1)
            return;
    }
    while(1);
}
