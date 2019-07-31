import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        String temp="";
        for(int i=len-1;i>=0;i--)
        {
            temp=temp+s.charAt(i);
        }
        
        System.out.println(temp);
	}
}

/*
INPUT:
HELLO

OUTPUT:
OLLEH

For other types:
https://www.geeksforgeeks.org/reverse-a-string-in-java/

*/
