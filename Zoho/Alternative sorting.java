import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        int [] arr={1, 12, 4, 6, 7, 10,9};
        int i=0,j=arr.length-1;
        
        List<Integer> aList=new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        
        while(i<j)
        {
            aList.add(arr[j--]);
            aList.add(arr[i++]);
        }
        
        if(arr.length%2!=0)
        {
            aList.add(arr[i]);
        }
        
        System.out.println(aList);
        
     }
}

/*
INPUT: 1 2 3 4
OUTPUT:4 1 3 2
*/
