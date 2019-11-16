import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        int[] arr=new int[]{1,4,5,3,2};
        int m=4;
              
        Map<Integer,Integer> Icemap=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(Icemap.containsKey(arr[i]))
            {
                System.out.println(Icemap.get(arr[i])+" "+(i+1));
                break;
            }
            
            Icemap.put(m-arr[i],i+1);
        }
     }
}
