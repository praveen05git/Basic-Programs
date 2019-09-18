import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        String s,temp;
        Scanner sc=new Scanner(System.in);
        
        s=sc.next();
        
        temp=s.substring(0,1);
        for(int i=1;i<s.length();i++)
        {
            if(!((s.substring(i,i+1)).equals(temp.substring(temp.length()-1))))
            {
                temp=temp+s.substring(i,i+1);
            }

            
        }
        System.out.println(temp);
     }
}

/*
INPUT:
aabc

OUTPUT:
abc
*/
