import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
         int arr[]={10, 5, 11, 6, 20, 12};
         
         int[] dup=Arrays.copyOf(arr,arr.length);
         
         Arrays.sort(dup);
         
         
         Map<Integer,Integer> greater=new HashMap<>();
         
         for(int i=0;i<arr.length-1;i++)
         {
            greater.put(dup[i],dup[i+1]);  
         }
         
         greater.put(dup[arr.length-1],-1);
         
         for(int j=0;j<arr.length;j++)
         {
             System.out.println(greater.get(arr[j]));
         }
         
         System.out.println(greater);
       
     }
}

/*
OUTPUT:
11 6 12 10 -1 20
*/

/*
https://www.geeksforgeeks.org/find-closest-greater-value-for-every-element-in-array/

https://www.geeksforgeeks.org/zoho-interview-experience-set-15-off-campus-drive/
*/
