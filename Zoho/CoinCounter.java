import java.util.*;
public class CoinCounter{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int count,total=0;
        
        int[] values=new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        
        for (int i=0;i<9;i++)
        {
            count=0;
            
            while(((total+values[i])<num) || ((total+values[i])==num))
            {
                    total=total+values[i];
                    count=count+1;    
            }
            
            
            System.out.println(values[i]+" : "+count);
            
            
        }
        
     }
}

/*
Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1
*/

//https://www.geeksforgeeks.org/zoho-interview-experience-set-42off-campus/
//https://www.geeksforgeeks.org/zoho-interview-experience-set-37-java-developer/
