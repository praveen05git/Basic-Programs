public class Largest
{
  public static void main(String[] args) {
		int a[]={1,2,7,4,5};
		
		int max=a[0];
		
		for(int i=1;i<5;i++)
		{
		    if(max<a[i])
		    {
		        max=a[i];
		    }
		}
		
		System.out.println(max);
	}
}
