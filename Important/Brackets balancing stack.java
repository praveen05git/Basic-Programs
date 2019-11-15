import java.util.*;
import java.io.*;

public class HelloWorld{

     public static void main(String []args){
        
        Stack<Character> bracket_stack=new Stack<>();
        
        String s="{[(])}";
        
        bracket_stack.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
            {
                bracket_stack.push(s.charAt(i));
            }
            
            else if(s.charAt(i)==']')
            {
                if(bracket_stack.peek()=='[')
                    bracket_stack.pop();
                
                else
                {
                    System.out.println("Unbalanced");
                    break;
                }
                
            }
            
            else if(s.charAt(i)=='}')
            {
                if(bracket_stack.peek()=='{')
                    bracket_stack.pop();
                
                else
                {
                    System.out.println("Unbalanced");
                    break;
                }
                
            }
            
            else if(s.charAt(i)==')')
            {
                if(bracket_stack.peek()=='(')
                    bracket_stack.pop();
                
                else
                {
                    System.out.println("Unbalanced");
                    break;
                }
                
            }
            
        }
        
        System.out.print(bracket_stack.empty()? "Balanced":"");
        
     }
}
