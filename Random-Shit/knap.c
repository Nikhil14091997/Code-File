#include<stdio.h>
#include<conio.h>
void knapsack(int n,float weight[],float profit[],float capacity)
{
    float x[100];
    float u;
    float tp=0;
    int i;
    u= capacity;
    for(i=0;i<n;i++)
        x[i]=0.0;
    for(i=0;i<n;i++)
    {

        if(weight[i]>u)
            break;
        else
            {
                x[i]=1.0;
                u=u-weight[i];
                tp=tp+profit[i];
            }
    }
    if(i<n)

        x[i] = u/weight[i];
        tp = tp + (x[i]*profit[i]);
        for(i=0;i<n;i++)
        printf("\n resultant is:: %f",x[i]);
        printf("\n tp:%f",tp);


}
void main()
{

    int n,i,j;
    float weight[100];
    float profit[100];
    float ratio[100];
    float capacity;
    float temp;
    printf("\n Enter the number of objects:");
    scanf("%d",&n);
    printf("\n Enter matrix:");
    for(i=0;i<n;i++)
        scanf("%f%f",&weight[i],&profit[i]);
        printf("\n Enter the capacity of knapsack::");
        scanf("%f",&capacity);
        for(i=0;i<n;i++)
            ratio[i] = profit[i]/weight[i];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(ratio[i]<ratio[j])
                    {
                         temp = ratio[j];
                         ratio[j] = ratio[i];
                         ratio[i] = temp;

                         temp = weight[j];
                         weight[j] = weight[i];
                         weight[i] = temp;

                         temp = profit[j];
                         profit[j] = profit[i];
                         profit[i] = temp;
                    }

                }
            }
            knapsack(n,weight,profit,capacity);
}
