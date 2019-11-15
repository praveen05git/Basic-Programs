import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        String s="aaabb";
        int count=0;
        HashMap<Character,Integer> freqMap=new HashMap<Character,Integer>();
        
    
        for(int i=0;i<s.length();i++)
        {
            if(freqMap.keySet().contains(s.charAt(i)))
            {
                freqMap.put(s.charAt(i),freqMap.get(s.charAt(i))+1);
            }
            
            else
            {
                freqMap.put(s.charAt(i),1);
            }
        }
    
        System.out.println(freqMap);
     }
}
