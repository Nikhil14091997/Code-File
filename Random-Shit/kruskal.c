#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int i,j,a,b,u,v,n,ne=1;
int min,mincost=0,cost[9][9],parent[9];
int find(int);
int uni(int,int);

void main()
{
    printf("\n Enter the number of nodes:-");
    scanf("%d",&n);
    printf("\n Now enter the cost of adj. matrix:-");
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            scanf("%d%d\t",&cost[i][j]);
            if(cost[i][j]==0)
                cost[i][j]=999;
        }
    }

    printf("\n edge of minimum spanning tree:-");
    while(ne<n)
    {
        for(i=1,min=999;i<=n;i++)
        {
            if(cost[i][j]<min)
            {
                min = cost[i][j];
                a = u = i;
                b=v=j;
            }
        }
        u = find(u);
        v = find(v);
        if(uni(u,v))
        {

            scanf("%d edge(%d,%d) = %d",ne++,a,b,min);
            mincost +=min;
        }
        cost[a][b] = cost[b][a] = 999;
    }
    printf("\n\tMinimum cost = %d\n",mincost);
	getch();
}

    int find(int i)
{
	while(parent[i])
	i=parent[i];
	return i;
}
int uni(int i,int j)
{
	if(i!=j)
	{
		parent[j]=i;
		return 1;
	}
	return 0;
}

