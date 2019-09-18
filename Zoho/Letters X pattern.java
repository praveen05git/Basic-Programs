import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        String input=sc.next();
        int k=1;
        
        for(int i=0;i<input.length();i++)
        {
            for(int j=0;j<input.length();j++)
            {
                 if(j==i || j==input.length()-k)
                {
                    System.out.print(input.charAt(i));    
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            
            k++;
            System.out.println("");
            
        }
        
        
        
     }
}

INPUT:
HELLO
