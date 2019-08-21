/*
QUESTION:
https://prepinsta.com/tcs-digital-advanced-coding-question-0/
*/

#include <stdio.h>
int main()
{
    int n,i,j;
    scanf("%d",&n);
    int a[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
            scanf("%d",&a[i][j]);
    } 
    int min=a[0][0];
    i=0,j=0;
    while(i<n && j<n)
    {
        if(i==n-1 && j==n-1)
        break;
        if(j!=(n-1) && i!=(n-1) && a[i][j+1]<a[i+1][j])
        {
            if(a[i][j]>a[i][j+1])
            {
                min=a[i][j];
                printf("%d\n",min);
                j++;
            }
            else
            {
                min=a[i][j+1];
                printf("%d\n",min);
                j++;
            }
        }
        else if( j!=(n-1) && i!=(n-1) && a[i+1][j]<a[i][j+1])
        {
            if(a[i][j]>a[i+1][j])
            {
                min=a[i][j];
                printf("%d\n",min);
                i++;
            }
            else
            {
                min=a[i+1][j];
                printf("%d\n",min);
                i++;
            }
        }
        if(j==n-1)
        {
            if(a[i+1][j]>min)
            {
                min=a[i+1][j];
                printf("%d\n",min);
                i++;
            }
            else
            {
                // min=a[i][j];
                printf("%d\n",min);
                i++;
            }
        }
        else 
        {
            if(i==n-1)
            {
                if(a[i][j+1]>min)
                {
                    min=a[i][j+1];
                    printf("%d\n",min);
                    j++;
                }
                else
                {
                    // min=a[i][j];
                    printf("%d\n",min);
                    j++;
                }
            }
        }
    }

printf("%d",min);
return 0;

}

/*
INPUT:

4
1 8 21 7 19 17 10 20 2 18 23 22 14 25 4 13

OUTPUT:

8
17
17
20
22
22
22

*/
