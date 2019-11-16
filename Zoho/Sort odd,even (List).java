import java.util.*; 

public class GFG { 

	static void change(int arr[], int n) 
	{ 
	    
		ArrayList<Integer> evenArr = new ArrayList<Integer>(); 
		ArrayList<Integer> oddArr = new ArrayList<Integer>();  
		ArrayList<Integer> resArr=new ArrayList<Integer>();


		for (int i = 0; i < n; i++) { 
			if (i % 2 == 0) { 
				evenArr.add(arr[i]); 
			} 
			else { 
				oddArr.add(arr[i]); 
			} 
		} 

		Collections.sort(evenArr); 
		Collections.sort(oddArr, Collections.reverseOrder()); 
		
		for(int i=0;i<arr.length/2;i++)
		{
		    resArr.add(evenArr.get(i));
		    resArr.add(oddArr.get(i));
		}
		
		System.out.println(resArr);
		
	} 


	public static void main(String[] args) 
	{ 
		int arr[] = { 2,5,4,1,0,3 }; 
		int n = arr.length; 
		change(arr, n); 
	
	} 
} 
