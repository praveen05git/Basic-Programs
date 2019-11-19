public class HelloWorld{

     public static void main(String []args){
        // 1,2,3,4,5,6,7
        int leaf=7;
        int n=2,m=3,p=5;
        int count=0;
        
        for(int i=1;i<=7;i++)
        {
            if(!(i%n==0 || i%m==0 || i%p==0))
            {
                count+=1;
            }
        }
        
        System.out.println(count);
     }
}
