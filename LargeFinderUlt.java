package practice;
import java.util.Scanner;

public class LargeFinderUlt {
	public static void main(String args[])
	{
		int numbers[]= {64,69,26,4,31,94,74,5,63,27};  // Initializing numbers in array
		Scanner sc=new Scanner(System.in);
		System.out.println("TO FIND LARGEST Press-1 ELSE Press-2");
		int check=sc.nextInt();
		while(check==1)
		{
			int index=0;
			int largest=numbers[0];
			for(int i=0;i<numbers.length;i++)      // running loop for all numbers
				{
					if(largest<numbers[i])             // condition to find largest number 
						{
							largest=numbers[i];
							index=i;
						}
					else 
						{
							continue;
						}
				}
		System.out.println("LARGEST NUMBER IS -> "+largest);    // printing largest number 
		System.out.println("TO FIND NEXT LARGEST Press-1 ELSE Press-2");     // asking user to find next largest 
		int ch=sc.nextInt();                                                   //   number in array  
		if(ch==2)
		{
			System.out.println("PROCESS COMPLETE");        // exitting loop once process complete
 			check=ch;
		}
		else if (ch==1)
		{
			numbers[index]=0;          // turning largest value to zero so that next largest can be finded 
		}
		}
		if (check==2)
			System.out.println("PROCESS DECLINED");    
		else
			System.out.println("INVALID RESPONSE");
		sc.close();
	}
}
