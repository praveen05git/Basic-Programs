import java.util.*;

public class solution
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        String str="hello.world";
        
        String[] s=str.split("[, ?.@]+"); 
        //str.split("[.]"); 
        //str.split("[@]"); is also working within []
        
        String result="";
        
        System.out.println(s.length);
        
        for(int i=s.length-1;i>=0;i--)
        {
            if(i==0)
                result=result+s[i];
            else
                result=result+s[i]+".";
        }
        
        System.out.println(result);
    }
}
