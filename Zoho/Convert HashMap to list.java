import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        Map<String,Integer> FreqMap=new HashMap<>();
        
        FreqMap.put("One",1);
        FreqMap.put("Two",2);
        FreqMap.put("Three",3);
        
        ArrayList<String> KeyArr=new ArrayList<>();
        ArrayList<Integer> ValueArr=new ArrayList<>();
        
        for(String element : FreqMap.keySet())
        {
            
            KeyArr.add(element);
            ValueArr.add(FreqMap.get(element));
            
        }
        
        System.out.println(KeyArr);
        System.out.println(ValueArr);
        
     }
}
