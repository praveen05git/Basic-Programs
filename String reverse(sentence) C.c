#include <stdio.h>
#include <string.h>

void reverse(char str[])
{
    int length=strlen(str);
    int i;
    
    for(i=length-1;i>=0;i--)
    {
        if(str[i]==' ')
        {
            str[i]='\0';
            
            printf("%s ",&(str[i]) + 1); //prints from 5th+1 element till the end
          
        }
    }
    
    printf("%s",str);
}

void main()
{
   char str[]="I AM A GEEK";
   
   reverse(str);
 
}