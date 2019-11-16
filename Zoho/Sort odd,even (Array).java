import java.util.*; 

public class GFG { 

	static void change(int arr[], int n) 
	{ 
	    
		ArrayList<Integer> evenArr = new ArrayList<Integer>(); 
		ArrayList<Integer> oddArr = new ArrayList<Integer>();  

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
		
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=evenArr.get(j);
		    arr[i+1]=oddArr.get(j);
		    i++;
		    j++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	} 


	public static void main(String[] args) 
	{ 
		int arr[] = { 2,5,4,1,0,3 }; 
		int n = arr.length; 
		change(arr, n); 
	
	} 
} 

/*
OUTPUT: 0 5 2 3 4 1
*/
