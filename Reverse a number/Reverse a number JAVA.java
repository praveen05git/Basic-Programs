public class HelloWorld{

     public static void main(String []args){
        int numb=123,rev,temp;
        
        while(numb>0)
        {
            temp=numb%10;
            rev=rev*10+temp;
            numb=numb/10;
        }
        
        System.out.println(numb);
     }
}

/*
OUTPUT:
321
*/
