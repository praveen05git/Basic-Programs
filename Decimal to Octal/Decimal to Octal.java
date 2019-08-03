import java.*; 

class Ocatl
{ 

	static void decToOctal(int n) 
	{ 
		// array to store octal number 
		int[] octalNum = new int[100]; 

		// counter for octal number array 
		int i = 0; 
		while (n != 0) 
		{ 
			// storing remainder in octal array 
			octalNum[i] = n % 8; 
			n = n / 8; 
			i++; 
		} 

		// Printing octal number array in reverse order 
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(octalNum[j]); 
	} 
	
	public static void main (String[] args) 
	{ 
		int n = 33; 
		decToOctal(n); 
	} 
} 
