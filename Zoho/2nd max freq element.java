import java.util.*;
import java.util.Map.Entry;
public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        
        int[] arr={1,5,4,4,1,4};
       
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],(map.get(arr[i]))+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        System.out.println(map);

    
        int max_val=Integer.MIN_VALUE;
        int sec_max_val=Integer.MIN_VALUE;
        int max_key=0,sec_max_key=0;
        
        for(Entry<Integer,Integer> elements:map.entrySet())
        {
            if(elements.getValue()>max_val)
            {
                sec_max_val=max_val;
                sec_max_key=max_key;
    
                max_val=elements.getValue();
                max_key=elements.getKey();
                
                
            }
            
            else if(elements.getValue()>sec_max_val && elements.getValue()!=max_val)
            {
                sec_max_val=elements.getValue();
                sec_max_key=elements.getKey();
            }
        }
        
        System.out.println("max_val="+max_val);
        System.out.println("sec_max_val="+sec_max_val);
        System.out.println("max_key="+max_key);
        System.out.println("sec_max_key="+sec_max_key);
        
        System.out.println("Second maximum element:"+sec_max_key);
        
        
     }
}

/*
INPUT: 1 2 1 1 4 2
OUTPUT: 2 
2 occurs 2 times
1 occurs 3 times
*/
