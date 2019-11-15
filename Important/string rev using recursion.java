import java.util.*;

public class HelloWorld{
    
    public static String rev(String s)
    {
        if(s.length()==1)
        {
            return s;
        }
    
        else
        {
            s=s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
        
            return s;
        }
    }

    public static void main(String []args)
    {
        String st=("Hello World");
        
        System.out.println(rev(st));
     }
     
}
