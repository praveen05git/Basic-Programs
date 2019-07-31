// C program to reverse a string using recursion 
# include <stdio.h> 
#include <string.h>

void reverse(char *str) 
{ 

if (*str) 
{ 
	reverse(str+1); 
	printf("%c", *str); 
} 
} 

int main() 
{ 
char a[] = "geeks"; 
reverse(a); 
return 0; 
}

/*
OUTPUT:
skeeg
*/
