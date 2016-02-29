#include<stdio.h>
int main()
{   int i,j,k;
    int arr[3][3];
    int brr[3][3];
    int crr[3][3]={0,0,0,0,0,0,0,0,0};
    
    for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {  
            scanf("%d",crr[i][j]);
            
            }
            printf("\n");
     }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
             for(k=0;k<3;k++)
                {
                    crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]);
                }
        }
    }
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {  
            printf("%d\t",crr[i][j]);
            
            }
            printf("\n");
     }
}
