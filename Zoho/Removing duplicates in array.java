import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        int[] arr={1,1,2,3};
        
        ArrayList<Integer> arrList=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(!(arrList.contains(arr[i])))
            {
                arrList.add(arr[i]);
            }
        }
        
        System.out.println(arrList);
        
     }
}
