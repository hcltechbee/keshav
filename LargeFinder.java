package practice;

public class LargeFinder {
	public static void main(String args[])
	{
		int numbers[]= {64,64,26,4,31,64,74,5,63,27};  // Initializing numbers in array
		int largest=numbers[0];
		for(int i=0;i<numbers.length;i++)      // running loop for all numbers
		{
			if(largest<numbers[i])             // condition to find largest number 
			{
				largest=numbers[i];
			}
			else 
			{
				continue;
			}
		}
		System.out.println("LARGEST NUMBER IS -> "+largest);
	}

}
