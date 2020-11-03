package practice3;

public class UsingString {
	public static void main(String []args)
	{
		String exe="Hello how are you";
		exe=exe.concat(" KESHAV CHOUDHARY");     // to concatenate elements
		System.out.println(exe);        
		System.out.println(exe.length());    // to count length of string
		System.out.println(exe.substring(18,34));       // for printing a part of string
        String ex="Hello how are you KESHAV CHOUDHARY";
		if(exe.equals(ex))                                 // for checking equals operator
        {
        	System.out.println("BOTH STRINGS ARE EQUAL");
        }
		else
		{
			System.out.println("BOTH ARE NOT EQUAL");
		}
	}

}
