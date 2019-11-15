import java.util.*;
import java.io.*;

public class HelloWorld{
    
    public static int top=0;

     public static void main(String []args){
        
        
        String s="[([)]]";
        
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                top=top+1;
            }
            
            if(s.charAt(i)=='(')
            {
                top=top+1;
            }
            
            if(s.charAt(i)==')')
            {
                top=top-1;
            }
            
            if(s.charAt(i)==']')
            {
                top=top-1;
                
            }
            
            System.out.println(s.charAt(i));
            System.out.println(top);
        
        }
        
        
        
        if(top==0)
        {
        System.out.println("Balanced");
        }
        else
        System.out.print("Unbalanced");
        
     }
}
